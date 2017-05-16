import java.awt.*;
import javax.swing.JFrame;
public class Ash extends JFrame{
	public static void main(String arg[]){
	/*	Thread t1=new Thread(new Poke("alpha"));
		Thread t2=new Thread(new Poke("beta"));
		Thread t3=new Thread(new Poke("gamma"));
		t1.start();
		t2.start();
		t3.start();*/
		DisplayMode dm = new DisplayMode(800,600,16, DisplayMode.REFRESH_RATE_UNKNOWN);
		Ash b = new Ash();
		b.run(dm);
	}
	public void run(DisplayMode dm){
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial",Font.PLAIN,24));
		
		Screen s = new Screen();
		try{
			s.setFullScreen(dm,  this);
			try{
				Thread.sleep(5000);
			}catch(Exception ex){}
		}finally{
			s.restoreScreen();
		}
	}
	public void paint(Graphics g){
	if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D)g;
	g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		g.drawString("''It's F*cking Lit''-Thomas Edison", 200, 200);
	}
}












