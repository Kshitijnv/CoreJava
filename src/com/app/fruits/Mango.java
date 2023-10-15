package com.app.fruits;
public class Mango extends Fruit {
	public Mango( double weight) {
		super("Mango", weight, "Yellow");
	}
	@Override
	public String taste() {
		return "Sweet";
	}
	public void pulp() {
		System.out.println("Name : "+ super.getName() +" color: "+  super.getColor()+ "PULP!");
	}
	public String toString() {
		return "Name : " +super.getName()+" weight: "+super.getWeight()+" color: "+super.getColor()+" taste of: "+taste();
	}
}
