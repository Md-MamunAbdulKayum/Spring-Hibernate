package com.notearena.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notearena.bd.dao.UserDAO;
import com.notearena.bd.entity.User;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO; 
	
	@Transactional
	public void addUser(User user) { 
		userDAO.addUser(user);
	}

	@Transactional
	public List<User> getAllUser() {
		return userDAO.getAllUser();
	}

	@Transactional
	public void deleteUser(Integer userId) {
		userDAO.deleteUser(userId);
		
	}

	public User getUser(int userId) {
		return userDAO.getUser(userId);
	}

	public User updateUser(User user) {
		return userDAO.updateUser(user);
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


}
