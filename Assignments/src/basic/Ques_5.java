package basic;
import java.util.Scanner;
public class Ques_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum = 0, num = 5, i;
		for(i=1; i<=num; i++) {
			System.out.println("Enter the Number " + i + " = ");
			int number = sc.nextInt();
			sum += number;
		}
		System.out.println("The Sum of Enter Number is " + sum);
		double avg = sum/num ;
		System.out.println("The Average of Enter Number is " + avg);
	}
}
