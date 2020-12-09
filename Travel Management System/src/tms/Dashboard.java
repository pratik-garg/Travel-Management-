package tms;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;


public class Dashboard  extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	String us1;
	
	
	Dashboard(String us1){
		this.us1 = us1;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0, 1950, 70);
		p1.setBackground(new Color(0,0,102));
		add(p1);
		
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,70,300,1000);
		p2.setBackground(new Color(0,0,102));
		add(p2);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/home.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1950, 1080, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel l1 = new JLabel(i3);
		l1.setBounds(0,0,1950,1080);
		add(l1);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/Dashboard2.png"));
		Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		
		JLabel l2 = new JLabel(i6);
		l2.setBounds(0,0,70,70);
		p1.add(l2);
		
		JLabel l3 = new JLabel("Dashboard");
		l3.setBounds(95,10,300,50);
		l3.setFont(new Font("TAHOMA" , Font.PLAIN , 30));
		l3.setForeground(Color.white);
		p1.add(l3);
		
		b1 = new JButton("ADD PERSONAL DETAILS");
		b1.setBackground(new Color(0,0,192));
		b1.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b1.setForeground(Color.white);
		b1.setBounds(0, 0, 300, 50);
		b1.addActionListener(this);
	//	b1.setMargin(new Insets(0,0,0,60));
		p2.add(b1);
		
		b2 = new JButton("UPDATE PERSONAL DETAILS");
		b2.setBackground(new Color(0,0,192));
		b2.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b2.setForeground(Color.white);
		b2.setBounds(0, 50, 300, 50);
		p2.add(b2);
		
		b3 = new JButton("VIEW DETAILS");
		b3.setBackground(new Color(0,0,192));
		b3.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b3.setForeground(Color.white);
		b3.setBounds(0, 100, 300, 50);
		p2.add(b3);
		
		b4 = new JButton("DELETE PERSONAL DETAILS");
		b4.setBackground(new Color(0,0,192));
		b4.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b4.setForeground(Color.white);
		b4.setBounds(0, 150, 300, 50);
		p2.add(b4);
		
		b5 = new JButton("CHECK PACKAGE");
		b5.setBackground(new Color(0,0,192));
		b5.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b5.setForeground(Color.white);
		b5.setBounds(0, 200, 300, 50);
		p2.add(b5);
		
		b6 = new JButton("BOOK PACKAGE");
		b6.setBackground(new Color(0,0,192));
		b6.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b6.setForeground(Color.white);
		b6.setBounds(0, 250, 300, 50);
		p2.add(b6);
		
		b7 = new JButton("VIEW PACKAGE");
		b7.setBackground(new Color(0,0,192));
		b7.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b7.setForeground(Color.white);
		b7.setBounds(0, 300, 300, 50);
		p2.add(b7);
		
		
		b8 = new JButton("VIEW HOTELS");
		b8.setBackground(new Color(0,0,192));
		b8.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b8.setForeground(Color.white);
		b8.setBounds(0, 350, 300, 50);
		p2.add(b8);
		
		b9 = new JButton("BOOK HOTELS");
		b9.setBackground(new Color(0,0,192));
		b9.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b9.setForeground(Color.white);
		b9.setBounds(0, 400, 300, 50);
		p2.add(b9);
		
		b10 = new JButton("VIEW BOOKED HOTEL");
		b10.setBackground(new Color(0,0,192));
		b10.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b10.setForeground(Color.white);
		b10.setBounds(0, 450, 300, 50);
		p2.add(b10);
		
		b11 = new JButton("DESTINATIONS");
		b11.setBackground(new Color(0,0,192));
		b11.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b11.setForeground(Color.white);
		b11.setBounds(0, 500, 300, 50);
		p2.add(b11);
		
		b12 = new JButton("PAYMENT");
		b12.setBackground(new Color(0,0,192));
		b12.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b12.setForeground(Color.white);
		b12.setBounds(0, 550, 300, 50);
		p2.add(b12);
		
		b13 = new JButton("CALCULATOR");
		b13.setBackground(new Color(0,0,192));
		b13.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b13.setForeground(Color.white);
		b13.setBounds(0, 600, 300, 50);
		b13.addActionListener(this);
		p2.add(b13);
		
		b14 = new JButton("NOTEPAD");
		b14.setBackground(new Color(0,0,192));
		b14.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b14.setForeground(Color.white);
		b14.setBounds(0, 650, 300, 50);
		p2.add(b14);
		
		b15 = new JButton("ABOUT");
		b15.setBackground(new Color(0,0,192));
		b15.setFont(new Font("TAHOMA" , Font.PLAIN , 20));
		b15.setForeground(Color.white);
		b15.setBounds(0, 700, 300, 50);
		p2.add(b15);
		
		JLabel l4 = new JLabel("Tour And Travel Management System");
		l4.setBounds(600,100,1000,60);
		l4.setForeground(Color.white);
		l4.setFont(new Font("TAHOMA" , Font.PLAIN , 50));
		l1.add(l4);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() ==  b1) {
			try {
				new AddCustomer(us1).setVisible(true);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == b13) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}
			catch(Exception e) {}
		}
		
		else if(ae.getSource() == b14) {
			try {
				Runtime.getRuntime().exec("notedpad.exe");
			}
			catch(Exception e) {}
		}
	}
}
