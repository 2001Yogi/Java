package basic;

class ParentClass {
	public void A() {
		System.out.println("This is Parent Class");
	}
}

class ChildClass extends ParentClass {
	public void B() {
		System.out.println("This is Child Class");
	}
}


public class ClassObject {
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		ChildClass cc = new ChildClass();
		pc.A();//method of parent class by object of parent class
		cc.B();//method of child class by object of child class
		cc.A();//method of parent class by object of child class  
	}
}
