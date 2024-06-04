package basic;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
public class set_to_listArray {
	public static void main(String[] args) {
		Set<String> color = new HashSet<>();
		color.add("Red");
		color.add("Blue");
		color.add("Golden");
		color.add("Peach");
		System.out.println("Hashset is :- " + color);
		
		
		List<String> list = new ArrayList<>(color);
		System.out.println("ArrayList is :- " + list);
		}
}
