package creditCard;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidationTest {
	
	long cardNumber = 4388576018402626L;
	long validCardNumber = 4388576018410707L;
	long lowerThan13Digits = 43885760184L;
	long greaterThan16Digits = 438857601841070707L;

	@Test
	public void sumOfDoubleEvenTest() {
		int result = CreditCardValidation.sumOfDoubleEvenPlace(cardNumber);
		assertEquals(37, result);
	}
	
	@Test
	public void DigitTestWhenNumberIsSingle() {
		int result = CreditCardValidation.getDigit(2);
		assertEquals(2, result);
	}
	
	@Test
	public void DigitTestWhenNumberIsDouble() {
		int result = CreditCardValidation.getDigit(16);
		assertEquals(7, result);
	}
	
	@Test
	public void sumOfOddPlaceNumberTest() {
		int result = CreditCardValidation.sumOfOddPlace(cardNumber);
		assertEquals(38, result);
	}
	
	@Test
	public void sizeTest() {
		int result = CreditCardValidation.getSize(cardNumber);
		assertEquals(16, result);
	}
	
	@Test
	public void prefixTest() {
		int result = CreditCardValidation.getPrefix(cardNumber, 2);
		assertEquals(43, result);
	}
	
	@Test
	public void shoudBeFalseIsValidTest() {
		boolean result = CreditCardValidation.isValid(cardNumber);
		assertFalse(result);
	}
	
	@Test
	public void shoudBeTrueIsValidTest() {
		boolean result = CreditCardValidation.isValid(validCardNumber);
		assertTrue(result);
	}
	
	@Test
	public void whenNumberHaveLowerThan13DigitsShouldBeFalse() {
		boolean result = CreditCardValidation.isValid(lowerThan13Digits);
		assertFalse(result);
	}
	
	@Test
	public void whenNumberHaveGreaterThan16DigitsShouldBeFalse() {
		boolean result = CreditCardValidation.isValid(greaterThan16Digits);
		assertFalse(result);
	}

}
