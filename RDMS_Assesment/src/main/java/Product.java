
public class Product {
    private String name,company,p_id;
    private double price,quantity;
    
    public Product(String p_id, String name, String company, double quantity, double price ) {
        this.p_id = p_id;
        this.name = name;
        this.company = company;
        this.quantity = quantity;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", company=" + company + ", p_id=" + p_id + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
    
	
    
}
