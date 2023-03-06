package com.aurionpro.model;

public class SeniorConsultant implements IRole {

	@Override
	public String description() {
		
		return "i am senior consultant";
	}

	@Override
	public String responsibility() {
		
		return "review code";
	}

}
