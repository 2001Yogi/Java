package basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Index_of_list {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the index:- ");
		int a = sc.nextInt();
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Litchi");
		
		int index = fruits.indexOf("a");
		if(index <= fruits.size()) {
			System.out.println("element found at this Index");
		}else {
			System.out.println("element not found at this Index");
		}
	}
}
