package com.spring.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.dao.IPerson;
import com.spring.backend.models.Person;
import com.spring.backend.services.interfaces.IPersonService;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private IPerson dao;
	
	public PersonService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int save(Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return (List<Person>) dao.findAll();
	}

	@Override
	public Person guardar(Person person) {
		// TODO Auto-generated method stub
		return dao.save(person);
	}

}
