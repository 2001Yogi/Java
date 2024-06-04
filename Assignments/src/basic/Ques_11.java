package basic;
import java.util.Scanner;
public class Ques_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number :- ");
		int n = sc.nextInt();
		int nn = Integer.parseInt(n + "" + n);
//		System.out.println(nn);
		int nnn = Integer.parseInt(n + "" + n + "" + n);
//		System.out.println(nnn);
		
		int final_ =  n + nn + nnn;
		
		System.out.println(n + " + " + nn + " + " + nnn + " = " + final_);
			
	}
}
