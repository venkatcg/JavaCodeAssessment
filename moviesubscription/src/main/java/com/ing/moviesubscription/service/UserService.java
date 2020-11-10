package com.ing.moviesubscription.service;

import com.ing.moviesubscription.model.User;
public interface UserService {
	public User findByUserIdPasswordEmail(String email,String password) ;
public User saveUser(User user);
}