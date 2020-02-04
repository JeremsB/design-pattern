package com.mds.abstractfactory.color;

public class Red implements Color{

	public static final String RED = "RED";

	@Override
	public void fill() {
		System.out.println("Color is Red");
	}
	/*
	public String getName() {
		return RED;
	}
	*/
}
