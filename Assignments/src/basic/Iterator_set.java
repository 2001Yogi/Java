package basic;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
public class Iterator_set {
	public static void main(String[] args) {
		Set<String> color = new HashSet<>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Black");
		System.out.println(color);
		Iterator itr = color.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
