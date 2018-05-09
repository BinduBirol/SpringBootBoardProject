package com.example.service;

import java.util.Collection;

import com.example.model.Complain;

public interface ComplainService {
	public Collection<Complain> findAll();
	
	//for user's complain
	public Collection<Complain> findUsersComplain();
	
	public Complain find(int id);
	
//	After tutorial
	public void delete(int id);
	
	public void saveComplain(Complain complain);
	
	public void saveProduct(Complain product);
	
	public void edit(Complain product);
}
