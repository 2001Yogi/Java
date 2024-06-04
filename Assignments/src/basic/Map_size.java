package basic;
import java.util.HashMap;
import java.util.Map;
public class Map_size {
	public static void main(String[] args) {
		Map<Integer , String> user = new HashMap<>();
		user.put(1, "Yogita");
		user.put(2, "Muskan");
		user.put(3, "Hiral");
		user.put(4, "Kinjal");
		
		int size = user.size();
		
		System.out.println("The size of HashMap is:- " + size);
		}
}
