package basic;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
public class Ques_12 {
	public static void main(String[] args) {
		LocalDateTime DateTime_1 = LocalDateTime.now();
		DateTimeFormatter DateTime_2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = DateTime_1.format(DateTime_2);
		System.out.println(formatDateTime);
	}
}
