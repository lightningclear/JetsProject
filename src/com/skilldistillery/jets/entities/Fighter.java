package com.skilldistillery.jets.entities;

public class Fighter extends Jets implements CombatReady {

	

	public Fighter(String model, int speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {
		
	}
	
}
