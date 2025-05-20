package vsu.csf.grushevskaya.CityBeautyficationApp.controllers;

import org.springframework.web.bind.annotation.*;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemWithCommentsTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Comment;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Upvote;
import vsu.csf.grushevskaya.CityBeautyficationApp.services.ProblemService;

import java.util.List;

@RestController
@RequestMapping(path = "/problems")
public class ProblemController {
    ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @PostMapping(path = "/add-new")
    public Problem addNewProblem(@RequestBody ProblemWithNoIdTO problemWithNoIdTO) {
        return problemService.createNew(problemWithNoIdTO);
    }

//    @PostMapping(path = "/add-new")
//    public Problem addNewProblem(@RequestBody String pathToPhoto) {
//        return problemService.createNew()
//    }

    @PutMapping(path = "/update")
    public Problem updateProblem(@RequestBody Problem problem) {
        return problemService.update(problem);
    }

    @GetMapping(path = "/get-without-comments/{id}")
    public ProblemTO getProblemById(@PathVariable Integer id) {
        return problemService.getByIdWithoutComments(id);
    }

    @GetMapping(path = "/{id}")
    public ProblemWithCommentsTO getProblemWithCommentsById(@PathVariable Integer id) {
        return problemService.getByIdWithComments(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteProblem(@PathVariable Integer id) {
        problemService.delete(id);
    }

    @GetMapping(path = "/category/{categoryId}")
    public List<Problem> findProblemsByCategory(@PathVariable Integer categoryId) {
        return problemService.findByCategory(categoryId);
    }

    @GetMapping(path = "/search")
    public List<Problem> findProblemsByTitle(@RequestBody String title) {
        return problemService.findByTitle(title);
    }

    @PostMapping(path = "/vote/{userId}/{problemId}")
    public Upvote voteForProblem(@PathVariable Integer userId, @PathVariable Integer problemId) {
        return problemService.voteForProblem(userId, problemId);
    }

    @PostMapping(path = "/comment")
    public Comment writeAComment(@RequestBody CommentWithNoIdTO commentWithNoIdTO) {
        return problemService.writeACommentForProblem(commentWithNoIdTO);
    }
}
