package basic;
import java.util.HashSet;
import java.util.Set;
public class Set_size {
	public static void main(String[] args) {
		Set<String> color = new HashSet<>();
		color.add("Red");
		color.add("Blue");
		color.add("Golden");
		color.add("Peach");
		
		
		int size_ = color.size();
		System.out.println("The size of HashSet is:- " + size_);
		}
}
