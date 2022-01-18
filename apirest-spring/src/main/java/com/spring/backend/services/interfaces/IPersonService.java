package com.spring.backend.services.interfaces;

import java.util.List;

import com.spring.backend.models.Person;



public interface IPersonService {
	
	public int save(Person person);
	
	public Person guardar(Person person);
	
	public Person findById(int id);
	
	public void delete(int id);
	
	public List<Person> findAll();

	
	
}
