package com.cesi.projet4grp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Long> {
	
	 public static final FamilyRepository familyRepository = null;


	   
}
