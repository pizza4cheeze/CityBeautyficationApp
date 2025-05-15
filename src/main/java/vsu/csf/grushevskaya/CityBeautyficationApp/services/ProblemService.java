package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ProblemWithNoIdTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.ProblemRepository;

@Service
public class ProblemService {
    private ProblemRepository problemRepository;
    private ExifService exifService;
    private CategoryService categoryService;

    public ProblemService(ProblemRepository problemRepository, ExifService exifService, CategoryService categoryService) {
        this.problemRepository = problemRepository;
        this.exifService = exifService;
        this.categoryService = categoryService;
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
