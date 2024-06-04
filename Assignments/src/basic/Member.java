package basic;

public class Member {
	private String name,address;
	private int age;
    private long phoneNumber;
    private double salary;
    
    public Member(String name, String address, int age, long phoneNumber,double salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;   
        this.salary = salary;
    }
    
    public void printSalary() {
        System.out.println("Salary is " + salary);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    	
	public static void main(String[] args) {
		Member mem = new Member("Yogita", "G-405, Aakruti Township" ,21, 78954789625L ,50000.0 );
		
		mem.printSalary();
    }
}
