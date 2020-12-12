package tms;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewBookPackage extends JFrame implements ActionListener {
	
	JButton b1;
	ViewBookPackage(String user){
		
		setBounds(600,250,800,600);
		getContentPane().setBackground(Color.black);
		setLayout(null);
		
		JLabel l1 = new JLabel("Username :");
		l1.setBounds(35,50,150, 50);
		l1.setFont(new Font("TAHOMA" , Font.PLAIN , 22));
		l1.setForeground(Color.white);
		add(l1);
		
		JLabel t1 = new JLabel();
		t1.setBounds(200,50,200,50);
		t1.setFont(new Font("TAHOMA" , Font.ITALIC, 22));
		t1.setForeground(Color.white);
		add(t1);
		
		JLabel l2 = new JLabel("Package :");
		l2.setBounds(35,105,150, 50);
		l2.setFont(new Font("TAHOMA" , Font.PLAIN , 22));
		l2.setForeground(Color.white);
		add(l2);
		
		JLabel t2 = new JLabel("");
		t2.setBounds(200,105,200,50);
		t2.setFont(new Font("TAHOMA" , Font.ITALIC, 22));
		t2.setForeground(Color.white);
		add(t2);
		
		JLabel l3 = new JLabel("Total persons :");
		l3.setBounds(35,160,200, 50);
		l3.setFont(new Font("TAHOMA" , Font.PLAIN , 22));
		l3.setForeground(Color.white);
		add(l3);
		
		JLabel t3 = new JLabel("");
		t3.setBounds(215,160,200,50);
		t3.setFont(new Font("TAHOMA" , Font.ITALIC, 22));
		t3.setForeground(Color.white);
		add(t3);
		
		JLabel l4 = new JLabel("Price :");
		l4.setBounds(35,215,150, 50);
		l4.setFont(new Font("TAHOMA" , Font.PLAIN , 22));
		l4.setForeground(Color.white);
		add(l4);
		
		JLabel t4 = new JLabel("");
		t4.setBounds(200,215,200,50);
		t4.setFont(new Font("TAHOMA" , Font.ITALIC, 22));
		t4.setForeground(Color.white);
		add(t4);
		
		JLabel l5 = new JLabel("ID :");
		l5.setBounds(35,270,150, 50);
		l5.setFont(new Font("TAHOMA" , Font.PLAIN , 22));
		l5.setForeground(Color.white);
		add(l5);
		
		JLabel t5 = new JLabel("");
		t5.setBounds(200,270,200,50);
		t5.setFont(new Font("TAHOMA" , Font.ITALIC, 22));
		t5.setForeground(Color.white);
		add(t5);
		
		JLabel l6 = new JLabel("Number :");
		l6.setBounds(35,325,150, 50);
		l6.setFont(new Font("TAHOMA" , Font.PLAIN , 22));
		l6.setForeground(Color.white);
		add(l6);
		
		JLabel t6 = new JLabel("");
		t6.setBounds(200,325,200,50);
		t6.setFont(new Font("TAHOMA" , Font.ITALIC, 22));
		t6.setForeground(Color.white);
		add(t6);
		
		JLabel l7 = new JLabel("Phone :");
		l7.setBounds(35,380,150, 50);
		l7.setFont(new Font("TAHOMA" , Font.PLAIN , 22));
		l7.setForeground(Color.white);
		add(l7);
		
		JLabel t7 = new JLabel("");
		t7.setBounds(200,380,200,50);
		t7.setFont(new Font("TAHOMA" , Font.ITALIC, 22));
		t7.setForeground(Color.white);
		add(t7);
		
		b1 = new JButton("Back");
		b1.setBounds(120,450,120,30);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setFont(new Font("TAHOMA" , Font.PLAIN , 16));
		b1.addActionListener(this);
		add(b1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/bookedDetails.jpg"));
		Image i2 = i1.getImage().getScaledInstance(350, 350,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(410,100,350,350);
		add(image);
		
		try {
			Conn c1 = new Conn();
			String sql = "select * from bookpackage where username = '" +user+ "'";
			ResultSet rs = c1.st.executeQuery(sql);
			if(rs.next()) {
				t1.setText(new String(rs.getString("username")));
				t2.setText(new String(rs.getString("package")));
				t3.setText(new String(rs.getString("persons")));
				t4.setText(new String(rs.getString("price")));
			}
			
			String sql2 = "select * from customer where username = '"+user+"'";
			ResultSet rs2 = c1.st.executeQuery(sql2);
			if(rs2.next()) {
				t5.setText(new String(rs2.getString("id")));
				t6.setText(new String(rs2.getString("number")));
				t7.setText(new String(rs2.getString("phone")));
			}	
		}
		catch(Exception e) {}
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			this.setVisible(false);
		}
	}
	
	public static void main(String args[]) {
		new ViewBookPackage("golubhaii").setVisible(true);
	}
}
