package basic;
import java.util.HashSet;
import java.util.Set;
public class set_retain {
	public static void main(String[] args) {
		Set<String> color = new HashSet<>();
		color.add("Red");
		color.add("Blue");
		color.add("Golden");
		color.add("Peach");
		System.out.println("1st Hashset is :- " + color);
		
		Set<String> color1 = new HashSet<>();
		color1.add("Red");
		color1.add("Green");
		color1.add("Golden");
		color1.add("Pink");
		System.out.println("2nd Hashset is :- " + color1);
		
		color.retainAll(color1);
		System.out.println("Hashset is :- " + color);
		}
}
