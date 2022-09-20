package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String chars = "!@#$%^&*()_+";
		String bigString = caps+lowerCase+num+chars;
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i = 0;i<8; i++) {
			password[i] = bigString.charAt(random.nextInt(bigString.length()));
		}
		return password;
		}
	
	public String EmailAddress(String firstName,String lastName,String department) {
		return firstName+lastName+"@"+department+"gl.com";
	}
	
	public void showCredentials(Employee emp,String email,char[]password) { 
		System.out.println("Dear "+emp.getfirstName()+" your generated credentials are as follow");
		System.out.println("Email:"+ email);
		System.out.println("Password:");
		System.out.println(generatePassword());
	}
}
