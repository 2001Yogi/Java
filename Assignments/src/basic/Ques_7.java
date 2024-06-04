package basic;
import java.util.Scanner;
public class Ques_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of Rows:- ");
		int row = sc.nextInt();
		int plus = 1;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
			  System.out.print(plus++ + " ");
			}
		    System.out.println("");
		    }
	}
}
