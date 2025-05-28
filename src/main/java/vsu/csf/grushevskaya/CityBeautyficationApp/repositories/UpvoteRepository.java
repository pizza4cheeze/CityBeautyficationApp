package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Upvote;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface UpvoteRepository extends JpaRepository<Upvote, Integer> {
    Upvote save(Upvote upvote);
    Upvote getById(Integer id);
    List<Upvote> getAllByProblemId(Integer problemId);
    void deleteById(Integer id);

    Upvote findByProblemIdAndUserId(Integer problemId, Integer userId);

    @Modifying
    @Transactional
    @Query("DELETE FROM upvotes u WHERE u.datetimeUpvote < :weekAgo")
    void deleteUpvotesOlderThanAWeek(@Param("weekAgo") LocalDateTime weekAgo);
}
