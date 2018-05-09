package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ComplainDAO;
import com.example.model.Complain;

@Service
public class ComplainServiceImpl implements ComplainService {

	@Autowired
	private ComplainDAO productDAO;
	
	@Override
	public Collection<Complain> findAll() {
		return this.productDAO.findAll();
	}

	// Nasir on 07052018
	
	@Override
	public Collection<Complain> findUsersComplain() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Complain find(int id) {
		return this.productDAO.find(id);
	}



	@Override
	public void delete(int id) {
		this.productDAO.delete(id);
	}

	@Override
	public void saveProduct(Complain product) {
		this.productDAO.saveProduct(product);
		
	}

	
	@Override
	public void saveComplain(Complain complain) {
		this.productDAO.saveComplain(complain);
		
	}

	@Override
	public void edit(Complain product) {
		this.productDAO.edit(product);
		
	}
	
	

}
