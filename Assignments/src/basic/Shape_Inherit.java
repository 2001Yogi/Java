package basic;
class S{
	
	public S(){
		
	}
	public void p_Shape() {
		System.out.println("This is shape");
	}
}

class Rec extends S{
	public void p_Rectangle() {
		System.out.println("This is rectangular shape");
	}
	public Rec(){
			
		}
}

class Cir extends S{
	public void p_Circle() {
		System.out.println("This is circular shape");
	}
	public Cir(){
		
	}
	
}

class Squ extends Rec{
	public void p_Square() {
		System.out.println("Square is rectangle");
	}
	public Squ(){
		
	}
}

public class Shape_Inherit {
	public static void main(String[] args) {
        Squ s = new Squ();
        
        s.p_Shape();
        s.p_Rectangle();
        s.p_Square();
    }
}
