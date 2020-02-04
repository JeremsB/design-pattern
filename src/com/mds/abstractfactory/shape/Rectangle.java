package com.mds.abstractfactory.shape;

public class Rectangle implements Shape{
	
	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Draw rectangle");
	}
	/*
	public String getName() {
		return RECTANGLE;
	}
	*/
}
