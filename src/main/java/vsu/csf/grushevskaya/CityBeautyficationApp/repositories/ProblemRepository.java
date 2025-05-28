package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemUserViewTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;

import java.util.List;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer> {
    Problem save(Problem problem);
    Problem getById(Integer id);
    List<Problem> getAllByTitleContainsIgnoreCase(String title);
    List<Problem> getAllByCategoryId(Integer categoryId);
    void deleteById(Integer id);

    @Query("select new vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemUserViewTO(p.id, p.title, p.description, c.name as category, s.name as status, p.lastUpvotedUserId, \n" +
            "p.upvoteAmount, p.authorId, u.username as author_username, u.profilePhoto as author_profile_photo, p.xCoordinate, p.yCoordinate, p.creationDate) \n" +
            "from problems as p\n" +
            "join categories as c on c.id = p.categoryId\n" +
            "join statuses as s on s.id = p.statusId\n" +
            "join users as u on u.id = p.authorId\n" +
            "where p.id = :id")
    ProblemUserViewTO findProblemToUserViewById(@Param("id") Integer id);

    @Transactional
    @Modifying
    @Query("UPDATE problems as p\n" +
            "set p.upvoteAmount = p.upvoteAmount + 1\n" +
            "where p.id = :problemId")
    void incrementUpvoteAmount(@Param("problemId") Integer problemId);
}
