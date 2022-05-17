package com.epsilon.com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.com.Models.User;
import com.epsilon.com.Repo.UserRepo;



@RestController
public class ApiController {
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/")
	public String getPage() {
		return "welcome";
	}
	
	@GetMapping("/users")
	
	public List<User> getUser() {
		return userRepo.findAll();
	}
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		
		userRepo.save(user);
		return "La requette a bien ete executé";
	}
	
	@PutMapping("update/{id}")
	
	public String updateUser(@PathVariable long id, @RequestBody User user) {
		
		User updateUser =userRepo.findById(id).get();
		updateUser.setFirstname(user.getFirstname());
		updateUser.setLastname(user.getLastname());
		updateUser.setAge(user.getAge());
		updateUser.setOccupation(user.getOccupation());
		
		userRepo.save(updateUser);
		return "Bien mis  a jour";
		
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable long id) {
		User deleteUser =userRepo.findById(id).get();
		userRepo.delete(deleteUser);
		return "Suppression avec Succes";
		
		
	}

}
