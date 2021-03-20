package test;

import org.junit.Test;

import impl.Car;

public class CarTest {

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
