package basic;
import java.util.ArrayList;
import java.util.List;

public class List_get_index {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println("Original List:- " + fruits);
		
		String element = fruits.get(2);
		System.out.println("The Element at index is :- " + element);
	}
}
