package zadaci;

public class Calculator {
	
	public int add(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int minus(int num1, int num2) {
		return (num1 - num2);
	}
	
	public int product(int num1, int num2) {
		return (num1 * num2);
	}
	
	public double divide(int num1, int num2) {
		double result = 0;
		if (num2 != 0) {
		result = num1 / num2;
		}else{
			throw new ArithmeticException();
		}
		
		return result;
	}

}
