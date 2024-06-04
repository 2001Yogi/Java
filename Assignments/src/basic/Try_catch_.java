package basic;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Try_catch_ {
	public static void main(String[] args) {
		try {
			Scanner sc  = new Scanner(System.in);
			System.out.println("enter a = ");
			int a  = sc.nextInt();
			System.out.println("enter b = ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Answer is:- " + c);
			System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println("denominator should be greater than 0");
		}
	}
}
