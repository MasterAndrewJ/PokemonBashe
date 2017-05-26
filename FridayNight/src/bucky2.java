import java.awt.*;
import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class bucky2 extends JFrame{
	public static void main(String arg[]){
		Thread t1=new Thread(new Poke("alpha"));
		Thread t2=new Thread(new Poke("beta"));
		Thread t3=new Thread(new Poke("gamma"));
		t1.start();
		t2.start();
		t3.start();
		DisplayMode dm = new DisplayMode(800,600,16, DisplayMode.REFRESH_RATE_UNKNOWN);
		bucky2 b = new bucky2();
		b.run();
	}
	
//	private Screen screen;
	private Sprite sprite;
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
		Image face1 = new ImageIcon("C:\\Users\\MasterAndrewJ\\Desktop\\screeensavers\\MediaHandler.jpg").getImage();
		Image face2 = new ImageIcon("C:\\Users\\MasterAndrewJ\\Desktop\\screeensavers\\handsome_jack_dakimakura_by_cyristal_artist-d9uubq5.png").getImage();
		
		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);
		
		
		sprite = new Sprite(a);
		sprite.setVelocityX(0.3f);
		sprite.setVelocityY(0.3f);
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
		update(timePassed);
		
		Graphics2D g = s.getGraphics();
		draw(g);
		g.dispose();
		s.update();
		
		try{
			Thread.sleep(20);
		
		}catch(Exception ex){}
		}
	}
//draws graohics
public void draw(Graphics g){
	g.drawImage(bg, 0, 0, null);
	g.drawImage(sprite.getImage(), Math.round(sprite.getX()), Math.round(sprite.getY()),null);	
}

//update sprite
public void update(long timePassed){
if(sprite.getX()< 0){
	sprite.setVelocityX(Math.abs(sprite.getVelocityX()));
}else if(sprite.getX() + sprite.getWidth() >= s.getWidth()){
	sprite.setVelocityX((-Math.abs(sprite.getVelocityX())));
}

if(sprite.getY()< 0){
	sprite.setVelocityY(Math.abs(sprite.getVelocityY()));
}else if(sprite.getY() + sprite.getHeight() >= s.getHeight()){
	sprite.setVelocityY((-Math.abs(sprite.getVelocityY())));
}
	
sprite.update(timePassed);
}











}
	

	








