package com.cesi.projet4grp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cesi.projet4grp.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	 public static final UserRepository userRepository = null;


	   
}
