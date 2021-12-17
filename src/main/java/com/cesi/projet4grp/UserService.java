package com.cesi.projet4grp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cesi.projet4grp.UserRepository;
import com.cesi.projet4grp.User;

import lombok.Data;

@Data
@Service
public class UserService {
	
    @Autowired
    private UserRepository userRepository;
    
    public  Optional<User> getUser(final Long id) {
        return userRepository.findById(id);
    }

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(final Long id) {
    	userRepository.deleteById(id);
    }

    public   User saveUser(User user) {
    	User savedEmployee = userRepository.save(user);
        return savedEmployee;
    }
    
}
