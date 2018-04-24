
import java.util.InputMismatchException;
import java.util.Scanner;

public class WithoutModOperator {
	
	static String modOperation(int num1, int num2) {
		if (num2 > num1 || num1 == 0) {
			return "" + num1;
		} else {
			try {
				return "" + (num1 - (num2 * (num1 / num2)));
			} catch (ArithmeticException e) {
				return null;
			}
		}
	}

	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(System.in);

			System.out.println("Enter first number: ");
			int num1 = in.nextInt();
			System.out.println("Enter second number: ");
			int num2 = in.nextInt();
			in.close();
			String modResult = modOperation(num1, num2);
			if(modResult != null) {
				System.out.println("Remainder: " + modResult);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}
}
