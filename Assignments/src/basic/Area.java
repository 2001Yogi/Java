package basic;

public class Area {
	public void area(double length , double breadth) {
		//Area of rectangle
		double c = (length * breadth) / 2;
		System.out.println("Area of Rectangle:- "+ c);
	}
	public void area(int side) {
		//Area of square
		double d = side * side;
		System.out.println("Area of Square:- "+ d);
	}
	
	public static void main(String[] args) {
		Area a = new Area();
    	
    	a.area(5, 4);
    	a.area(5);
    	
    }
}
