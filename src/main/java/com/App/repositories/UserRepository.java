package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.domain.User;

public interface UserRepository extends JpaRepository<User,String> {
	
	

}
