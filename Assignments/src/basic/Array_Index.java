package basic;
import java.util.ArrayList;
import java.util.List;
public class Array_Index {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		System.out.println("Original List:- " + fruits);
		
		fruits.add(0,"Guava");
		System.out.println("List after Add element at First position:- " + fruits);
	}
}
