package basic;
import java.util.Scanner;
public class Ques_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the text :- ");
		String text = sc.next();
		
		int i,letter=0,space=0,number=0,other_char=0;
		for(i=0;i<text.length();i++) {
			char ch = text.charAt(i);
			
			if(Character.isLetter(ch)) {
				letter++;
			}else if(Character.isSpaceChar(ch)) {
				space++;
			}else if(Character.isDigit(ch)) {
				number++;
			}else {
				other_char++;
			}
		}
		
		System.out.println("Total Letter is " + letter + " , Total Space is " + space + " , Total Number is " + number + " , Total other character is " + other_char);
		
	}
}
