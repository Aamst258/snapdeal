package com.snapdeal.snapdeal.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Admin")
public class Admin {
	private String userName; 
    @Id
private String email;
private String password;
public String getUserName() {
	return userName;
}
@Override
public String toString() {
	return "Admin [userName=" + userName + ", email=" + email + ", password=" + password + "]";
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(String userName, String email, String password) {
	super();
	this.userName = userName;
	this.email = email;
	this.password = password;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
