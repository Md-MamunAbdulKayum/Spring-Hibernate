package com.notearena.bd.dao;

import java.util.List;

import com.notearena.bd.entity.Computer;


public interface ComputerDAO {
	public void addComputer(Computer computer);
	
	public List<Computer> getAllComputer();

	public void deleteComputer(Integer computerId);

	public Computer updateComputer(Computer computer);

	public Computer getComputerr(int computerId);
}
