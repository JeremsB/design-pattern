package com.mds.abstractfactory.color;

public class Blue implements Color{

	public static final String BLUE = "BLUE";

	@Override
	public void fill() {
		System.out.println("Color is Blue");
	}
	/*
	public String getName() {
		return BLUE;
	}
	*/
}
