package com.cesi.projet4grp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "FAMILY")
public class Family {
	
	  	@Id
	    @JsonProperty("id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  	
	    @JsonProperty("name")
	    private String name;
	    
	    
	    @OneToMany(mappedBy = "familyId")
	    private Set<Product> products = new HashSet<>();
	    
}
