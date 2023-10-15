package com.app.fruits;

public class Orange extends Fruit {
	public Orange( double weight) {
		super("Orange", weight, "Orange");
	}

	public String taste() {
		return "Sour";
	}
	public void juice() {
		System.out.println("Name : "+super.getName()+"Weight :"+super.getWeight()+"JUICE!");
	}
	public String toString() {
		return "Name : " +super.getName()+" weight: "+super.getWeight()+" color: "+super.getColor()+" taste of: "+taste();
	}
}
