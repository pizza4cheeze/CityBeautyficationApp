package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Comment;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    Comment save(Comment comment);
    Comment getById(Integer id);
    List<Comment> getAllByProblemId(Integer problemId);
    void deleteById(Integer id);
    void deleteByProblemId(Integer problemId);

    @Query("select new vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentTO(c.id, c.problemId, c.authorId, u.username, u.profilePhoto, c.text, c.publicationTime) from comments as c\n" +
            "join users as u on u.id = c.authorId\n" +
            "where c.problemId = :problemId")
    List<CommentTO> findCommentsForUserView(@Param("problemId") Integer problemId);
}
