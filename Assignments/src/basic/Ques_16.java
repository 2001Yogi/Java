package basic;
public class Ques_16 {
	public static void main(String[] args) {
		
		String str1 = "topsint.com";
        String str2 = "topsint.com";
        String str3 = "Topsint.com";
        
		boolean result1 = str1.equals(str2);
        System.out.println("Comparing " + str1 + " and " + str2 + " = " + result1);
        
        boolean result2 = str1.equals(str3);
        System.out.println("Comparing " + str1 + " and " + str3 + " = " + result2);
        
        boolean result3 = str1.equalsIgnoreCase(str3);
        System.out.println("Comparing " + str1 + " and " + str3 + " = " + result3);
		
	}
}
