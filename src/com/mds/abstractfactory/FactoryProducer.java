package com.mds.abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		} else if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else {
			return null;
		}
	}
}
