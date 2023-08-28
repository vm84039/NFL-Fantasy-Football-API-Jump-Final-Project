package com.cognixia.jump.service;

import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;




@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	
	public User getPrincipalUser() {
	    
	    return repo.findEnabled().get(0); // Cookie not found or user ID not available
	}
	public Integer getPrincipalUserId()
	{
		return repo.findEnabled().get(0).getId();
		
	}
	
	public User getUserById(Integer id) {
		
		Optional<User> cust = repo.findById(id);
		return cust.get();
	}
	 @Transactional
	public void resetEnabledFlags() {
        Iterable<User> users = repo.findAll();
        for (User user : users) {
            repo.disableUserById(user.getId());
        }
    }



}
