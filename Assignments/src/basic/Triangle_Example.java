package basic;

class Triangle{
	private double side_1, side_2, side_3, semi_peri, area, perimeter;
    
    public Triangle() {
    	this.side_1 = 3;
    	this.side_2 = 4;
    	this.side_3 = 5;
    }
    
    public void area() {
    	double semi_peri = (side_1 + side_2 + side_3) / 2; // semi-perimeter
        double area = Math.sqrt(semi_peri * (semi_peri - side_1) * (semi_peri - side_2) * (semi_peri - side_3));
        System.out.println("Area of triangle is: " + area);
    }
    
    public void Perimeter() {
    	double perimeter = side_1 + side_2 + side_3;
    	System.out.println("Perimeter of triangle is: " + perimeter);
    }
}

public class Triangle_Example {
	public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        t.Perimeter();
    }
}
