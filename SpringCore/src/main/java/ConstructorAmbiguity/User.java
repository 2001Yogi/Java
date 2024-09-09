package ConstructorAmbiguity;

public class User {
	private int a;
	private int b;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("data set by int constructor");
	}
	
	public User(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("data set by String constructor");
	}
	
	public User(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("data set by double constructor");
	}

	@Override
	public String toString() {
		return "User [a=" + a + ", b=" + b + "]";
	}

}
