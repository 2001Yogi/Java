package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connectivity.DBConnectivity;
import model.Customer;
public class CustomerDao {
	public static void insertCustomer(Customer s) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "insert into customer(name,address,email,password,contact) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getAddress());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getPassword());
			pst.setLong(5, s.getContact());
			pst.executeUpdate();
			System.out.println("data Inserted");
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkEmail(String email){
		boolean flag = false;
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="select * from customer where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag =true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static Customer customerLogin(Customer s) {
		Customer s1 = null;
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="select * from customer where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s1 = new Customer();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));	
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
				s1.setContact(rs.getLong("contact"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;
	}
}
