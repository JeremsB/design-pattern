package com.mds.abstractfactory.shape;

import com.mds.abstractfactory.Item;

public class Circle implements Shape, Item{

	public static final String CIRCLE = "CIRCLE";

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}
	
	public String getName() {
		return CIRCLE;
	}
	
}
