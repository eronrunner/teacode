package com.runner.teacode.data.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.*;

import org.springframework.http.converter.json.GsonBuilderUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ACCOUNT", catalog = "teacode", schema = "teacode")
public class Account implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 629320625990022476L;

	@Id
	@Column(name = "USERNAME", nullable = false, length = 60, unique = true, updatable = false)
	private String username;
	
	@Column(name = "PASSWORD", nullable = false, columnDefinition="TEXT")
	private String password;
	
	@Column(name = "REGISTERED_EMAIL", nullable = false, length = 300, unique = true, columnDefinition="TEXT")
	private String registeredEmail;
	
	@Column(name = "TYPE", nullable = false, length = 3)
	private Short type;
	
	@Column(name = "AVATAR", nullable = true, length = 65535, columnDefinition="TEXT")
	private String avatar;
	
	@Column(name = "STATE", nullable = false, length = 3)
	private Short state;
	
	@OneToMany(mappedBy = "account", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH}, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Member> members = new ArrayList<Member>();

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String username, String password, String registeredEmail, Short type, Short state , String avatar) {
		super();
		this.username = username;
		this.password = password;
		this.registeredEmail = registeredEmail;
		this.type = type;
		this.state = state;
		this.avatar = avatar;
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

	public String getRegisteredEmail() {
		return registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Short getState() {
		return state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	public String Gson() {
		return GsonBuilderUtils.gsonBuilderWithBase64EncodedByteArrays().create().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avatar == null) ? 0 : avatar.hashCode());
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((registeredEmail == null) ? 0 : registeredEmail.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Account other = (Account) obj;
		if (avatar == null) {
			if (other.avatar != null)
				return false;
		} else if (!avatar.equals(other.avatar))
			return false;
		if (members == null) {
			if (other.members != null)
				return false;
		} else if (!members.equals(other.members))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (registeredEmail == null) {
			if (other.registeredEmail != null)
				return false;
		} else if (!registeredEmail.equals(other.registeredEmail))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
