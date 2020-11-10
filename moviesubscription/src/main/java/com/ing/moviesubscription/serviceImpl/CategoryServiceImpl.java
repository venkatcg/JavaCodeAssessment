package com.ing.moviesubscription.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.moviesubscription.model.Category;
import com.ing.moviesubscription.model.Movie;
import com.ing.moviesubscription.repository.CategoryRepository;
import com.ing.moviesubscription.service.CategoryService;
 
@Service
 
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
 
    public List getAllCategories() {
        List categories = new ArrayList();
        categoryRepository.findAll().forEach(category -> categories.add(category));
        return categories;
    }
 
    public Category getcategoryById(int id) {
        return categoryRepository.findById(id).get();
    }
 
    public void saveOrUpdate(Category category) {
    	categoryRepository.save(category);
    }
 
    public void delete(int id) {
    	categoryRepository.deleteById(id);
    }

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
 