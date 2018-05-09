package com.example.dao;

import java.util.Collection;

import com.example.model.Complain;

public interface ComplainDAO {
	public Collection<Complain> findAll();
	
	public Complain find(int id);
	
//	After Tutorial
	public void delete(int id);
	
	public void saveProduct(Complain product);
	
	public void saveComplain(Complain complain);
	
	public void edit(Complain product);
}
