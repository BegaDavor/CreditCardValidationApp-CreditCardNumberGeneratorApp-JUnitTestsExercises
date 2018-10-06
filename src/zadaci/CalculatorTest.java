package zadaci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	int num1;
	int num2;
	int num2Is0;
	
	@Before
	public void setUp() {
		this.num1 = 6;
		this.num2 = 2;
		this.num2Is0 = 0;
	}
	
	@Test
	public void whenNum1Is6AndNum2Is2AddMustBe8() {
		Calculator calculator = new Calculator();
		int result = calculator.add(num1, num2);
		assertEquals(8, result);
	}
	
	@Test
	public void whenNum1Is6AndNum2Is2MinusMustBe4() {
		Calculator calculator = new Calculator();
		int result = calculator.minus(num1, num2);
		assertEquals(4, result);
	}
	
	@Test
	public void whenNum1Is6AndNum2Is2ProductMustBe12() {
		Calculator calculator = new Calculator();
		int result = calculator.product(num1, num2);
		assertEquals(12, result);
	}
	
	@Test
	public void whenNum1Is6AndNum2Is2DivideMustBe3() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(num1, num2);
		assertEquals(3.0, result, Math.abs(3.0 - result));
	}
	
	@Test(expected = ArithmeticException.class)
	public void whenNum1Is6AndNum2Is0Exception() {
		Calculator calculator = new Calculator();
		calculator.divide(num1, num2Is0);
	}

}
