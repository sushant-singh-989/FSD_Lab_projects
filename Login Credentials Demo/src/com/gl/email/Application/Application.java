package com.gl.email.Application;

import java.util.Scanner;
import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;

public class Application {
	public static void main(String[] args) {
		
		Employee emp = new Employee("Sushant","singh");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[]generatedPassword;
		
		System.out.println("Please enter the department");
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1: {generatedEmail = cs.EmailAddress(emp.getfirstName(),emp.getlastName(),"tech");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(emp,generatedEmail,generatedPassword);
				break;
		}
		case 2: {generatedEmail = cs.EmailAddress(emp.getfirstName(),emp.getlastName(),"Admin");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp,generatedEmail,generatedPassword);
		break;
		}
		case 3:{generatedEmail = cs.EmailAddress(emp.getfirstName(),emp.getlastName(),"Human resource");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp,generatedEmail,generatedPassword);
		break;
	}
		case 4:{
			generatedEmail = cs.EmailAddress(emp.getfirstName(),emp.getlastName(),"Legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(emp,generatedEmail,generatedPassword);
			break;
		}
		default: System.out.println("Please enter a valid option"); 
		

}
	}
}
