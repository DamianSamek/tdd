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
		car.color;
	}
}
