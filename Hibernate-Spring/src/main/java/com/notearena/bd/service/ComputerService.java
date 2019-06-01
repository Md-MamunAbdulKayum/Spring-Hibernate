package com.notearena.bd.service;

import java.util.List;

import com.notearena.bd.entity.Computer;

public interface ComputerService {
	
	public void addComputer(Computer computer);

	public List<Computer> getAllComputers();

	public void deleteComputer(Integer userId);

	public Computer Computer(int userId);

	public Computer updateComputer(Computer computer);
}
