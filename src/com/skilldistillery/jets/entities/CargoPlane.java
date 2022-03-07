package com.skilldistillery.jets.entities;

public class CargoPlane extends Jets implements CargoCarrier {

	public CargoPlane(String model, int speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading completed: " + this.getModel());
	}
	
}
