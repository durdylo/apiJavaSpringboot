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
@Table(name = "provider")
public class Provider {
  	@Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  	
    @JsonProperty("name")
    private String name;
    
    @OneToMany(mappedBy = "providerId")
    private Set<Product> products = new HashSet<>();
    
}
