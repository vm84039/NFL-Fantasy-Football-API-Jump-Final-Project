package com.cognixia.jump.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static enum Role {
		ROLE_USER, ROLE_ADMIN	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// unique and not null username
	@Column(unique = true, nullable = false)
	@NotBlank
	private String username;
	
	@Column(nullable = false)
	@NotBlank
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Role role;
	
	@Column( columnDefinition = "boolean default true" )
	private boolean enabled; // true

	
	public User() {
		
	}

	public User(Integer id, @NotBlank String username, @NotBlank String password, Role role, boolean enabled) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
	}
	public User( @NotBlank String username, @NotBlank String password, Role role, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", enabled="
				+ enabled + "]";
	}
    public void setPlainPassword(String plainPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(plainPassword);
        this.password = hashedPassword;
    }
}




