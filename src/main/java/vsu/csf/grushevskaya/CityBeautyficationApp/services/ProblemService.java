package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.*;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.upvote.UpvoteWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.exeptions.UpvoteExeption;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Comment;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Upvote;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.ProblemRepository;

import java.time.LocalDateTime;
import java.util.List;

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

    public Upvote voteForProblem(Integer problemId, Integer userId) throws UpvoteExeption {
        if (upvoteService.checkUpvoteExists(problemId, userId)) {
            throw new UpvoteExeption("You already voted for this problem", problemId, userId);
        }
        problemRepository.incrementUpvoteAmount(problemId);
        return upvoteService.createUpvote(new UpvoteWithNoIdTO(problemId, userId, LocalDateTime.now()));
    }

    public Comment writeACommentForProblem(CommentWithNoIdTO commentWithNoIdTO) {
        return commentService.createComment(commentWithNoIdTO);
    }

    public ExifAndCategoryTO extractDataFromPhoto(String pathToPhoto) {
        ExifAndCategoryTO exifAndCategoryTO = exifService.extractData(pathToPhoto);
        exifAndCategoryTO.setCategoryId(categoryService.categorizePhoto(pathToPhoto));
        return exifAndCategoryTO;
    }
}
