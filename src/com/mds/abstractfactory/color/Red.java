package com.mds.abstractfactory.color;

import com.mds.abstractfactory.Item;

public class Red implements Color, Item{

	public static final String RED = "RED";

	@Override
	public void fill() {
		System.out.println("Color is Red");
	}
	
	public String getName() {
		return RED;
	}
	
}
