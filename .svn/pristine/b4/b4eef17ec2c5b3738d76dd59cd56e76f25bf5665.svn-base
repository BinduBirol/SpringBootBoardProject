package com.example.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Complain;

@Repository
public class ComplainDAOImpl implements ComplainDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Collection<Complain> findAll() {
		return this.jdbcTemplate.query("Select * from product", new BeanPropertyRowMapper<Complain>(Complain.class));
	}

	@Override
	public Complain find(int id) {
		return jdbcTemplate.queryForObject("Select * from product where id = ?", new BeanPropertyRowMapper<Complain>(Complain.class), id);
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update("Delete from product where id = ?", id);
	}

	@Override
	public void saveProduct(Complain product) {
		String sql = "INSERT INTO product "
				+ "(name,quantity, price, description) VALUES (?, ?, ?,?)";
		jdbcTemplate.update(
				sql,
				new Object[] { product.getName(), product.getQuantity(), product.getPrice(), product.getDescription() });
	}
	
	
	
	@Override
	public void saveComplain(Complain complain) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO complain "
				+ "(roll, board, year, reg_no, contact_no, complain, complain_about, complain_to) VALUES (?, ?, ?,?,?,?,?,?)";
		jdbcTemplate.update(
				sql,
				new Object[] { complain.getRoll(), complain.getBoard(), complain.getYear(), complain.getRegNo(), complain.getContactNo(), complain.getComplain(), complain.getComplainAbout(), complain.getComplainTo() });
		
	}

	@Override
	public void edit(Complain product) {
		String sql = "Update product Set name = ?, quantity = ?, price = ?, description = ? where id =  ?";
		jdbcTemplate.update(
				sql,
				new Object[] { product.getName(), product.getQuantity(), product.getPrice(), product.getDescription(), product.getId() });
		
	}
	
	

}
