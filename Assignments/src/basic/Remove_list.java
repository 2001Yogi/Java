package basic;
import java.util.ArrayList;
import java.util.List;
public class Remove_list {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println("Original List:- " + fruits);
		
		fruits.remove(2);
		System.out.println("Updated List after removing Element :- " + fruits);
	}
}
