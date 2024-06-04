package basic;

class Rectangle {
	private double length;
	private double breadth;
	
	//Constructor
	public Rectangle(double length , double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area(){
		double area = length * breadth;
		System.out.println("Area of rectangle :-" + area);

	}
	
	public void Perimeter(){
		double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle :- " + perimeter);

	}
}

class Square extends Rectangle {
    // Constructor
    public Square(double side) {
        super(side, side);
    }
}

public class Rectangle_Example {
	public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        r.area();
        r.Perimeter();
 
        Square s = new Square(4);
        s.area();
        s.Perimeter();
    }
}
