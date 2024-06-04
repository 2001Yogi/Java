package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Join_list {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<>();
		List1.add("Hello Java,");
		System.out.println("Before Join:- " + List1);
		
		List<String> List2 = new ArrayList<>();
		List2.add("Welcome to World");
		
		//Join both list using Addall method
		List1.addAll(List2);
		System.out.println("After Join:- " + List1);
	
	
	}
}
