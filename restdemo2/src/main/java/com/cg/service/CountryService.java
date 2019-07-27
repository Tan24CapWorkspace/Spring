package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.controller.CountryDAO;
import com.cg.entities.*;

@Service
public class CountryService {
	
	@Autowired
	private CountryDAO dao;

	public List<Country> byContinent(String continent) {
		return dao.findByContinent(continent);
	}

	public Country byCode(String code) {
		return dao.findByCode(code);
	}

	public void create(Country country) {
		Country temp = dao.findByCode(country.getCode());
		if (temp == null) {
			dao.save(country);
		} else
			System.out.println("Country already exists!");
	}

	public void update(Country country) {
		Country temp = dao.findByCode(country.getCode());
		if (temp != null) {
			dao.update(country);
		} else
			System.out.println("Country does not exists!");
	}
}