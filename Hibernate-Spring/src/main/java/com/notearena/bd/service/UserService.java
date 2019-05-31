/**
 * 
 */
package com.notearena.bd.service;

import java.util.List;

import com.notearena.bd.entity.User;



/**
 * @author Sourav
 *
 */
public interface UserService {
  
	public void addUser(User user);

	public List<User> getAllUser();

	public void deleteUser(Integer userId);

	public User getUser(int userId);

	public User updateUser(User user);
}
