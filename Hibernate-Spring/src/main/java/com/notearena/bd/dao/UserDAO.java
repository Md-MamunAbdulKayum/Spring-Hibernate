package com.notearena.bd.dao;

import java.util.List;

import com.notearena.bd.entity.User;


public interface UserDAO {

	public void addUser(User user);
	
	public List<User> getAllUser();

	public void deleteUser(Integer userId);

	public User updateUser(User user);

	public User getUser(int userId);

}
