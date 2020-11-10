package com.ing.moviesubscription.model;

import java.util.List;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "USER_ID")
private int id;
@Column(name = "EMAIL")
private String email;
@Column(name = "PASSWORD")
private String password;
private String name;
private String lastName;
private int active;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public Set<Role> getRoles() {
	return roles;
}
public void setRoles(Set<Role> roles) {
	this.roles = roles;
}

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "USER_ROLE", joinColumns =@JoinColumn(name = "USER_ID"), inverseJoinColumns = { @JoinColumn(name = "ROLE_ID")})
private Set<Role> roles;
}