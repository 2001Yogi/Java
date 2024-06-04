package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_list {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Guava");
		fruits.add("Pineapple");
		
		System.out.println("List without Shuffle:- " + fruits);
		
//		Shuffle done from Collection class and shuffle method
		
		Collections.shuffle(fruits);
		System.out.println("List with Shuffle:- " + fruits);
		
	
	}
}
