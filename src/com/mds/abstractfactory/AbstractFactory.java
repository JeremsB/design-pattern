package com.mds.abstractfactory;

import com.mds.abstractfactory.color.Color;
import com.mds.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
	
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);

}
