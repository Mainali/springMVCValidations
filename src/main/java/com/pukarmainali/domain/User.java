package com.pukarmainali.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	@Column
	@Size(min=4, max=20)
	private String firstName;
	
	
	@Column
	@NotEmpty
	@Size(min=4, max=20)
	private String lastName;
	
	
	@Column
	@Email
	@NotEmpty
	private String email;
	
	@OneToOne(mappedBy="user", cascade=CascadeType.PERSIST)
	UserCredentials cred;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserCredentials getCred() {
		return cred;
	}

	public void setCred(UserCredentials cred) {
		this.cred = cred;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
