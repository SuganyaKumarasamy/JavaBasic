
import java.util.Scanner;

public class WithoutModeOperator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = in.nextInt();
		System.out.println("Enter second number: ");
		int num2 = in.nextInt();
		in.close();

		if (num2 > num1) {
			System.out.println("Remainder: " + num1);
		} else {
			try {
				System.out.println("Remainder: " + (num1 - (num2 * (num1/num2))));
			} catch (ArithmeticException e) {
				System.out.println("Can't be divided by Zero");
			}
		}

	}

}
