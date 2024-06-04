package basic;

	import java.util.Scanner;
	
public class Ques_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 System.out.print("Enter a single character from the alphabet: ");
		 String alpa = sc.next();
		 
		 if(alpa.length() != 1) {
			 System.out.println("Error: Input must be a single character.");
		 }
		 
		 char ch = alpa.charAt(0);
		 
		 if(!Character.isLetter(ch)) {
			 System.out.println("Error: Input must be a letter (a-z or A-Z).");
		 }
		 
		 ch = Character.toLowerCase(ch);
		 
		 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			 System.out.println("Alphabet is Vowel");
		 }else {
			 System.out.println("Alphabet is Consonant");
		 }
	}
}
