package com.aurionpro.model;

public class DaoFactoryProducer {

	public IDaoAbstractFactory produce(String factoryType) {
		if (factoryType.equalsIgnoreCase("XML")) {
			return new XMLDaoFactory();
		}
		if (factoryType.equalsIgnoreCase("DB")) {
			return new DBDaoFactory();
		}
		return null;

	}
}
