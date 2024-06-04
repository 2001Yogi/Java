package basic;
import java.util.ArrayList;
import java.util.List;
public class Update_list_element {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println("Original List:- " + fruits);
		
		fruits.set(2,"Litchi");
		System.out.println("Updated List :- " + fruits);
	}
}
