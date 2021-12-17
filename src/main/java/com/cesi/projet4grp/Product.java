package com.cesi.projet4grp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
	
 	@Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 	
    @JsonProperty("name")
    private String name;
    
    
    @JsonProperty("qty")
    private int qty;
    
    
    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family familyId; 
    
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider providerId; 
    
    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private Set<CustomerOrder> orders = new HashSet<>();
}
