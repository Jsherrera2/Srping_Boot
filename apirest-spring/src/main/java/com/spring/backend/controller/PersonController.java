package com.spring.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.models.Person;
import com.spring.backend.services.interfaces.IPersonService;



@RestController
//@RequestMapping("/api/person")
public class PersonController {
	
	
	@Autowired
	private IPersonService service;
	
	@GetMapping("/person")
	public String listar(Model model) {
		List<Person> person = service.findAll();
		model.addAttribute("person",person);
		return "index";
	}
	
	
	@GetMapping("/form")
	public String mostrarFormularioDeRegistrtarEstudiante(Model modelo) {
		Person estudiante = new Person();
		modelo.addAttribute("estudiante", estudiante);
		return "CreateUser";
	}

	@PostMapping("/create")
	public String guardarEstudiante(@ModelAttribute("person") Person estudiante) {
		//service.guardarEstudiante(estudiante);
		service.guardar(estudiante);
		return "redirect:/index";
	}

	public PersonController() {
		// TODO Auto-generated constructor stub
	}

}
