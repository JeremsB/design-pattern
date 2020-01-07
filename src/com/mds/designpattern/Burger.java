package com.mds.designpattern;

public abstract class Burger implements Item{

	private String name;
	private float price;
	private Packing packing;
	
	public Burger(String name, float price) {
		this.name = name;
		this.price = price;
		this.packing = new Wrapper();
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
