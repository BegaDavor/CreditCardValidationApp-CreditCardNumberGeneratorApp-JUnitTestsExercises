package zadaci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterTest {
	
	double kg;
	double funt;
	double cm;
	double inch;
	double celsius;
	double fahrenheit;

	@Before
	public void setUp() {
		
		kg = 2;
		funt = 2.4419;
		cm = 1;
		inch = 17;
		celsius = 30;
		fahrenheit = 75;
		
	}
	
	@Test
	public void whenKgIs2FuntShoudBeTest() {
		
		Converter converter = new Converter();
		double result = converter.kgToFunt(kg);
		assertEquals(4.88, result, Math.abs(4.88 - result));		
	}
	
	@Test
	public void whenFuntIsFuntFuntToShoudBe1() {
		
		Converter converter = new Converter();
		double result = converter.funtToKg(funt);
		assertEquals(1, result, Math.abs(1 - result));		
	}
	
	@Test
	public void whenCmIs1InchShoudBe039() {
		
		Converter converter = new Converter();
		double result = converter.cmToInch(cm);
		assertEquals(0.39, result, Math.abs(0.39 - result));
	}
	
	@Test
	public void whenInchIs17CmShoudBe43() {
		
		Converter converter = new Converter();
		double result = converter.inchToCm(inch);
		assertEquals(43.18, result, Math.abs(43.18 - result));
	}
	
	@Test
	public void whenCIs30FShoudBe1013() {
		Converter converter = new Converter();
		double result = converter.cToF(celsius);
		assertEquals(1013, result, Math.abs(1013 - result));
	}
	
	@Test
	
	public void whenFIs75CShoudBe2() {
		Converter converter = new Converter();
		double result = converter.fToC(fahrenheit);
		assertEquals(2, result, Math.abs(2 - result));
	}

}
