package basic;

public class Ques_17 {
	public static void main(String[] args)
	{
		String str1 = "Java Exercises";
		String str2 = "Java Exercise";
 
		String check = "se";
		boolean result1 = str1.endsWith(check);
		boolean result2 = str2.endsWith(check);
		System.out.println("'" + str1 + "' ends with " +"'" + check + "' = " + result1);
		System.out.println("'" + str2 + "' ends with " + "'" + check + "' = " + result2);
	}
}
