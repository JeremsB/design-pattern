package com.mds.abstractfactory.shape;

import com.mds.abstractfactory.Item;

public class Square implements Shape, Item{

	public static final String SQUARE = "SQUARE";

	@Override
	public void draw() {
		System.out.println("Draw Square");
	}
	
	public String getName() {
		return SQUARE;
	}

}
