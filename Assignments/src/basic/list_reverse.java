package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_reverse {
	public static void main(String[] args) {
		List<String> color = new ArrayList<>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Black");
		
		System.out.println("Original List:- " + color);
		
//		reverse done from Collection class and reverse method
		
		Collections.reverse(color);;
		System.out.println("reverse List:- " + color);
		
	
	}
}
