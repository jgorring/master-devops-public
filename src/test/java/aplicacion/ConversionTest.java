package aplicacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversionTest {

	@Test
	public void testTempConversion() throws Throwable {
		
		Conversion underTest = new Conversion();
		
		double temperature = 80.0d;
		String unit = "";
		double result = underTest.tempConversion(temperature, unit);
		
		assertEquals(176.0d, result, 0.0);
		
		temperature = 176.0d;
		unit = "F";
		result = underTest.tempConversion(temperature, unit);
		assertEquals(80.0d, result, 0.0);
	}
}
