package com.mds.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class DrawItem {

	String name;
	private List<CombinedItem> items = new ArrayList<CombinedItem>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CombinedItem> getItems() {
		return items;
	}
	public void setItems(List<CombinedItem> items) {
		this.items = items;
	}
	
	public void print() {
		System.out.println("Name: "+this.getName());
		for (CombinedItem combinedItem : items) {
			Item shape = (Item) combinedItem.getShape();
			Item color = (Item) combinedItem.getColor();
			System.out.println(shape.getName() + " " + color.getName());
		}
		
	}
		
}
