package com.mds.designpattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//creer meal bulder
		//= new meal builder...
		
		//meal vegmeal = mealbuilder.preparevegmeal().build()
		//vegmeal.showitems
		
		//meal
		
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal().build();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: "+ vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal().build();
		System.out.println("\n Non-Veg Heal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());

		Meal customMeal = mealBuilder
			.prepareNonVegMeal()
			.addItem(new ChickenBurger())
			.build();
		System.out.println("\n\nCustom Meal");
		customMeal.showItems();
		System.out.println("Total Cost: " + customMeal.getCost());

		Meal myMeal = new Meal();
	}
}
