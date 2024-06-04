package basic;
//Here Method Overloading Use :- Method Same with different parameters
public class PrintNumber {
	public void printn(int num1) {
		System.out.println("Integer: " + num1);
	}
	
    public void printn(double num1) {
        System.out.println("Double: " + num1);
    }
    
    public void printn(float num1) {
        System.out.println("Float: " + num1);
    }
    
    public void printn(long num1) {
        System.out.println("Long: " + num1);
    }
    
    public void printn(String num1) {
        System.out.println("String: " + num1);
    }
    
    public void printn(char num1) {
        System.out.println("character: " + num1);
    }
    
    public static void main(String[] args) {
    	PrintNumber pn = new PrintNumber();
    	
    	pn.printn(1);
    	pn.printn(25.25);
    	pn.printn(5.5f);
    	pn.printn(8711145L);;
    	pn.printn('Y');
    	pn.printn("Hello");
    }
}
