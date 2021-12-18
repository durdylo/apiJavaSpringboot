package com.cesi.projet4grp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cesi.projet4grp.User;
import com.cesi.projet4grp.UserRepository;

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
}