package basic;
import java.util.ArrayList;
import java.util.List;
public class position_list {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<>();
		List1.add("Grey");
		List1.add("Red");
		List1.add("Blue");
		List1.add("Golden");
		List1.add("Peach");
		
		System.out.println("List is:- " + List1);
		
		String index = List1.get(3);
		
		System.out.println("List element is at index is :- " + index);
	
	}
}
