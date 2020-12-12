package tms;
import javax.swing.*;
import java.awt.*;
public class splash1 {
    public static void main(String[] args) {
		SplashFrame frame = new SplashFrame();
		frame.setVisible(true);
		int x = 110;
		for(int i=0;i<600;i+=6,x+=7) {
			frame.setLocation(950-((x+i)/2),500 - (i/2));
			frame.setSize(x+i-4,i);
			try {
				Thread.sleep(10);
			}catch(Exception e){}
		}
	}
}

class SplashFrame extends JFrame implements Runnable {
	Thread t1 ;
	SplashFrame(){
		
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tms/icons/splash.jpg"));
    Image i2 = i1.getImage().getScaledInstance(1400,900, Image.SCALE_DEFAULT);
	ImageIcon i3 = new ImageIcon(i2);
	JLabel l = new JLabel(i3);
	add(l);

	setUndecorated(true);
	t1 = new Thread(this);
	t1.start();
	}
	public void run() {
		try {
			Thread.sleep(7000);
			this.setVisible(false);
			
			new Login().setVisible(true);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}


