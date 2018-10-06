package zadaci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringoviTest {

	String str;
	String strForUppercaseAndLowercase;
	String strForNotLetter;

	@Before
	public void setUp() {
		this.str = "Zgembo Popuslic";
		this.strForUppercaseAndLowercase = "ZgeMbO pOPuSliC";
		this.strForNotLetter = "2gemb0.* p0pu51ic$";
	}

	@Test
	public void whenStringIsStrLengthMustBe15() {
		Stringovi stringovi = new Stringovi();
		int result = stringovi.stringLength(str);
		assertEquals(15, result);
	}

	@Test
	public void whenStringIsStrParniCharMustBegmoPpsi() {
		Stringovi stringovi = new Stringovi();
		String result = stringovi.parniChar(str);
		assertEquals("gmoPpsi", result);
	}

	@Test
	public void whenStringIsStrNeparniCharMustBeZeboulc() {
		Stringovi stringovi = new Stringovi();
		String result = stringovi.neparniChar(str);
		assertEquals("Zeb oulc", result);
	}

	@Test
	public void whenStringIsStrForUppercaseAndLowercaseNumberOfUppercaseCharMustBe7() {
		Stringovi stringovi = new Stringovi();
		int result = stringovi.brojUppercase(strForUppercaseAndLowercase);
		assertEquals(7, result);
	}

	@Test
	public void whenStringIsStrForUppercaseAndLowercaseNumberOfLowercaseCharMustBe7() {
		Stringovi stringovi = new Stringovi();
		int result = stringovi.brojLowercase(strForUppercaseAndLowercase);
		assertEquals(7, result);
	}

	@Test
	public void whenStringIsStrForNotLetterNotLetterMustBeNestoStrasno() {
		Stringovi stringovi = new Stringovi();
		String result = stringovi.notLetter(strForNotLetter);
		assertEquals("20.* 051$", result);
	}

}
