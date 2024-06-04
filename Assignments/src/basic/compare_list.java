package basic;
import java.util.ArrayList;
import java.util.List;
public class compare_list {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<>();
		List1.add("Red");
		List1.add("Blue");
		List1.add("Yellow");
		List1.add("Black");
		List1.add("Golden");
		List1.add("Peach");
		System.out.println("1st List:- " + List1);
		
		List<String> List2 = new ArrayList<>();
		List2.add("Red");
		List2.add("Blue");
		List2.add("Yellow");
		List2.add("Black");
		List2.add("Pink");
		List2.add("Peach");
		System.out.println("2nd List:- " + List2);
		
		if(List1.equals(List2) == true) {
			System.out.println("Both Lists are Equal");
		}else {
			System.out.println("Lists are not Equal");
		}
	}
}
