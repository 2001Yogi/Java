package basic;
import java.util.Scanner;
public class Ques_13 {
	public static void main(String[] args) {
		int i;
		System.out.println("Divisible by Both 3 and 5 are:- ");
		for(i=1;i<=100;i++) {
			if(i%3 ==0 && i%5 == 0) {
				System.out.print(i + ", ");
			}
		}
			
	}
}
