package com.spring.backend.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Person")
@Entity
public class Person implements Serializable {
	
private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional =false)
	@Column(name = "id_per")
	private int id;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "apellido")
	private String lastname;
	
	@Column(name = "cedula")
	private String numberCI;
	
	@Column(name = "celular")
	private String phone;
	
	@Column(name = "ciudad")
	private String city;
	
	public Person() {
		super();
	}


	public Person(int id, String name, String lastname, String numberCI, String phone, String city) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.numberCI = numberCI;
		this.phone = phone;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getNumberCI() {
		return numberCI;
	}


	public void setNumberCI(String numberCI) {
		this.numberCI = numberCI;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
