package basic;
import java.util.ArrayList;
import java.util.List;
public class list_sublist {
	public static void main(String[] args) {
		List<String> color = new ArrayList<>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Black");
		color.add("Golden");
		color.add("Peach");
		System.out.println("Original List:- " + color);
		
		List<String> color2 = color.subList(1, 4);
		System.out.println("Extracted List:- " + color2);
	}
}
