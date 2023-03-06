package com.aurionpro.model;

public class DBDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao createDao(String type) {
		if(type.equalsIgnoreCase("employee")) {
			return new DBEmpDao();
		}
		if(type.equalsIgnoreCase("department")) {
			return new DBDeptDao();
		}
		return null;
	}

}
