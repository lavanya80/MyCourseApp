package com.App.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.domain.User;
import com.App.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	
	
	public User save(User user) throws Exception{
		return userrepository.save(user);
	}
	
	public List<User> findall(User user) throws Exception{
		return userrepository.findAll();
	}
	
	public User findUserbyName(String UserName) throws Exception{
		return userrepository.findOne(UserName);
	}

	public void delete(String UserName) throws Exception{
		userrepository.delete(UserName);
	}
}
