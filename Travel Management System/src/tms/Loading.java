package tms;
import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable{
	JProgressBar jp1;
	Thread t1 ;
	int s;
	String us1;
	Loading(String u1){
		us1 = u1;
		setBounds(700,250,700,400);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		JLabel l1 = new JLabel("Travel And Tourism Application");
		l1.setBounds(50,40,600,40);
		l1.setFont(new Font("RALEWAY" , Font.BOLD , 33));
		l1.setForeground(Color.red);
		add(l1);
		
		jp1 = new JProgressBar();
		jp1.setBounds(80,100,520,30);
		jp1.setStringPainted(true);
		add(jp1);
		
		JLabel l2 = new JLabel("Please Wait..");
		l2.setBounds(270,160,150,25);
		l2.setFont(new Font("RALEWAY" , Font.ITALIC , 20));
		add(l2);
		
		JLabel l3 = new JLabel("WELCOME " + us1);
		l3.setBounds(50,290,500,25);
		l3.setFont(new Font("TAHOMA" , Font.ITALIC , 20));
		l3.setForeground(Color.magenta);
		add(l3);
		
		t1 = new Thread(this,us1);
		t1.start();
	}
	public void run() {
		try {
		//	System.out.println("hii");
			for(int i=1;i<200;i++) {
				//s = s+ 1;
		//		System.out.println("hii");
				int m = jp1.getMaximum();  //100
		//		System.out.println("m = "  + m);
				int n = jp1.getValue();  //32
			//	System.out.println("n = " + n);
				if(n<m) {
					jp1.setValue(jp1.getValue() + 1);
				}
				else {
					i = 201;
					this.setVisible(false);
					new Dashboard(us1).setVisible(true);
				}
				Thread.sleep(40);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

