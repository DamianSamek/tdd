package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import impl.Car;

public class CarTest {

	@Test
	public void canInstantiateCarObject() {
		Car car = new Car();
		assertNotNull(car);
	}
	
	@Test
	public void testCarObjectHasColorProperty() {
		Car car = new Car();
		String color = car.color;
	}
	
	@Test
	public void testCarObjectHasBrandProperty() {
		Car car = new Car();
		String brand = car.brand;
	}
	
	@Test
	public void testCarObjectHasTankCapacityProperty() {
		Car car = new Car();
		Double tankCapacity = car.tankCapacity;
	}
	
	@Test
	public void testCarObjectHasFuelConsumptionProperty() {
		Car car = new Car();
		Double fuelConsumption = car.fuelConsumption;
	}
	
	@Test
	public void testCarClassHasConstructorContainingFourParameters() {
		Car car = new Car("Opel", "black", 70.0, 10.0);
	}
	
	@Test
	public void testThatConstructorParametersAreExposed() {
		Car car = new Car("Opel", "black", 70.0, 10.0);
		car.getColor();
		car.getBrand();
		car.getFuelConsumption();
		car.getTankCapacity();
	}
}
