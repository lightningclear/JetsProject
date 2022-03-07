package com.skilldistillery.jets.entities;

public abstract class Jets {
	private String model;
	private int speed;
	private int range;
	private long price;

	public void fly() {
		int time = this.range / this.speed;
		System.out.println(this.model + "can fly for this amount of time" + time + "with " + this.range +" and this speed" + this.speed);
	}

	public void loadCargo() {
		System.out.println("Ordanance and cargo loading: " + this.getModel());
	}

	public double getSpeedInMach() {
		// convert mph to mach.
		return speed;
	}

	public Jets(String model, int speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jets [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}


}
