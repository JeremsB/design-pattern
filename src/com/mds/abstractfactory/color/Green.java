package com.mds.abstractfactory.color;

import com.mds.abstractfactory.Item;

public class Green implements Color, Item{

	public static final String GREEN = "GREEN";

	@Override
	public void fill() {
		System.out.println("Color is Green");
	}
	
	public String getName() {
		return GREEN;
	}
	
}
