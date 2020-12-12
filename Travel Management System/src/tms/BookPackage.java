package tms;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel t2,t5,t6,t7,t8;
	JComboBox c3;
	JTextField t4;
	String us11,final_price;
	public BookPackage(String us1) {
		// TODO Auto-generated constructor stub
		this.us11 = us1;
		setBounds(500,200,1100, 700);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/bookpackage.jpg"));
		Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
		JLabel im = new JLabel(i1);
		im.setBounds(550,100,500,500);
		add(im);
		
		JLabel l1 = new JLabel("Book Package");
		l1.setBounds(100,20,400, 50);
		l1.setFont(new Font("TAHOMA" , Font.BOLD , 40));
		l1.setForeground(Color.ORANGE);
		add(l1);
		
		JLabel l2 = new JLabel("Username :");
		l2.setBounds(40,120,200,30);
		l2.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l2);
		
		t2 = new JLabel();
		t2.setBounds(280,120,200,30);
		t2.setFont(new Font("TAHOMA", Font.ITALIC ,25 ));
		add(t2);
	
		
		JLabel l3 = new JLabel("Select Package :");
		l3.setBounds(40,165,250,30);
		l3.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l3);
		
		c3 = new JComboBox(new String[] {"Platinium" , "Gold" , "Silver"});
		c3.setBounds(280,165,200,30);
		c3.setFont(new Font("TAHOMA", Font.ITALIC ,20 ));
		add(c3);
	
		
		
		JLabel l4 = new JLabel("Total Persons :");
		l4.setBounds(40,210,250,30);
		l4.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l4);
		
		t4 = new JTextField("0");
		t4.setBounds(280,210,200,30);
		add(t4);
		
		
		JLabel l5 = new JLabel("ID :");
		l5.setBounds(40,255,250,30);
		l5.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l5);
		
		t5 = new JLabel();
		t5.setBounds(280,255,200,30);
		t5.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(t5);
		
		JLabel l6 = new JLabel("Number :");
		l6.setBounds(40,300,250,30);
		l6.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l6);
		
		t6 = new JLabel();
		t6.setBounds(280,300,200,30);
		t6.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(t6);
		
		JLabel l7 = new JLabel("Phone :");
		l7.setBounds(40,345,250,30);
		l7.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l7);
		
		t7 = new JLabel();
		t7.setBounds(280,345,200,30);
		t7.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(t7);
		
		JLabel l8 = new JLabel("Total Price :");
		l8.setBounds(40,390,250,30);
		l8.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l8);
		
		t8 = new JLabel();
		t8.setBounds(280,390,200,30);
		t8.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		t8.setForeground(Color.red);
		add(t8);
		
		b1 = new JButton("Check Price");
		b1.setBounds(80,500,200,30);
		b1.setBackground(Color.black);
		b1.setFont(new Font("SAN_SERIF" , Font.PLAIN, 20));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Book Package");
		b2.setBounds(300,500,200,30);
		b2.setBackground(Color.black);
		b2.setFont(new Font("SAN_SERIF" , Font.PLAIN, 20));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Back");
		b3.setBounds(165,550,200,30);
		b3.setBackground(Color.black);
		b3.setFont(new Font("SAN_SERIF" , Font.PLAIN, 20));
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		add(b3);
		
		
		try {
			Conn c10 = new Conn();
			String sql = "select * from customer where username = '"+us11+"'";
			ResultSet rs = c10.st.executeQuery(sql);
			if(rs.next()) {
				t2.setText(new String (rs.getString("username")));
				t5.setText(new String (rs.getString("id")));
				t6.setText(new String (rs.getString("number")));
				t7.setText(new String (rs.getString("phone")));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		Conn c9 = new Conn();
		if(ae.getSource() == b1) {
			try {
				String p1 = (String)c3.getSelectedItem();
				String p2 = t4.getText();
			//	System.out.println(p2);
				int no_of_persons=Integer.parseInt(p2);
				String sql = "select * from packages where package = '"+p1+"'";
				ResultSet rs = c9.st.executeQuery(sql);
				if(no_of_persons == 0) {
					JOptionPane.showMessageDialog(null,"Enter valid Number of persons");
				}
				if(rs.next()) {
					String x = rs.getString("price");
					int x1 = Integer.parseInt(x);
					int total_price = x1*no_of_persons;
					String f = String.valueOf(total_price);
					this.final_price = f;
					t8.setText(f + " /- only");
				}
			}catch(Exception e){}
		}
		
		else if(ae.getSource() == b2) {
		try {
			String p1 = (String)c3.getSelectedItem();
			String p2 = t4.getText();
		//  System.out.println(p2);
			int no_of_persons=Integer.parseInt(p2);
			String sql = "select * from packages where package = '"+p1+"'";
			ResultSet rs = c9.st.executeQuery(sql);
			if(no_of_persons == 0) {
				JOptionPane.showMessageDialog(null,"Enter valid Number of persons");
			}
			if(rs.next()) {
					String x = rs.getString("price");
					int x1 = Integer.parseInt(x);
					int total_price = x1*no_of_persons;
					String f = String.valueOf(total_price);
					this.final_price = f;
					t8.setText(f + " /- only");
			}
			
			String sql2 = "insert into bookpackage values ('"+us11+"','"+p1+"','"+final_price+"' ,'"+p2+"')";
			c9.st.executeUpdate(sql2);
			JOptionPane.showMessageDialog(null, "Package Booked Successfully");
			this.setVisible(false);
		}catch(Exception e) {}
	}
		
		
		else if(ae.getSource() == b3){
			this.setVisible(false);
		}
		
	}
}
