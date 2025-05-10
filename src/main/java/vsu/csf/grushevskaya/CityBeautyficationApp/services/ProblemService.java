package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.ProblemTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.ProblemWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.ProblemRepositoryInterface;

@Service
public class ProblemService {
    private ProblemRepositoryInterface problemRepository;

    public ProblemService(ProblemRepositoryInterface problemRepository) {
        this.problemRepository = problemRepository;
    }

    public Problem save(ProblemWithNoIdTO problemWithNoIdTO) {
        return problemRepository.save(new Problem(problemWithNoIdTO));
    }

    public Problem save(Problem problem) {
        return problemRepository.save(problem);
    }

    public ProblemTO getById(Integer id) {
        Problem temp = problemRepository.getById(id);
        ProblemTO res = new ProblemTO(temp);
        return res;
    }

    public List<Problem> findByTitle(String title) {
        return problemRepository.getAllByTitle(title);
    }

    public List<Problem> findByCategory(Integer categoryId) {
        return problemRepository.getAllByCategoryId(categoryId);
    }

    public void delete(Integer id) {
        problemRepository.deleteById(id);
    }

}
