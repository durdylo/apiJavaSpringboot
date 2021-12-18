package com.cesi.projet4grp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
	
	 public static final ProviderRepository providerRepository = null;


	   
}
