package zadaci;

public class Stringovi {

	public int stringLength(String str) {
		return str.length();
	}

	public String parniChar(String str) {
		String string = "";
		for (int i = 1; i < str.length(); i += 2) {
			string += str.charAt(i);
		}
		return string;
	}

	public String neparniChar(String str) {
		String string = "";
		for (int i = 0; i < str.length(); i += 2) {
			string += str.charAt(i);
		}
		return string;
	}

	public int brojUppercase(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				count++;
		}
		return count;

	}
	
	public int brojLowercase(String str) {
		
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i)))
				count++;
		}
		return count;
	}
	
	public String notLetter(String str) {
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) == false) {
				string += str.charAt(i);
			}
		}
		return string;
	}
}
