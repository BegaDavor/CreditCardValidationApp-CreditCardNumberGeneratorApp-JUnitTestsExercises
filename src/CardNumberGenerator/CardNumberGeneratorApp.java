package CardNumberGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

import creditCard.CreditCardValidation;

public class CardNumberGeneratorApp {

	static Scanner input = new Scanner(System.in);

	public static int isInteger() { // handle exception za integer brojeve
		while (true) {
			try {
				return input.nextInt();
			} catch (InputMismatchException e) {
				input.next();
				System.out.println("Vas unos nije dobar. Probajte ponovo: ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(
				"Izaberite opciju: \n 1 - MasterCard \n 2 - Visa \n 3 - Discover \n 4 - American Express \n 5 - Other");
		int opcija = isInteger();

		switch (opcija) {
		case 0:
			break;
		case 1:
			long masterCardNumber;
			do {
				String temp = 5 + Long.toString((long) (Math.random() * 100000000000000L));
				masterCardNumber = Long.parseLong(temp);
			} while (CreditCardValidation.isValid(masterCardNumber) == false);
			System.out.println("MasterCard: " + masterCardNumber);
			break;
		case 2:
			long visaCardNumber;
			do {
				String temp = 4 + Long.toString((long) (Math.random() * 100000000000000L));
				visaCardNumber = Long.parseLong(temp);
			} while (CreditCardValidation.isValid(visaCardNumber) == false);
			System.out.println("MasterCard: " + visaCardNumber);
			break;
		case 3:
			long discoverCardNumber;
			do {
				String temp = 6 + Long.toString((long) (Math.random() * 100000000000000L));
				discoverCardNumber = Long.parseLong(temp);
			} while (CreditCardValidation.isValid(discoverCardNumber) == false);
			System.out.println("MasterCard: " + discoverCardNumber);
			break;
		case 4:
			long americanExpressCardNumber;
			do {
				String temp = 37 + Long.toString((long) (Math.random() * 10000000000000L));
				americanExpressCardNumber = Long.parseLong(temp);
			} while (CreditCardValidation.isValid(americanExpressCardNumber) == false);
			System.out.println("MasterCard: " + americanExpressCardNumber);
			break;
		case 5:
			long otherCardNumber;
			do {
				otherCardNumber = (long) (Math.random() * 10000000000000000L);
			} while (CreditCardValidation.isValid(otherCardNumber) == false);
			System.out.println("MasterCard: " + otherCardNumber);
			break;
		default:
			System.out.println("Unos nije dobar!");

		}
	}

}
