package basic;
import java.util.ArrayList;
import java.util.List;
public class Copy_list {
	public static void main(String[] args) {
		List<Integer> List1 = new ArrayList<>();
		List1.add(55);
		List1.add(20);
		List1.add(56);
		List1.add(28);
		List1.add(45);
		List1.add(32);
		List1.add(70);
		System.out.println("List1:- " + List1);
		
		List<Integer> List2 = new ArrayList<>();
		List2.addAll(List1);
		
		System.out.println("List2 (Copied List):- " + List2);
		
	
	}
}
