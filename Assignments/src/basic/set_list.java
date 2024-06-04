package basic;
import java.util.ArrayList;
import java.util.List;
public class set_list {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<>();
		List1.add("Grey");
		List1.add("Red");
		List1.add("Blue");
		List1.add("Golden");
		List1.add("Peach");
		
		System.out.println("List is:- " + List1);
		List1.set(2, "Green");
		
		System.out.println("New List is:- " + List1);
	
	}
}
