package tms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ForgotPassword extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	ForgotPassword(){
		setBounds(550,250,850,400);
		setLayout(null);
		getContentPane().setBackground(new Color(193,233,131));
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/forgotpassword.jpg"));
		Image i2 = i1.getImage().getScaledInstance(225, 225, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l6 = new JLabel(i3);
		l6.setBounds(575,50,225,225);
		add(l6);
		
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(30,30,500,300);
		p1.setBackground(new Color(131,233,193));
		add(p1);
		
		JLabel l1 = new JLabel("Username");
		l1.setBounds(40, 20, 100, 25);
		l1.setFont(new Font("TAHOMA",Font.BOLD,15));
		p1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(170, 20, 200, 25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t1);
		
		b1 = new JButton("Search");
		b1.setBounds(380,20,100,25);
		b1.setBorder(BorderFactory.createEmptyBorder());
		b1.addActionListener(this);
		p1.add(b1);

		JLabel l2 = new JLabel("Name");
		l2.setBounds(40, 60, 100, 25);
		l2.setFont(new Font("TAHOMA",Font.BOLD,15));
		p1.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(170, 60, 200, 25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t2);
		
		JLabel l3 = new JLabel("Security Q.");
		l3.setBounds(40, 100, 300, 25);
		l3.setFont(new Font("TAHOMA",Font.BOLD,15));
		p1.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(170, 100, 200, 25);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t3);
		
		JLabel l4 = new JLabel("Answer");
		l4.setBounds(40, 140, 100, 25);
		l4.setFont(new Font("TAHOMA",Font.BOLD,15));
		p1.add(l4);
		
		t4 = new JTextField();
		t4.setBounds(170, 140, 200, 25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t4);
		
		b2 = new JButton("Retrieve");
		b2.setBounds(380,140,100,25);
		b2.setBorder(BorderFactory.createEmptyBorder());
		b2.addActionListener(this);
		p1.add(b2);
		
		
		JLabel l5 = new JLabel("Password");
		l5.setBounds(40, 180, 100, 25);
		l5.setFont(new Font("TAHOMA",Font.BOLD,15));
		p1.add(l5);
		
		t5 = new JTextField();
		t5.setBounds(170, 180, 200, 25);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t5);
		
		b3 = new JButton("BACK");
		b3.setBounds(200,250,100,25);
		b3.setBorder(BorderFactory.createEmptyBorder());
		b3.addActionListener(this);
		p1.add(b3);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		Conn c2 = new Conn();
		if(ae.getSource() == b1) {
			try {	
			String sql = "SELECT * FROM account where username = '"+ t1.getText()+"'";
			ResultSet rs = c2.st.executeQuery(sql);
			
				while(rs.next()) {
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("security"));
				}
			}
			catch(Exception e) {}
		
		}
		else if (ae.getSource() == b2) {
		try {
			String sql = "select password from account where answer = '" + t4.getText() + "' AND username ='" + t1.getText() + "'";
			ResultSet rs = c2.st.executeQuery(sql);
			while(rs.next()) {
				t5.setText(rs.getString("password"));
			}
		}
		catch(Exception e) {}
		}
		else if(ae.getSource() == b3) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
	}
	public static void main(String args[]) {
		new ForgotPassword().setVisible(true);
	}
}
