/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.snapdeal.snapdeal.Model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author Lenovo
 */
@Document(collection = "register")
public class Register {
     

		private String userName; 
        @Id
    private String email;
    private String password;      
    
    @Override
 	public String toString() {
 		return "Register [userName=" + userName + ", email=" + email + ", password=" + password + "]";
 	}
    
    
public Register(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
public Register() {
	
		// TODO Auto-generated constructor stub
	}
public String getUserName() {
		return userName;
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
