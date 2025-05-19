package vsu.csf.grushevskaya.CityBeautyficationApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.CategoryTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.services.CategoryService;

import java.util.List;

@RestController
@RequestMapping(path = "/category")
public class CategoryController {
    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path = "/get-all")
    public List<CategoryTO> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
