package com.notearena.bd.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notearena.bd.entity.User;



@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
		System.out.println("at getAllUser dao");
		return sessionFactory.getCurrentSession().createQuery("from User")
				.list();
	}

	public void deleteUser(Integer userId) {
		User user = (User) sessionFactory.getCurrentSession().load(
				User.class, userId);
		if (null != user) {
			this.sessionFactory.getCurrentSession().delete(user);
		}
		
	}

	
	public User updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		return user;
	}

	public User getUser(int userId) {
		return (User) sessionFactory.getCurrentSession().get(
				User.class, userId);
	}

	
}
