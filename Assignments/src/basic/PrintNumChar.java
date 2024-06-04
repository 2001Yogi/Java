package basic;

public class PrintNumChar {
	public void printn(int num1 , char ch) {
		System.out.println("Integer: " + num1 + " character: " + ch);
	}
	public void printn(char ch , int num1) {
		System.out.println("character: " + ch + " Integer: " + num1);
	}
	
	public static void main(String[] args) {
		PrintNumChar pnc = new PrintNumChar();
    	
    	pnc.printn(12, 'Y');
    	pnc.printn('P', 58);
    	
    }
}

