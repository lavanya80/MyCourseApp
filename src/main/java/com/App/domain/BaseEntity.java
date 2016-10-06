package com.App.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements  Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private LocalDateTime CreatedAt;
	private LocalDateTime ChangedAt;
	
	
	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}
	public LocalDateTime getChangedAt() {
		return ChangedAt;
	}
	public void setChangedAt(LocalDateTime changedAt) {
		ChangedAt = changedAt;
	}

}
