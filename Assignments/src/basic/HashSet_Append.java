package basic;
import java.util.HashSet;
import java.util.Set;
public class HashSet_Append {
	public static void main(String[] args) {
	Set<String> color = new HashSet<>();
	color.add("Red");
	color.add("Blue");
	color.add("Golden");
	color.add("Peach");
	
	System.out.println("Original Set:- " + color);
	
	color.add("Green");
	System.out.println("Set after Append new Element:- " + color);
	}
}
