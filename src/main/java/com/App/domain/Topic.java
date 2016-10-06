package com.App.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "topics", schema = "mycourseapp")
public class Topic extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long TId;
	private Long TDuration;
	private String TName;

	@ManyToOne
	@JoinColumn(name = "CId")
	private Course course;

	public Long getTId() {
		return TId;
	}

	public void setTId(Long tId) {
		TId = tId;
	}

	public Long getTDuration() {
		return TDuration;
	}

	public void setTDuration(Long tDuration) {
		TDuration = tDuration;
	}

	public String getTName() {
		return TName;
	}

	public void setTName(String tName) {
		TName = tName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
