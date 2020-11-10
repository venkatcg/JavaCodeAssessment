package com.ing.moviesubscription.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.moviesubscription.model.Role;
@Repository
@Transactional
public interface RoleRepository extends CrudRepository<Role, Integer> {
public Role findByRole(String role);
}