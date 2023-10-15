package com.app.fruits;

public class Fruit {
	
	private String name;
	private String color;
	private double weight;
	private boolean stale;

	public Fruit(String name,double weight,String color) {
		this.name=name;
		this.weight=weight;
		this.color=color;
	}
	public String taste() {
		return "No Specific taste";
	}
	public String toString() {
		return "General "+ name +" No Specific Color " + color +"No weight " + weight;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public boolean hasStale() {
		return stale;
	}
	public void setStale() {
		this.stale=true;
		
	}
}
