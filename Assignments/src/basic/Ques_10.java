package basic;
import java.util.Scanner;
public class Ques_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the character :- ");
		char a = sc.next().charAt(0);
		
		int Asci = a;
		System.out.println("The ASCII value of '" + a + "' is " + Asci);	
	}
}
