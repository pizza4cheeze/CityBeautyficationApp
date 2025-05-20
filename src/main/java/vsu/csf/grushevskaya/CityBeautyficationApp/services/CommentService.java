package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Comment;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.CommentRepository;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.ProblemRepository;

import java.util.List;

@Service
public class CommentService {
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository, ProblemRepository problemRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment createComment(CommentWithNoIdTO commentWithNoIdTO) {
        return commentRepository.save(new Comment(commentWithNoIdTO));
    }

    public List<Comment> findCommentsForProblem(Integer problemId) {
        return commentRepository.getAllByProblemId(problemId);
    }

    public List<CommentTO> findCommentsForUserView(Integer problemId) {
        return commentRepository.findCommentsForUserView(problemId);
    }

    public void deleteCommentsByProblemId(Integer problemId) {
        commentRepository.deleteByProblemId(problemId);
    }
}
