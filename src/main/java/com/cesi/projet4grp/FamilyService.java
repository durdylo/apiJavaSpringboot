package com.cesi.projet4grp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cesi.projet4grp.UserRepository;
import com.cesi.projet4grp.User;

import lombok.Data;

@Data
@Service
public class FamilyService {
	
    @Autowired
    public FamilyRepository familyRepository;
    
    public  Optional<Family> getFamily(final Long id) {
        return familyRepository.findById(id);
    }

    public Iterable<Family> getFamilys() {
        return familyRepository.findAll();
    }

    public void deleteFamily(final Long id) {
    	familyRepository.deleteById(id);
    }

    public Family saveFamily(Family family) {
    	Family savedFamily = familyRepository.save(family);
        return savedFamily;
    }
    
}
