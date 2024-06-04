package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class increase_size_array {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<>();
		List1.add("Grey");
		List1.add("Red");
		List1.add("Blue");
		List1.add("Golden");
		List1.add("Peach");
		
		System.out.println("List is:- " + List1);
		
		// increase size using ensurecapacity of collection class
		
		((ArrayList<String>) List1).ensureCapacity(6);
		
		List1.add("Pink");
		List1.add("Black");
		List1.add("Orange");
		System.out.println("List After increase size is:- " + List1);
	
	}
}
