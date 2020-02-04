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
	
	public static Item getItem(String test) {
		Item itemColor = new ColorFactory().getItem(test);
		if (itemColor == null) {
			Item itemShape = new ShapeFactory().getItem(test);
			return itemShape;
		} else {
			return itemColor;
		}
	}
}
