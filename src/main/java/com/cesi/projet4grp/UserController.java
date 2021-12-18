package com.cesi.projet4grp;

import java.rmi.ServerException;
import java.util.Optional;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	  @Autowired
	  private UserService userService;

  
	@GetMapping("/users")
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }
	
	@RequestMapping(path="/user/{user_id}", method = RequestMethod.GET)
    Optional<User> getKey(@PathVariable Long user_id) {


    return userService.getUser(user_id);
	}
	
	@DeleteMapping(value = "/user/{id}")
    public void deleteUser(@PathVariable Long id) {

         userService.deleteUser(id);

    }
	
	  @PostMapping("/users")
	  User newEmployee(@RequestBody User newUser) {
	    return userService.saveUser(newUser);
	  }
	  
	  
	  @PutMapping("/user/{id}")
	  User replaceEmployee(@RequestBody User newUser, @PathVariable Long id) {
	    
	    return userService.getUser(id)
	      .map(user -> {
		        user.setMail(newUser.getMail());
		        user.setPassword(newUser.getPassword());
	        user.setRole(newUser.getRole());
	        return userService.saveUser(user);
	      })
	      .orElseGet(() -> {
	    	  newUser.setId(id);
	        return userService.saveUser(newUser);
	      });
	  }
}