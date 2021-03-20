package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	
	@Test
	public void testThatConstructorWorksProperly() {
		Car car = new Car("Opel", "black", 70.0, 10.0);
		assertEquals("Opel", car.getBrand());
		assertEquals("black", car.getColor());
		assertEquals(70.0, car.getTankCapacity());
		assertEquals(10.0, car.getFuelConsumption());
	}
	
	@Test
	public void testThatCarHasRefuelMethod() {
		Car car = new Car("x", "y", 0.0, 0.0);
		car.refuel(50.0);
	}
}
