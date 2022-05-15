package com.joel.reto.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.reto.models.User;
import com.joel.reto.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userrepo;
	
	public ArrayList<User> geUsers(){
		return (ArrayList<User>) userrepo.findAll();
	}
	
	public User saveUser (User user) {
		return userrepo.save(user);
	}
	
	public Optional<User> getUser(Integer id) {
		return userrepo.findById(id);
	}
	
	public boolean deleteUser(Integer id) {
		try {
			userrepo.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
	
	public User getUserByName(String name) {
		return userrepo.findUserByName(name);
	}
}
