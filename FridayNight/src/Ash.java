/*import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Ash extends JFrame{
	public static void main(String arg[]){
		Thread t1=new Thread(new Poke("alpha"));
		Thread t2=new Thread(new Poke("beta"));
		Thread t3=new Thread(new Poke("gamma"));
		t1.start();
		t2.start();
		t3.start();
		DisplayMode dm = new DisplayMode(800,600,16, DisplayMode.REFRESH_RATE_UNKNOWN);
		Ash b = new Ash();
		b.run();
	}
	
//	private Screen screen;
	private ScreenManager s;
	private Image bg;
	private Animation a;
	
	private static final DisplayMode modes1[]={
			new DisplayMode(800,600,32,0),
			new DisplayMode(800,600,24,0),
			new DisplayMode(800,600,16,0),
			new DisplayMode(640,480,32,0),
			new DisplayMode(640,480,24,0),
			new DisplayMode(640,480,16,0),
	};
	
	
	public void LoadImages(){
		bg = new ImageIcon("C:\\Users\\MasterAndrewJ\\Desktop\\screeensavers\\4b953e4c88c7f5f6d12d20cdb454fd60.jpg").getImage();
		Image face1 = new ImageIcon("C:\\Users\\MasterAndrewJ\\Desktop\\screeensavers\\ecdedba199a54f955b65f5749b62a7dc.jpg").getImage();
		Image face2 = new ImageIcon("C:\\Users\\MasterAndrewJ\\Desktop\\screeensavers\\autoportrait_in_handsome_jack_s_golden_mask_style_by_bembiann-d9vc6xr.jpg").getImage();
		
		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);
		
	}
	

	//main method called from main
	public void run(){
		s = new ScreenManager();
		try{
			DisplayMode dm = s.findFirstCompatibleMode(modes1);
			s.setFullScreen(dm);
			LoadImages();
			movieLoop();
		}finally{
			s.restoreScreen();
		}
	}
	
public void movieLoop(){
	long startingTime = System.currentTimeMillis();
	long cumTime= startingTime;
	while(cumTime - startingTime < 6000){
		long timePassed = System.currentTimeMillis() - cumTime;
		cumTime += timePassed;
		a.update(timePassed);
		
		Graphics2D g = s.getGraphics();
		draw(g);
		g.dispose();
		s.update();
		
		try{
			Thread.sleep(20);
		
		}catch(Exception ex){}
		}
	}

public void draw(Graphics g){
	g.drawImage(bg, 0, 0, null);
	g.drawImage(a.getImage(), 0,  0,  null);
	
}
}
	

	
	
	
	public void loadPics(){
		bg=new ImageIcon("C:\\Test\\10p8.png").getImage();
		Image face1 =new ImageIcon("C:\\Test\\109.png").getImage();
		Image face2= new ImageIcon("C:\\Test\\110.png").getImage();
		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);
	}
	public void run(DisplayMode dm){
		screen=new Screen();
		try{
			screen.setFullScreen(dm, new JFrame());
			loadPics();
			movieLoop();
		}finally{
			screen.restoreScreen();
		}
	}

	public void movieLoop(){
		long startingTime = System.currentTimeMillis();
		long cumTime = startingTime;
		
		while(cumTime - startingTime< 5000){
			long timePassed= System.currentTimeMillis()- cumTime;
			cumTime += timePassed;
			a.update(timePassed);
			
			Graphics g = screen.getFullScreenWindow().getGraphics();
			draw(g);
			g.dispose();
			
			
			try{
				Thread.sleep(20);
			}catch(Exception ex){}
		}
	}
	
	public void draw(Graphics g){
		g.drawImage(bg, 0, 0, null);
		g.drawImage(a.getImage(),0,0,null);
		
	}
	
	
	
	
	w
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
}*/












