package com.naveen.jobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.naveen.jobs.model.enums.Role;

@Entity
@Table(name = "T_USER")
public class User {
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_USER")
    @SequenceGenerator(name="T_USER",sequenceName="t_user_id", allocationSize=1)
    private Long id;
	
    @Column(name = "USENAME")
    private String username;
    
    @Column(name = "PASSWORD")
    private String password;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE")
    private Role role;
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}