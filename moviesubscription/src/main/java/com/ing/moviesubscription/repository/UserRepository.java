package com.ing.moviesubscription.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.moviesubscription.model.User;
@Repository
@Transactional()
public interface UserRepository extends CrudRepository<User, Integer> {
	 @Query("SELECT user FROM User user  WHERE user.email=?1 and user.password=?2")
	public User findByUserIdPasswordEmail(String email,String password);
}