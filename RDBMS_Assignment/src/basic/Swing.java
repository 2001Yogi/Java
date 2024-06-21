package basic;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

class DataNotFound{
	public DataNotFound() {
		JFrame fr = new JFrame("Alert");
		fr.setVisible(true);
		fr.setSize(300, 200);
		fr.setLayout(null);
		JLabel l1 = new JLabel("Data Not Found");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
	}
}

class SwingDemo implements ActionListener {
	
	JRadioButton r1,r2;
	JButton b1, b2, b3, b4, b5, b6;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4;
	

	SwingDemo() {
		
		JFrame fr = new JFrame("Registration Form");
		fr.setVisible(true);
		fr.setSize(1200, 1200);
		fr.setLayout(null);

		l1 = new JLabel("Id : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);

		l2 = new JLabel("Name : ");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);

		l3 = new JLabel("Gender : ");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(200, 160, 75, 20);
		fr.add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setBounds(270, 160, 100, 20);
		fr.add(r2);
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);bg.add(r2);  

		l4 = new JLabel("Address : ");
		l4.setBounds(100, 190, 120, 20);
		fr.add(l4);

		l5 = new JLabel("Contact : ");
		l5.setBounds(100, 220, 120, 20);
		fr.add(l5);

		t1 = new JTextField();
		t1.setBounds(200, 100, 120, 20);
		fr.add(t1);
		t2 = new JTextField();
		t2.setBounds(200, 130, 120, 20);
		fr.add(t2);
		t3 = new JTextField();
		t3.setBounds(200, 190, 120, 20);
		fr.add(t3);
		t4 = new JTextField();
		t4.setBounds(200, 220, 120, 20);
		fr.add(t4);  

		b1 = new JButton("Exit");
		b1.setBounds(100, 280, 120, 20);
		fr.add(b1);

		b2 = new JButton("Register");
		b2.setBounds(250, 280, 120, 20);
		fr.add(b2);

		b3 = new JButton("Delete");
		b3.setBounds(100, 310, 120, 20);
		fr.add(b3);

		b4 = new JButton("Update");
		b4.setBounds(250, 310, 120, 20);
		fr.add(b4);
		
		b5 = new JButton("Reset");
		b5.setBounds(165, 339, 120, 20);
		fr.add(b5);
		
		b6 = new JButton("Refresh Table");
		b6.setBounds(600, 420, 300, 20);
		fr.add(b6);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		r1.addActionListener(this);
		r2.addActionListener(this);
		b6.addActionListener(this);
		
		String[] columnNames = {"S.No","ID","Name","Gender","Address","Contact"};
		Object [][] data = {{}};
		
		JTable table = new JTable(data,columnNames);
		table.getTableHeader().setBounds(450, 100, 900, 20);
		table.setBounds(450, 100, 900, 300);
		fr.add(table.getTableHeader());
		fr.add(table);
		
		
    }


	public static Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("Exit button clicked");
			System.exit(0);
		} else if (e.getSource() == b2) {
			System.out.println("Register button clicked");
			int id = Integer.parseInt(t1.getText());
			System.out.println(id);
			String name = t2.getText();
			System.out.println(name);
			String gender = " ";
			if(r1.isSelected()) {
				gender = "Male";
			}else if(r2.isSelected()) {
				gender = "Female";
			}else {
				gender = "Other";
			}
			String address = t3.getText();
			System.out.println(address);
			long contact = Long.parseLong(t4.getText());
			System.out.println(contact);
			try {
				Connection conn = SwingDemo.createConnection();
				String sql="insert into user(id,name,gender,address,contact) values(?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setString(3, gender);
				pst.setString(4, address);
				pst.setLong(5, contact);
				pst.executeUpdate();
				System.out.println("data inserted");
				t1.setText("");
				t2.setText("");
				r1.setEnabled(false);
				r2.setEnabled(false);
				t3.setText("");
				t4.setText("");
//				executeUPdate->DML(insert,update,delete)
//				executeQuery->DQL(select)
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} 
		
	}
}


public class Swing {
	public static void main(String[] args) {
		new SwingDemo();
		
	}
}
