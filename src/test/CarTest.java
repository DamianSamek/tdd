package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CarTest {

	@Test
	public void canInstantiateCarObject() {
		Car car = new Car();
		assertNotNull(car);
	}
}
