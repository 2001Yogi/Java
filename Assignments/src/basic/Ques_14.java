package basic;
import java.util.Scanner;
public class Ques_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Text:- ");
		String text = sc.next();
		System.out.println("Enter the index:- ");
		int index = sc.nextInt();	
		
		if(index >=0 && index<= text.length()) {
			System.out.println("The character at position " + index + " is " + text.charAt(index));
		}else {
			System.out.println("Index and character both not found");
		}
	}
}
