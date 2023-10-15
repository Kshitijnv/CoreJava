package com.app.fruits;
public class Apple extends Fruit{
	public Apple(double weight) {
		super("Apple",weight,"RED");
	}
	
	public String taste() {
		return "Sweet and Sour";
	}
	public void jam() {
		System.out.println("Name :"+super.getName()+"JAM!");
	}
	public String toString() {
		return "Name : " +super.getName()+" weight: "+super.getWeight()+" color: "+super.getColor()+" Taste of: "+taste();
	}
}
