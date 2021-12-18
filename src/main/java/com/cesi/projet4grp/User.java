package com.cesi.projet4grp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {
	
	  	@Id
	    @JsonProperty("id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  	
	    @JsonProperty("mail")
	    private String mail;
	    
	    @JsonProperty("password")
	    private String password;
	    
	    @JsonProperty("role")
	    private int role;

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getRole() {
			return role;
		}

		public void setRole(int role) {
			this.role = role;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	    
	    
	    
}
