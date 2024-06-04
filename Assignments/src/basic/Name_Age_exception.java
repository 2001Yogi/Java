package basic;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(int age) {
        super("Age " + age + " is not within the range of 15 to 21.");
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String name) {
        super("Name '" + name + "' contains numbers or special symbols.");
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor to initialize attributes
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        if (!isValidName(name)) {
            throw new NameNotValidException(name);
        }
        this.name = name;
        if (!isValidAge(age)) {
            throw new AgeNotWithinRangeException(age);
        }
        this.age = age;
        this.course = course;
    }

    // Check if age is within range
    private boolean isValidAge(int age) {
        return age >= 15 && age <= 21;
    }

    // Check if name contains only alphabets
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}


public class Name_Age_exception {
	public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Yogita", 25, "Maths");
            System.out.println("Student created successfully.");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student s2 = new Student(2, "Alice123", 19, "Science");
            System.out.println("Student created successfully.");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
