package tms;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener {
	JTextField t2,t3,t4,t5,t6,t7,t8,t9;
	JComboBox c1;
	JRadioButton r1,r2,r3,r4;
	JButton b1, b2;
	String us1,n1;
	public UpdateCustomer(String us1) {
	
		
		setBounds(600,250,800,700);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel l11 = new JLabel("Update Customer Details");
		l11.setBounds(50,15,400,60);
		l11.setFont(new Font("TAHOMA" , Font.PLAIN , 30));
		add(l11);
		
		JLabel l1 = new JLabel("UserName :");
		l1.setBounds(50,80,150,40);
		l1.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l1);
		
		JLabel t1 = new JLabel(us1);
		t1.setBounds(200,80,200,40);
		add(t1);
		
		
		JLabel l2 = new JLabel("ID Proof :");
		l2.setBounds(50,135,150,40);
		l2.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l2);
		
		c1 =  new JComboBox(new String[] {"Passport" , "Adhaar Card" , "Pan Card" , "Driving License"});
		c1.setBounds(200,135,200,40);
		add(c1);
		
		JLabel l3 = new JLabel("Number :");
		l3.setBounds(50,190,150,40);
		l3.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l3);
		
		t3 = new JTextField();
		t3.setBounds(200,190,200,40);
		add(t3);
		
		JLabel l4= new JLabel("Name :");
		l4.setBounds(50,235,100,40);
		l4.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l4);
		
		t4 = new JTextField();
		t4.setBounds(200,235,200,40);
		add(t4);
		
		JLabel l5 = new JLabel("Gender :");
		l5.setBounds(50,290,150,40);
		l5.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l5);
		
	/*	r1 = new  JRadioButton("MALE");
		r1.setBounds(200,290,90 , 40);
		r1.setBackground(Color.white);
		add(r1);
		
		r2 = new  JRadioButton("FEMALE");
		r2.setBackground(Color.white);
		r2.setBounds(300,290,90, 40);
		
		add(r2);
	
		r3 = new  JRadioButton("OTHERS");
		r3.setBounds(200,335,90,40);
		r3.setBackground(Color.white);
		add(r3);*/
		t5 =  new JTextField();
		t5.setBounds(200,290,200,40);
		add(t5);
		
		
		JLabel l6 = new JLabel("Country :");
		l6.setBounds(50,390,150,40);
		l6.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l6);
		
		t6= new JTextField();
		t6.setBounds(200,390,200,40);
		add(t6);
		
		JLabel l7 = new JLabel("Address :");
		l7.setBounds(50,445,150,40);
		l7.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l7);
		
		t7 = new JTextField();
		t7.setBounds(200,445,200,40);
		add(t7);
		 
		JLabel l8 = new JLabel("Phone :");
		l8.setBounds(50,500,150,40);
		l8.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l8);
		
		t8 = new JTextField();
		t8.setBounds(200,500,200,40);
		add(t8);
		
		
		JLabel l9 = new JLabel("Email :");
		l9.setBounds(50,555, 200, 40);
		l9.setFont(new Font("TAHOMA" , Font.PLAIN , 25));
		add(l9);
		
		t9 = new JTextField();
		t9.setBounds(200, 555, 200, 40);
		add(t9);
		
		b1 = new JButton("UPDATE");
		b1.setBounds(100,610,100,40);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("BACK");
		b2.setBounds(230,610,100,40);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/update.png"));
		Image i2 = i1.getImage().getScaledInstance(230, 350,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l10 = new JLabel(i3);
		l10.setBounds(500,150,230,350);
		add(l10);
		
		this.us1 = us1;
		//	System.out.println(us1);
			try {
				Conn ck =  new Conn();
				String sql = "select * from customer where username ='"+us1+"'"; 
				ResultSet rs = ck.st.executeQuery(sql);
				while(rs.next()) {
				//	t1.setText(rs.getString("username"));
					c1.setSelectedItem(rs.getString("id"));
					t3.setText(rs.getString("number"));
					t4.setText(rs.getString("name"));
					t5.setText(rs.getString("gender"));
					t6.setText(rs.getString("country"));
					t7.setText(rs.getString("address"));
					t8.setText(rs.getString("phone"));
					t9.setText(rs.getString("email"));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			
		//	String username = t1.getText();
			String id = (String)c1.getSelectedItem();
			String number =  t3.getText();
			String name = t4.getText();
			String gender = t5.getText();
			/*if(r1.isSelected()) {
				gender = "Male";
				r2.isSelected();
			}
			else if(r2.isSelected()) {
				gender = "Female";
			}
			else if(r3.isSelected()) {
				gender = "Others";
			}*/
			String country = t6.getText();
			String address = t7.getText();
			String phone =  t8.getText();
			String email =   t9.getText();
			String sql = "update customer set  id = '"+id+"' ,number =  '"+number+"' , name =  '"+name+"' ,gender =  '"+gender+"' , country = '"+country+"' , address = '"+address+"' ,phone =  '"+phone+"' ,email =  '"+email+"' where username = '" +us1+"'";
			try {
				Conn c1 = new Conn();
				c1.st.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Details Updated !! ");
				this.setVisible(false);
			}catch(Exception e) {}
		}
		
		else if (ae.getSource() == b2) {
			this.setVisible(false);
		}
	}
}
