package com.mds.abstractfactory.shape;

public class Square implements Shape{

	public static final String SQUARE = "SQUARE";

	@Override
	public void draw() {
		System.out.println("Draw Square");
	}
	/*
	public String getName() {
		return SQUARE;
	}
	*/
}
