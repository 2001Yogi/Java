package basic;

import java.util.Scanner;

public class Marks_Example{
	public static void Grade(int marks) {
		if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
        } else if (marks > 90) {
            System.out.println("Grade: A");
        } else if (marks > 80) {
            System.out.println("Grade: B");
        } else if (marks > 70) {
            System.out.println("Grade: B");
        } else if (marks > 60) {
            System.out.println("Grade: C");
        } else if (marks > 50) {
            System.out.println("Grade: D");
        } else if (marks > 40) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Grade: Fail");
        }
	}

public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);

    // Prompt the user to enter marks
    System.out.println("Enter your marks between 1 to 100:");
    int marks = sc.nextInt();

    Grade(marks);

 	}
}
