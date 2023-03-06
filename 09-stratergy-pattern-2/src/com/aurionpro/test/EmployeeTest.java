package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;
import com.aurionpro.model.TechLead;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj = new Employee(1, "rasika", new TechLead());
		System.out.println(obj.getDesciption()+"  "+obj.getResponsibilty());
		
		System.out.println("---------------");
		obj.Promote(new SeniorConsultant());
		System.out.println(obj.getDesciption()+"  "+obj.getResponsibilty());

	}

}
