package basic;

import java.util.Scanner;

public class Ques_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value for a:- ");
		int a = sc.nextInt();
		System.out.println("Enter the value for b:- ");
		int b = sc.nextInt();
		System.out.println("Enter the value for c:- ");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Largest Number is:-" + a);
		}else if(b>a && b>c) {
			System.out.println("Largest Number is:-" + b);
		}else if(c>a && c>b) {
			System.out.println("Largest Number is:-" + c);
		}
	}
}
