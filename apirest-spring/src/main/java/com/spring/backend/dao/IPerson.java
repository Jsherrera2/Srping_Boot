package com.spring.backend.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.backend.models.Person;



public interface IPerson extends CrudRepository <Person, Integer> {

}
