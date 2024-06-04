package basic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_List {
	public static void main(String[] args) {
		List<String> color = new ArrayList<>();
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
