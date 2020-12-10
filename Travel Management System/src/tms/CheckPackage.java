package tms;
import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {
	JPanel p1,p2,p3;
	
	public CheckPackage() {
		// TODO Auto-generated constructor stub
		setBounds(450,200,1100,700);
		//setLayout(null);
		getContentPane().setBackground(new Color(217, 200, 246));
		
		String [] pack1 ;
		pack1 = new String[] {"PLATINIUM PACKAGE","Six days and Seven nights","Airport Assistance","Half day city Tour","Daily Buffet","Welcome drniks on Arrival","FULL DAY ISLAND CRUISE ","English Speaking Guide","Hurry up !! Book fast","Winter Special","25000 /- per person" , "tms/icons/package1.jpg"};
		
		String [] pack2 ;
		pack2 = new String [] {"GOLD PACKAGE" , "four days and five nights" , "Airport Assistance" , "Small evening tour" ,"Buffet" , "Welcome Drinks on Arrival" , "FULL DAY ISLAND CRUISE" , "English Speaking Guide" , "Hurry up !! Book fast","Winter Special","15000 /- per person" , "tms/icons/package2.jpg"};
		
		String [] pack3;
		pack3 = new String[] {"SILVER PACKAGE" , "2 days and 3 nights" , "CAB Assisstance" , "Walk to Mall road" ,"Buffet" ,"Welcome Drinks on Arrival" ,"HALF DAY ISLAND CRUISE" , "English speaking Guide" ,"Hurry up !! Book fast","Winter Special","9000 /- per person" , "tms/icons/package3.jpg"};
		
		p1 = createPackage(pack1);
		p2 = createPackage(pack2);
		p3 = createPackage(pack3);
		JTabbedPane pane  =  new JTabbedPane();
		pane.addTab("PLATINIUM", null,p1);
		pane.addTab("GOLD", null,p2);
		pane.addTab("SILVER", null,p3);
		add(pane , BorderLayout.CENTER);
	}
	
	public JPanel createPackage(String[] pack) {
		JPanel p5 = new JPanel();
		p5.setLayout(null);
		//p5.setBounds(0,0,900,700);
		p5.setBackground(new Color(0,0,0));
		
		
		JLabel l1 = new JLabel(pack[0]);
		l1.setBounds(50,25,500,50);
		l1.setFont(new Font("TAHOMA" , Font.ITALIC , 40));
		l1.setForeground(Color.red);
		p5.add(l1);
	
		JLabel l2 = new JLabel(pack[1]);
		l2.setBounds(40,100,700,30);
		l2.setFont(new Font("TAHOMA" , Font.ITALIC , 30));
		l2.setForeground(Color.blue);
		p5.add(l2);
		
		JLabel l3 = new JLabel(pack[2]);
		l3.setBounds(40,150,500,30);
		l3.setFont(new Font("TAHOMA" , Font.ITALIC , 30));
		l3.setForeground(Color.green);
		p5.add(l3);
	
		JLabel l4 = new JLabel(pack[3]);
		l4.setBounds(40,200,500,30);
		l4.setFont(new Font("TAHOMA" , Font.ITALIC , 30));
		l4.setForeground(Color.pink);
		p5.add(l4);
		
		JLabel l5 = new JLabel(pack[4]);
		l5.setBounds(40,250,500,30);
		l5.setFont(new Font("TAHOMA" , Font.ITALIC , 30));
		l5.setForeground(Color.orange);
		p5.add(l5);
		
		JLabel l6 = new JLabel(pack[5]);
		l6.setBounds(40,300,500,30);
		l6.setFont(new Font("TAHOMA" , Font.ITALIC , 30));
		l6.setForeground(new Color(217, 99, 12));
		p5.add(l6);
		
		JLabel l7 = new JLabel(pack[6]);
		l7.setBounds(40,350,500,30);
		l7.setFont(new Font("TAHOMA" , Font.ITALIC , 30));
		l7.setForeground(new Color(220, 229, 59));
		p5.add(l7);
		
		JLabel l8 = new JLabel(pack[7]);
		l8.setBounds(40,400,500,30);
		l8.setFont(new Font("TAHOMA" , Font.ITALIC , 30));
		l8.setForeground(new Color(0, 229, 59));
		p5.add(l8);
		
		JLabel l9 = new JLabel(pack[8]);
		l9.setBounds(30,470,500,50);
		l9.setFont(new Font("TAHOMA" , Font.BOLD, 40));
		l9.setForeground(new Color(255, 229, 0));
		p5.add(l9);
		
		JLabel l10 = new JLabel(pack[9]);
		l10.setBounds(540,530,400,50);
		l10.setFont(new Font("TAHOMA" , Font.BOLD, 40));
		l10.setForeground(new Color(127, 229, 0));
		p5.add(l10);
		
		JLabel l11 = new JLabel(pack[10]);
		l11.setBounds(30,530,500,50);
		l11.setFont(new Font("TAHOMA" , Font.BOLD, 40));
		l11.setForeground(new Color(255, 0, 0));
		p5.add(l11);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(pack[11]));
		Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel l12 = new JLabel(i3);
		l12.setBounds(550,100,500,300);
		p5.add(l12);
		
		return p5;
	}
}
