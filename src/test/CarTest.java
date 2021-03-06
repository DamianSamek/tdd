package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import impl.Car;

public class CarTest {

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

	@Test
	public void testRideMethodWorksProperly() {
		Car car1 = new Car("x", "y", 70.0, 10.0);
		assertThrows(ArithmeticException.class, () -> car1.ride(-1.1));

		Car car2 = new Car("x", "y", 50.0, 10.0);
		car2.refuel(10.0);
		assertThrows(ArithmeticException.class, () -> car2.ride(100.1));

		Car car3 = new Car("x", "y", 50.0, 10.0);
		car3.refuel(10.0);
		car3.ride(90.0);
		assertEquals(1.0, car3.getFuelState());

		Car car4 = new Car("x", "y", 50.0, 10.0);
		car4.refuel(40.0);
		car4.ride(350.0);
		assertEquals(350.0, car4.getOdometer());

		Car car5 = new Car("x", "y", 150.0, 10.0);
		car5.refuel(130.0);
		car5.ride(1276.0);
		assertEquals(276.0, car5.getDailyOdometer());

		Car car6 = new Car("x", "y", 200.0, 10.0);
		car6.refuel(200.0);
		car6.ride(1700.0);
		assertEquals(700.0, car6.getDailyOdometer());
		car6.resetDailyOdometer();
		assertEquals(0.0, car6.getDailyOdometer());
	}

}
