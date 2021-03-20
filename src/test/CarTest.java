package test;

import static org.junit.Assert.assertThrows;
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
	public void testRefuelMethodWorksProperly() {
		Car car = new Car("x", "y", 70.0, 10.0);
		car.refuel(20.0);
		assertEquals(20.0, car.getFuelState());
		
		Car car2 = new Car("x", "y", 70.0, 10.0);
		assertThrows(ArithmeticException.class, () -> car2.refuel(70.1));
		
		Car car3 = new Car("x", "y", 70.0, 10.0);
		assertThrows(ArithmeticException.class, () -> car3.refuel(-20.0));
	}
}
