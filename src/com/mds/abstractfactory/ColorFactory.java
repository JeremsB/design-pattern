package com.mds.abstractfactory;

import com.mds.abstractfactory.color.Blue;
import com.mds.abstractfactory.color.Color;
import com.mds.abstractfactory.color.Green;
import com.mds.abstractfactory.color.Red;
import com.mds.abstractfactory.shape.Circle;
import com.mds.abstractfactory.shape.Rectangle;
import com.mds.abstractfactory.shape.Shape;
import com.mds.abstractfactory.shape.Square;

public class ColorFactory extends AbstractFactory{
	
	public static final String COLOR = "COLOR";

	public Color getColor(String color) {

		if (color == null) {
			return null;
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else {
			return null;	
		}
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
