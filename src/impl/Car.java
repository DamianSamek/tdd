package impl;

public class Car {

	private String color;

	private String brand;

	private Double tankCapacity;

	private Double fuelConsumption;
	
	private Double fuelState = 0.0;

	public Car(String brand, String color, Double tankCapacity, Double fuelConsumption) {
		this.brand = brand;
		this.color = color;
		this.tankCapacity = tankCapacity;
		this.fuelConsumption = fuelConsumption;
	}
	
	public void refuel(Double liters) {
		if(liters <= 0) {
			throw new ArithmeticException("Liters must be positive value");
		}
		Double fuelStateAfterRefuel = this.fuelState + liters;
		if(fuelStateAfterRefuel > tankCapacity) {
			throw new ArithmeticException("Tank capacity exceeded");
		}		
		this.fuelState+=liters;
	}
	
	public void ride(Double kilometers) {
		if(kilometers <= 0) {
			throw new ArithmeticException("Kilometers must be positive value");
		}
		Double litersOfFuelNeeded = (kilometers/100.0) * fuelConsumption;
		if(litersOfFuelNeeded > fuelState) {
			throw new ArithmeticException("There is too few fuel in tank");
		}
		this.fuelState-=litersOfFuelNeeded;
	}
	
	public Double getFuelState() {
		return fuelState;
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
