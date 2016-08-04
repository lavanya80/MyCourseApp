package com.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.domain.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer> {
	
	
	
}
