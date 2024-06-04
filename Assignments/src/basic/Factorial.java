package basic;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	int i,num, fact=1;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number:- ");
	num = sc.nextInt();
	
		for(i=1;i<=num;i++) {
			if(num == 0) {
				fact = 0;
			}else {
				fact = fact*i;
			}
		}
		System.out.println("Factorial of " + num + " is " + fact);;
    }
}
