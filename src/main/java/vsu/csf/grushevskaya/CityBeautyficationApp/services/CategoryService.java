package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.CategoryTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.models.Category;
import vsu.csf.grushevskaya.CityBeautyficationApp.repositories.CategoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryTO> getAllCategories() {
        return categoryToCategoryTO(categoryRepository.findAll());
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.getById(id);
    }

    private List<CategoryTO> categoryToCategoryTO(List<Category> categories) {
        List<CategoryTO> result = new ArrayList<>();
        for (Category c : categories) {
            result.add(new CategoryTO(c));
        }
        return result;
    }

    public Integer categorizePhoto(String pathToPhoto) {
        Random rnd = new Random();
        return rnd.nextInt(10) + 1;
    }
}
