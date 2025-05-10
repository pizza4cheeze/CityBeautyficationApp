package vsu.csf.grushevskaya.CityBeautyficationApp.controllers;

import org.springframework.web.bind.annotation.*;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.ProblemTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.ProblemWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;
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
        return problemService.save(problemWithNoIdTO);
    }

    @PutMapping(path = "/update")
    public Problem updateProblem(@RequestBody Problem problem) {
        return problemService.save(problem);
    }

    @GetMapping(path = "/{id}")
    public ProblemTO getProblemById(@PathVariable Integer id) {
        return problemService.getById(id);
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
        List<Problem> temp = problemService.findByTitle(title);
        return temp;
    }
}
