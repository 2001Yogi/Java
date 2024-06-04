package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_sort {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(55);
		num.add(20);
		num.add(56);
		num.add(28);
		num.add(45);
		num.add(32);
		num.add(70);
		
		System.out.println("List without Sorting:- " + num);
		
//		Sorting done from Collection class and sort method
		
		Collections.sort(num);
		System.out.println("List with Sorting:- " + num);
		
	
	}
}
