package com.cesi.projet4grp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cesi.projet4grp.User;
import com.cesi.projet4grp.UserRepository;

@RestController
public class FamilyController {
	
	  @Autowired
	  private FamilyService familyService;

  
	@GetMapping("/familys")
    public Iterable<Family> getFamilys() {
        return familyService.getFamilys();
    }
	
	@RequestMapping(path="/family/{family_id}", method = RequestMethod.GET)
    Optional<Family> getKey(@PathVariable Long family_id) {


    return familyService.getFamily(family_id);
	}
	
	@DeleteMapping(value = "/family/{id}")
    public void deleteUser(@PathVariable Long id) {

		familyService.deleteFamily(id);

    }
}
