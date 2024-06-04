package basic;
import java.util.Scanner;
public class Account_Balance {
	public static void main(String[] args) {
		try {
			int account_bal = 5000;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount");
			 
            int amount = sc.nextInt();
			if(amount > account_bal) {
				throw new ArithmeticException("Insufficient Balance");
			}
			else {
				System.out.println("Withdraw succesfully");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
