package com.cesi.projet4grp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
}
