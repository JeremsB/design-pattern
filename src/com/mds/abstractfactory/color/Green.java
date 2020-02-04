package com.mds.abstractfactory.color;

public class Green implements Color{

	public static final String GREEN = "GREEN";

	@Override
	public void fill() {
		System.out.println("Color is Green");
	}
	/*
	public String getName() {
		return GREEN;
	}
	*/
}
