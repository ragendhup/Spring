package com.tnsif.di;

public class Car implements Vehicle{
	String name;
	String model;
	
	public Car(String name, String model) {
		super();
		this.name = name;
		this.model = model;
		System.out.println(name +""+ model);
	}
	
	
	
	public Car() {
		super();
	}
}
