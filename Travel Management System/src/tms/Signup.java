package tms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class Signup extends JFrame implements ActionListener{
	JButton b4,b5;
	JTextField t1,t2,t5,t3;
	//JPasswordField t3;
	JComboBox c1;
	Signup(){
		setBounds(500,300,900,400);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(133,193,233));
		p1.setLayout(null);
		p1.setBounds(0,0,500,400);
		add(p1);
		
		JLabel l1 = new JLabel("Username");
		l1.setBounds(50,20,100,25);
		l1.setFont(new Font("TAHOMA", Font.BOLD, 16));
		p1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(220,20,250,25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t1);
		
		JLabel l2 = new JLabel("Name");
		l2.setBounds(50,60,100,25);
		l2.setFont(new Font("TAHOMA", Font.BOLD, 16));
		p1.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(220,60,250,25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t2);
		
		JLabel l3 = new JLabel("Password");
		l3.setBounds(50,100,100,25);
		l3.setFont(new Font("TAHOMA", Font.BOLD, 16));
		p1.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(220,100,250,25);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t3);
		
		JLabel l4 = new JLabel("Security Question");
		l4.setBounds(50,140,170,25);
		l4.setFont(new Font("TAHOMA", Font.BOLD, 16));
		p1.add(l4);
		
		c1 = new JComboBox(new String[] {"Your Favorite Color?","Your Favorite City?","Your First School teacher?","Your Childhood Superhero ?"} );
		c1.setBounds(220, 140,250,25);
		c1.setBackground(Color.white);
		c1.setForeground(Color.black);
	//	c1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(c1);
		
		JLabel l5 = new JLabel("Answer");
		l5.setBounds(50,180,100,25);
		l5.setFont(new Font("TAHOMA", Font.BOLD, 16));
		p1.add(l5);
		
		t5 = new JTextField();
		t5.setBounds(220,180,250,25);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t5);
		
		ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/signup.png"));
		JLabel l7 = new JLabel(i5);
		l7.setBounds(600,60,225,225);
		add(l7);
		
		
		b4 = new JButton("CREATE");
		b4.setBorder(BorderFactory.createEmptyBorder());
		b4.setFont(new Font("TAHOMA" , Font.BOLD , 14));
		b4.setBounds(115,250,100,25);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("BACK");
		b5.setBorder(BorderFactory.createEmptyBorder());
		b5.setFont(new Font("TAHOMA" , Font.BOLD , 14));
		b5.setBounds(270,250,100,25);
		b5.addActionListener(this);
		p1.add(b5);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		Conn con  = new Conn();
		try {
		if(ae.getSource() == b4) {
		/*	String username = t1.getText();
			String name = t2.getText();
			String password =  t3.getText();
			String security = c1.getSelectedItem();
			String answer = t5.getText();
			*/
			String sql = "insert into account (username,name,password,security,answer) values (?, ?, ?, ?, ?)";
			//Conn con  = new Conn();
		//	con.st.executeUpdate(query);
			PreparedStatement st = con.c.prepareStatement(sql);

			st.setString(1, t1.getText());
	        st.setString(2, t2.getText());
			st.setString(3, t3.getText());
			st.setString(4, (String)c1.getSelectedItem());
			st.setString(5, t5.getText());
		//	System.out.println("here 1");
			
		//	Conn c = new Conn();
		//	System.out.println("here 2");
		//	c.st.executeUpdate(query);
		//	System.out.println("here 3");
			
			int i = st.executeUpdate();
			if (i > 0){
	                    JOptionPane.showMessageDialog(null, "Account Created Successfully ");
	                     
	            			this.setVisible(false);
	            			new Login().setVisible(true);
	            	
	            	}
			
	        t1.setText("");
	        t2.setText("");
			t3.setText("");
			t5.setText("");
		}
	
		else if(ae.getSource() == b5) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
