package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemUserViewTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemWithCommentsTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.upvote.UpvoteWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.*;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.CommentRepository;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.ProblemRepository;

@Service
public class ProblemService {
    private ProblemRepository problemRepository;
    private ExifService exifService;
    private CategoryService categoryService;
    private StatusService statusService;
    private CommentService commentService;
    private UpvoteService upvoteService;

    public ProblemService(ProblemRepository problemRepository, ExifService exifService, CategoryService categoryService,
                          StatusService statusService, CommentService commentService, UpvoteService upvoteService) {
        this.problemRepository = problemRepository;
        this.exifService = exifService;
        this.categoryService = categoryService;
        this.statusService = statusService;
        this.commentService = commentService;
        this.upvoteService = upvoteService;
    }

    public Problem createNew(ProblemWithNoIdTO problemWithNoIdTO) {
        return problemRepository.save(new Problem(problemWithNoIdTO));
    }

//    public Problem createNewByPhoto(ProblemByPhotoTO problemByPhotoTO) {
//        ExifTO exifTO = exifService.extractExifData(problemByPhotoTO.getPathToPhoto());
//
//    }

    public Problem update(Problem problem) {
        return problemRepository.save(problem);
    }

    public ProblemTO getByIdWithoutComments(Integer id) {
        Problem temp = problemRepository.getById(id);
        return new ProblemTO(temp);
    }

    public ProblemWithCommentsTO getByIdWithComments(Integer id) {
        ProblemUserViewTO problemUserViewTO = problemRepository.findProblemToUserViewById(id);
        ProblemWithCommentsTO temp = new ProblemWithCommentsTO(problemUserViewTO, commentService.findCommentsForUserView(id));
        return temp;
    }

    public List<Problem> findByTitle(String title) {
        return problemRepository.getAllByTitleContainsIgnoreCase(title);
    }

    public List<Problem> findByCategory(Integer categoryId) {
        return problemRepository.getAllByCategoryId(categoryId);
    }

    public void delete(Integer id) {
        problemRepository.deleteById(id);
    }

    public Upvote voteForProblem(Integer userId, Integer problemId) {
        return upvoteService.createUpvote(new UpvoteWithNoIdTO(problemId, userId, LocalDateTime.now()));
    }

    public Comment writeACommentForProblem(CommentWithNoIdTO commentWithNoIdTO) {
        return commentService.createComment(commentWithNoIdTO);
    }
}
