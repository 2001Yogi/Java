package basic;

public class Ques_18 {
	public static void main(String[] args)
	{
		String str1 = "Red is Favourite Color";
		String str2 = "Orange is also my Favourite Colour";
 
		String check = "Red";
		boolean result1 = str1.startsWith(check);
		boolean result2 = str2.startsWith(check);
		System.out.println(str1 + " starts with " + check + " = " + result1);
	    System.out.println(str2 + " starts with " + check + " = " + result2);
	}
}
