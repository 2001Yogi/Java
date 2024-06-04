package basic;

import java.util.Scanner;
public class Vote {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age");
			 
            int age = sc.nextInt();
			if(age<18) {
				throw new ArithmeticException("Enter Valid Age");
			}
			else {
				System.out.println("Welcome to Vote");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
