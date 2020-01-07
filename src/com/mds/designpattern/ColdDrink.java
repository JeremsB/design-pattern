package com.mds.designpattern;

public abstract class ColdDrink {
	
	private String name;
	private float price;
	private Packing packing;
	
	public ColdDrink(String name, float price) {
		this.name = name;
		this.price = price;
		this.packing = new Bottle();
	}
	
	public String name() {
		return name;
	}
	
	public Packing packing() {
		return packing;
	}
	
	public float price() {
		return price;
	}
	
}
