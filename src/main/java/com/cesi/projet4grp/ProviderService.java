package com.cesi.projet4grp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cesi.projet4grp.UserRepository;
import com.cesi.projet4grp.User;

import lombok.Data;

@Data
@Service
public class ProviderService {
	
	 @Autowired
	 private ProviderRepository providerRepository;
	 
	 
	 public  Optional<Provider> getProvider(final Long id) {
	        return providerRepository.findById(id);
	    }

	    public Iterable<Provider> getProviders() {
	        return providerRepository.findAll();
	    }

	    public void deleteProvider(final Long id) {
	    	providerRepository.deleteById(id);
	    }

	    public Provider saveProvider(Provider provider) {
	    	Provider savedProvider = providerRepository.save(provider);
	        return savedProvider;
	    }
}
