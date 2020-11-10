package com.ing.moviesubscription.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.moviesubscription.model.Role;
import com.ing.moviesubscription.model.User;
import com.ing.moviesubscription.repository.RoleRepository;
import com.ing.moviesubscription.repository.UserRepository;
import com.ing.moviesubscription.service.UserService;

import java.util.Arrays;
import java.util.HashSet;
@Service
public class UserServiceImpl implements UserService {
private UserRepository userRepository;
private RoleRepository roleRepository;
//private BCryptPasswordEncoder bCryptPasswordEncoder;
@Autowired
public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
    this.userRepository = userRepository;
    this.roleRepository = roleRepository;
  //  this.bCryptPasswordEncoder = bCryptPasswordEncoder;
}
@Override
public User findByUserIdPasswordEmail(String email,String password) {
    return userRepository.findByUserIdPasswordEmail(email,password);
}
@Override
public User saveUser(User user) {
  //  user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	
    user.setActive(1);
    Role userRole = roleRepository.findByRole("ADMIN");
    user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
    return userRepository.save(user);
}
}
