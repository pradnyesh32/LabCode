package com.bol;

public class User {

	private int id;
	private String name;
	private String email;
	private String city;
	private String password;
	
	
	
	
	
	public User() {
		super();
	}
	
	
	public User(int id, String name, String email, String city, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.password = password;
	}


	public User( String name, String email, String city, String password) {
		super();
		this.id=0;
		this.name = name;
		this.email = email;
		this.city = city;
		this.password = password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", password=" + password
				+ "]";
	}
	
	
}
