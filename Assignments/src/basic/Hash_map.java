package basic;
import java.util.HashMap;
import java.util.Map;

public class Hash_map {
	public static void main(String[] args) {
		Map<Integer , String> user = new HashMap<>();
		user.put(1, "Yogita");
		user.put(2, "Muskan");
		user.put(3, "Hiral");
		user.put(4, "Kinjal");
		
		System.out.println("The HashMap is:- " + user);
		}
}
