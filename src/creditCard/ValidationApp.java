package creditCard;

import java.util.Scanner;

public class ValidationApp {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj vase kartice: ");
		long cardNumber = input.nextLong();
		
		if (CreditCardValidation.isValid(cardNumber) == true) {
			System.out.println("Kartica je validna!");
			int prefix = CreditCardValidation.getPrefix(cardNumber, 1);
			switch (prefix) {
			case 4: System.out.println("Vasa kartica je Visa."); break;
			case 5: System.out.println("Vasa kartica je Master."); break;
			case 6: System.out.println("Vasa kartica je Discover."); break;
			default: System.out.println("Nije poznata kartica");
			}
			
			if (CreditCardValidation.getPrefix(cardNumber, 2) == 37) 
				System.out.println("Vasa kartica je American Express.");
			
			}
		else
			System.out.println("Kartica nije validna!");
		
		input.close();
	}

}
