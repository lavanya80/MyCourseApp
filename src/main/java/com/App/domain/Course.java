package com.App.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CId;
	private String CName;
	private String CDes;
	private Long CDuration;
	private String CPreq;
	private String CSkillLevel;
	private LocalDateTime CreatedAt;
	private LocalDateTime ChangedAt;

	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private Set<Topic> topics;

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "courses_users", joinColumns = @JoinColumn(name = "CId"), inverseJoinColumns = @JoinColumn(name = "UserName"))
	private Set<User> users;

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

	public String getCSkillLevel() {
		return CSkillLevel;
	}

	public void setCSkillLevel(String cSkillLevel) {
		CSkillLevel = cSkillLevel;
	}

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

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
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
		result = prime * result + ((CDes == null) ? 0 : CDes.hashCode());
		result = prime * result + ((CDuration == null) ? 0 : CDuration.hashCode());
		result = prime * result + ((CId == null) ? 0 : CId.hashCode());
		result = prime * result + ((CName == null) ? 0 : CName.hashCode());
		result = prime * result + ((CPreq == null) ? 0 : CPreq.hashCode());
		result = prime * result + ((CSkillLevel == null) ? 0 : CSkillLevel.hashCode());
		result = prime * result + ((ChangedAt == null) ? 0 : ChangedAt.hashCode());
		result = prime * result + ((CreatedAt == null) ? 0 : CreatedAt.hashCode());
		result = prime * result + ((topics == null) ? 0 : topics.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		if (CDes == null) {
			if (other.CDes != null)
				return false;
		} else if (!CDes.equals(other.CDes))
			return false;
		if (CDuration == null) {
			if (other.CDuration != null)
				return false;
		} else if (!CDuration.equals(other.CDuration))
			return false;
		if (CId == null) {
			if (other.CId != null)
				return false;
		} else if (!CId.equals(other.CId))
			return false;
		if (CName == null) {
			if (other.CName != null)
				return false;
		} else if (!CName.equals(other.CName))
			return false;
		if (CPreq == null) {
			if (other.CPreq != null)
				return false;
		} else if (!CPreq.equals(other.CPreq))
			return false;
		if (CSkillLevel == null) {
			if (other.CSkillLevel != null)
				return false;
		} else if (!CSkillLevel.equals(other.CSkillLevel))
			return false;
		if (ChangedAt == null) {
			if (other.ChangedAt != null)
				return false;
		} else if (!ChangedAt.equals(other.ChangedAt))
			return false;
		if (CreatedAt == null) {
			if (other.CreatedAt != null)
				return false;
		} else if (!CreatedAt.equals(other.CreatedAt))
			return false;
		if (topics == null) {
			if (other.topics != null)
				return false;
		} else if (!topics.equals(other.topics))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}

}
