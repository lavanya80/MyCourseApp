package com.App.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "mycourseapp")
public class User extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private String firstname;
	private String lastname;
	private String pswd;

	private LocalDate dateofbirth;

	@ManyToMany(mappedBy = "users")
	private Set<Course> courses;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + ", pswd=" + pswd
				+ ", dateofbirth=" + dateofbirth + ", courses=" + courses + "]";
	}

	

}
