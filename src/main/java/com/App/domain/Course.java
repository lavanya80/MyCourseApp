package com.App.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses", schema = "mycourseapp")
public class Course extends BaseEntity {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CId;
	private String CName;
	private String CDes;
	private Long CDuration;
	private String CPreq;
	
	@Enumerated(EnumType.STRING)
	private Skilllevel CSkillLevel;
	
	private String UserName;
	

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private Set<Topic> toipcs = new HashSet<>();

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "courses_users", joinColumns = @JoinColumn(name = "CId"), inverseJoinColumns = @JoinColumn(name = "UserName"))
	private Set<User> users = new HashSet<>();

	public Long getCId() {
		return CId;
	}

	public void setCId(Long cId) {
		CId = cId;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getCDes() {
		return CDes;
	}

	public void setCDes(String cDes) {
		CDes = cDes;
	}

	public Long getCDuration() {
		return CDuration;
	}

	public void setCDuration(Long cDuration) {
		CDuration = cDuration;
	}

	public String getCPreq() {
		return CPreq;
	}

	public void setCPreq(String cPreq) {
		CPreq = cPreq;
	}

	public Skilllevel getCSkillLevel() {
		return CSkillLevel;
	}

	public void setCSkillLevel(Skilllevel cSkillLevel) {
		CSkillLevel = cSkillLevel;
	}

	public Set<Topic> getToipcs() {
		return toipcs;
	}

	public void setToipcs(Set<Topic> toipcs) {
		this.toipcs = toipcs;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CId == null) ? 0 : CId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (CId == null) {
			if (other.CId != null)
				return false;
		} else if (!CId.equals(other.CId))
			return false;
		return true;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	@Override
	public String toString() {
		return "Course [CId=" + CId + ", CName=" + CName + ", CDes=" + CDes + ", CDuration=" + CDuration + ", CPreq="
				+ CPreq + ", CSkillLevel=" + CSkillLevel + ", UserName=" + UserName + "]";
	}
	
		
	

}
