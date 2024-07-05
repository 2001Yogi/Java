package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connectivity.DBConnectivity;
import model.student;

public class StudentDao {
	public static void insertStudent(student s) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "insert into student(fname,lname,email,mobile,address,gender,password,confirm_password) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getAddress());
			pst.setString(6, s.getGender());
			pst.setString(7, s.getPassword());
			pst.setString(8, s.getConfirm_password());
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
			String sql="select * from student where email=?";
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
	
	public static student studentLogin(student s) {
		student s1 = null;
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "select * from student where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s1 = new student();
				s1.setId(rs.getInt("id"));
				s1.setFname(rs.getString("fname"));
				s1.setLname(rs.getString("lname"));
				s1.setEmail(rs.getString("email"));
				s1.setMobile(rs.getLong("mobile"));
				s1.setAddress(rs.getString("address"));
				s1.setGender(rs.getString("gender"));
				s1.setPassword(rs.getString("psw"));
				s1.setConfirm_password(rs.getString("conf_psw"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1;
	}
	
	public static void updateStudentPassword(String email, String np) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="update student set password=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("password updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkOldPassword(String email, String op) {
		boolean flag = false;
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "select * from student where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag =true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
}
