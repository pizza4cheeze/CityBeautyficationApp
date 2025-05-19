package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;

import java.util.List;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer> {
    Problem save(Problem problem);
    Problem getById(Integer id);
    List<Problem> getAllByTitleContainsIgnoreCase(String title);
    List<Problem> getAllByCategoryId(Integer categoryId);
    void deleteById(Integer id);
}
