package com.mds.abstractfactory.color;

import com.mds.abstractfactory.Item;

public class Blue implements Color, Item{

	public static final String BLUE = "BLUE";

	@Override
	public void fill() {
		System.out.println("Color is Blue");
	}
	
	public String getName() {
		return BLUE;
	}
	
}
