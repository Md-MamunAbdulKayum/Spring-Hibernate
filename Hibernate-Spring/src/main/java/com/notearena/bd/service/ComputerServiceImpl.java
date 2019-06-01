package com.notearena.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.notearena.bd.dao.ComputerDAO;
import com.notearena.bd.entity.Computer;

@Service("computerService")
@Transactional
public class ComputerServiceImpl implements ComputerService {

	@Autowired
	private ComputerDAO computerDAO;  
	
	public void addComputer(Computer computer) { 
		computerDAO.addComputer(computer);
	}

	public List<Computer> getAllComputers() { 
		return computerDAO.getAllComputer();
	}

	public void deleteComputer(Integer computerId) {
		computerDAO.deleteComputer(computerId);
		
	}

	public Computer Computer(int computerId) {
		return computerDAO.getComputerr(computerId);
	}

	public Computer updateComputer(Computer computer) {
		return computerDAO.updateComputer(computer);
	}

	

}
