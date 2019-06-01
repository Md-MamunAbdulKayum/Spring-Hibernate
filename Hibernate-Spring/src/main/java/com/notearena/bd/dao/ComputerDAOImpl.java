package com.notearena.bd.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.notearena.bd.entity.Computer;


@Repository
public class ComputerDAOImpl implements ComputerDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void addComputer(Computer computer) {
		sessionFactory.getCurrentSession().saveOrUpdate(computer);
		
	}

	@SuppressWarnings("unchecked")
	public List<Computer> getAllComputer() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Computer").list();
	}

	public void deleteComputer(Integer computerId) {
		 Computer computer = (Computer) sessionFactory.getCurrentSession().load(
				 Computer.class, computerId);
		if (null != computer) {
			this.sessionFactory.getCurrentSession().delete(computer);
		}
		
	}

	public Computer updateComputer(Computer computer) {
		sessionFactory.getCurrentSession().update(computer);
		return computer;
	}

	public Computer getComputerr(int computerId) {
		return (Computer) sessionFactory.getCurrentSession().get(
				Computer.class, computerId);
	}
	
	
}
