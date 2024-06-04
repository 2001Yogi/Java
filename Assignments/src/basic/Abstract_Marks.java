package basic;

abstract class Marks {
    // Abstract method to get the percentage of marks
    abstract float getPercentage();
}

class A extends Marks {
    private int marks1, marks2, marks3;

    public A(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    @Override
    float getPercentage() {
    	float result = marks1 + marks2 + marks3;
    	return (result / 300) *100;
    }
}

class B extends Marks {
    private float marks1, marks2, marks3, marks4;

    // Constructor to initialize marks for student B
    public B(float marks1, float marks2, float marks3, float marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }
    
    @Override
    float getPercentage() {
    	float result = marks1 + marks2 + marks3 + marks4;
    	return (result / 400) *100;
    }
}

public class Abstract_Marks {
	public static void main(String[] args) {
        
        A sA = new A(70, 80, 90);
        
        B sB = new B(90, 80, 70, 60);

        System.out.println("Percentage of marks for 1st Student: " + sA.getPercentage() + "%");
        System.out.println("Percentage of marks for 2nd Student: " + sB.getPercentage() + "%");
    }
}
