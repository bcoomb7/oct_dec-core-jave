package com.cognixia.jump.corejava.abstractAndInterfaces;

public abstract class Athlete {

	//we can not instantiate this class (make objects) but we can inherit it
	
	private String name;
	
	//methods
	//concrete or implemented method
	public void move() {
		System.out.println("Athlete moved");
		
	}

		//abstract - voila - we have both method types here
	public abstract void stop();
		
		
}

