package autowire;

public class Address {
	private int houseno;
	private String street;
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", street=" + street + "]";
	}
	
}
