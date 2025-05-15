package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    Comment save(Comment comment);
    Comment getById(Integer id);
    List<Comment> getAllByProblemId(Integer problemId);
    void deleteById(Integer id);
}
