package basic;
import java.util.Scanner;
public class Ques_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number :- ");
		int num = sc.nextInt();
		int count = 0;
		
		while(num!=0){
	         num = num/10;
	         count++;
	      }
	      System.out.println("Number of digits in the entered integer are : " + count);

		
	}
}
