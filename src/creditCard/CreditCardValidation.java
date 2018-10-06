package creditCard;

public class CreditCardValidation {

	public static boolean isValid(long number) {

		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 && getSize(number) >= 13 && getSize(number) <= 16)
			return true;
		else
			return false;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		String num = Long.toString(number);
		int sum = 0;
		for (int i = num.length() - 2; i >= 0; i -= 2) {
			int dupli = 2 * Integer.parseInt(String.valueOf(num.charAt(i)));
			while (dupli > 9) {
				dupli = dupli / 10 + dupli % 10;
			}
			sum += dupli;

		}
		return sum;
	}

	public static int getDigit(int number) {
		while (number > 9) {
			number = number / 10 + number % 10;
		}
		return number;
	}

	public static int sumOfOddPlace(long number) {
		String num = Long.toString(number);
		int sum = 0;
		for (int i = num.length() - 1; i >= 0; i -= 2) {
			int cifra = getDigit(Integer.parseInt(String.valueOf(num.charAt(i))));
			sum += cifra;
		}
		return sum;
	}

	public static int getSize(long number) {
		String num = Long.toString(number);
		return num.length();

	}

	public static int getPrefix(long number, int k) {
		String num = Long.toString(number);
		String prefix = num.substring(0, k);
		int numberPrefix = Integer.parseInt(prefix);
		return numberPrefix;
	}
}
