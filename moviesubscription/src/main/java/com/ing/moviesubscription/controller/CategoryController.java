package com.ing.moviesubscription.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.moviesubscription.model.Category;
import com.ing.moviesubscription.service.CategoryService;
 
@RestController
@RequestMapping("/categories")
public class CategoryController {
 
    @Autowired
    CategoryService categoryService;
 
    @GetMapping("/getAll")
    private List getAllCategories() {
        return categoryService.getAllCategories();
    }
 
    @GetMapping("/category/{id}")
    private Category getCategory(@PathVariable("id") int id) {
        return categoryService.getCategoryById(id);
    }
 
    @DeleteMapping("/category/{id}")
    private void deleteCategory(@PathVariable("id") int id) {
    	categoryService.delete(id);
    }
 
    @PostMapping("/saveCategory")
    private int saveCategory(@RequestBody Category category) {
    	categoryService.saveOrUpdate(category);
        return category.getCategoryId();
    }
}
 