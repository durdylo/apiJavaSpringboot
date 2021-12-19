package com.cesi.projet4grp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cesi.projet4grp.User;
import com.cesi.projet4grp.UserRepository;

@RestController
public class ProviderController {
	
	  @Autowired
	  private ProviderService providerService;

  
	@GetMapping("/providers")
    public Iterable<Provider> getProviders() {
        return providerService.getProviders();
    }
	
	@RequestMapping(path="/provider/{provider_id}", method = RequestMethod.GET)
    Optional<Provider> getKey(@PathVariable Long provider_id) {

		return providerService.getProvider(provider_id);
	}
	
	@DeleteMapping(value = "/provider/{id}")
    public void deleteUser(@PathVariable Long id) {

		providerService.deleteProvider(id);

    }
	
	 @PostMapping("/providers")
	 Provider newEmployee(@RequestBody Provider newProvider) {
	    return providerService.saveProvider(newProvider);
	  }
	  
}