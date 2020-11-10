package com.ing.moviesubscription.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.moviesubscription.model.Category;
@Repository
@Transactional
public interface CategoryRepository extends CrudRepository<Category, Integer> {}