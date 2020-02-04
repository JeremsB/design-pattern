package com.mds.abstractfactory.shape;

public class Circle implements Shape{

	public static final String CIRCLE = "CIRCLE";

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}
	/*
	public String getName() {
		return CIRCLE;
	}
	*/
}
