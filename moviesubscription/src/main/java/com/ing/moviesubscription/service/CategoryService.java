package com.ing.moviesubscription.service;

import java.util.List;

import com.ing.moviesubscription.model.Category;

public interface CategoryService {
		public List getAllCategories() ;
		public Category getCategoryById(int id);
		public void saveOrUpdate(Category category) ;
		public void delete(int id);
	


}
