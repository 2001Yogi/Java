package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Swap_list {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<>();
		List1.add("Red");
		List1.add("Blue");
		List1.add("Yellow");
		List1.add("Black");
		List1.add("Golden");
		List1.add("Peach");
		System.out.println("Before Swapping:- " + List1);
		
//		swap done from Collection class and swap method
		Collections.swap(List1, 2, 4);
		
		System.out.println("After Swapping:- " + List1);
	
	
	}
}
