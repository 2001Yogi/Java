package basic;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class set_to_Array {
	public static void main(String[] args) {
		Set<String> color = new HashSet<>();
		color.add("Red");
		color.add("Blue");
		color.add("Golden");
		color.add("Peach");
		
		
		String[] array = new String[color.size()];
		color.toArray(array);
		System.out.println("Array is :- " + color);
		}
}
