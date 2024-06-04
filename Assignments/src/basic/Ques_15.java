package basic;
import java.util.Scanner;
public class Ques_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 1st String:- ");
		String text1 = sc.next();
		System.out.println("Enter the 2nd String:- ");
		String text2 = sc.next();	
		
		String concat = text1 + text2;
		System.out.println("Concated String is:- " + concat);
		
	}
}
