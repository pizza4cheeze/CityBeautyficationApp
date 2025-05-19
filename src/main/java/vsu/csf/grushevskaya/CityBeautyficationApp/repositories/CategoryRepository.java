package vsu.csf.grushevskaya.CityBeautyficationApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findAll();
    Category getById(Integer id);
    Category getByName(String name);
}
