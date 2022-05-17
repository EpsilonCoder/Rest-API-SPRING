package com.epsilon.com.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class User {

	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	private int age;
	private String occupation;

	public User() {
		super();
	}

	public User(String firstname, String lastname, int age, String occupation) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.occupation = occupation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
