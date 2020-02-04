package com.mds.abstractfactory.shape;

import com.mds.abstractfactory.Item;

public class Rectangle implements Shape, Item{
	
	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Draw rectangle");
	}
	
	public String getName() {
		return RECTANGLE;
	}
	
}
