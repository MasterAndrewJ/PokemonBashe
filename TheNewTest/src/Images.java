import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Images extends JFrame{
	public static void main(String arg[]){
	/*	Thread t1=new Thread(new Poke("alpha"));
		Thread t2=new Thread(new Poke("beta"));
		Thread t3=new Thread(new Poke("gamma"));
		t1.start();
		t2.start();
		t3.start();*/
		DisplayMode dm = new DisplayMode(800,600,16, DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i = new Images();
		i.run(dm);
	}
	private Screen s;
	private Image bg;
	private Image pic;
	private boolean loaded;
	
	
	public void run(DisplayMode dm){
		setBackground(Color.GRAY);
		setForeground(Color.WHITE);
		setFont(new Font("Arial",Font.PLAIN,24));
		loaded = false;
		
		s = new Screen();
		try{
			s.setFullScreen(dm,  this);
			loadpics();
			try{
				Thread.sleep(5000);
			}catch(Exception ex){}
		}finally{
			s.restoreScreen();
		}
	}
	/*public static BufferedImage enlarge(BufferedImage image) {
        
	       int w = 900 * image.getWidth();
	       int h = 900 * image.getHeight();
	        
	       BufferedImage enlargedImage =
	               new BufferedImage(w, h, image.getType());
	        
	       for (int y=0; y < h; ++y)
	           for (int x=0; x < w; ++x)
	               enlargedImage.setRGB(x, y, image.getRGB(x/n, y/n));
	        
	       return enlargedImage;
	   }*/
	
	public void loadpics(){
		bg = new ImageIcon("C:\\Test\\69.png").getImage();
		pic = new ImageIcon("C:\\Test\\72.png").getImage();
		loaded = true;
		repaint();
	}
	
	public void paint(Graphics g){
	if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D)g;
	g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		if(loaded){
			g.drawImage(bg,0,0,null);
			g.drawImage(pic, 170, 180, null);
		}
	}
}










