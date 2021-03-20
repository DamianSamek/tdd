package impl;

public class Car {

	private String color;

	private String brand;

	private Double tankCapacity;

	private Double fuelConsumption;

	public Car(String brand, String color, Double tankCapacity, Double fuelConsumption) {
		this.brand = brand;
		this.color = color;
		this.tankCapacity = tankCapacity;
		this.fuelConsumption = fuelConsumption;
	}
	
	public void refuel(Double liters) {
		
	}

	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public Double getTankCapacity() {
		return tankCapacity;
	}

	public Double getFuelConsumption() {
		return fuelConsumption;
	}

}
