package com.mds.abstractfactory;

import com.mds.abstractfactory.color.Color;
import com.mds.abstractfactory.shape.Circle;
import com.mds.abstractfactory.shape.Rectangle;
import com.mds.abstractfactory.shape.Shape;
import com.mds.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory{
	
	public static final String SHAPE = "SHAPE";

	public Shape getShape(String shape) {

		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else {
			return null;	
		}
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
