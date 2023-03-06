package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirectory;
import com.aurionpro.model.IEmployee;
import com.aurionpro.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		IEmployee dev1=new Developer("krutika", "junior developer");
		IEmployee dev2=new Developer("rutuja", "senior developer");
		
		EmployeeDirectory devDirectory=new EmployeeDirectory();
		devDirectory.addEmployee(dev1);
		devDirectory.addEmployee(dev2);
		
		IEmployee man1 =new Manager("rasika", "aws-manager");
		IEmployee man2 =new Manager("abc", "java manager");
		
		EmployeeDirectory manDirectory=new EmployeeDirectory();
		manDirectory.addEmployee(man1);
		manDirectory.addEmployee(man2);
		
		EmployeeDirectory companyDirectory=new EmployeeDirectory();
		companyDirectory.addEmployee(devDirectory);
		companyDirectory.addEmployee(manDirectory);
		
		companyDirectory.showEmployeeDetails();
		

	}

}
