package com.joel.reto.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joel.reto.models.User;
import com.joel.reto.services.UserService;

@RestController()
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	UserService userservice;
	
	
	@GetMapping("/usuario")
	public ArrayList<User> getUsers() {
		return userservice.geUsers();
	}
	
	
	@PostMapping("/usuario")
	public User saveUser (@RequestBody User user) {
		return this.userservice.saveUser(user);
	}
	
	//@GetMapping({"/usuario/{id}"})
	//public Optional<User> getUserById(@PathVariable("id") Integer id){
	//	return this.userservice.getUser(id);
	//}
	
	@GetMapping({"/usuario/{name}"})
	public User getUserName(@PathVariable("name") String name){
		return this.userservice.getUserByName(name);
	}
	
	@DeleteMapping({"/usuario/{id}"})
	public String deleteById(@PathVariable("id") Integer id) {
		boolean ok = this.userservice.deleteUser(id);
		if(ok) {
			return "Se elimino correctamente";
		}else {
			return "Error al eliminar";
		}
	}
}
