import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseInput extends Core implements KeyListener, MouseMotionListener, MouseListener, MouseWheelListener {
public static void main(String[] args){
	new MouseInput().run();
}

private String mess="";

//init calls super init
public void init(){
	super.init();
	Window w =s.getFullScreenWindow();
	w.addMouseMotionListener(this);
	w.addMouseListener(this);
	w.addMouseWheelListener(this);
	w.addKeyListener(this);
}

//draw
public synchronized void draw(Graphics2D g){
	Window w =s.getFullScreenWindow();
	g.setColor(w.getBackground());
	g.fillRect(0, 0, s.getWidth(), s.getHeight());
	g.setColor(w.getForeground());
	g.drawString(mess,  40,  50);
}

//mouse listener interface
public void mousePressed(MouseEvent e){
	mess= "you pressed down the mouse ";
}
public void mouseReleased(MouseEvent e){
	mess= "you released the mouse ";
}
public void mouseClicked(MouseEvent e){}
public void Entered(MouseEvent e){}
public void Exited(MouseEvent e){}

//mouse motion interface
public void mouseDragged(MouseEvent e){
	mess= "you adre dragging the mouse";
}

public void mouseMoved(MouseEvent e){
	mess= "you are moving the mouse";
}

//wheel interface
public void mouseWheelMoved(MouseWheelEvent e){
	mess="moving mouse wheel";
}

//keyPressed
public void keyPressed(KeyEvent e){
	int keyCode = e.getKeyCode();
	if(keyCode == KeyEvent.VK_ESCAPE){
	stop();	
	}else{
		mess= "Pressed : "+ KeyEvent.getKeyText(keyCode);
		e.consume();
	}
}

//keyReleased
public void keyReleased(KeyEvent e) {
	int keyCode= e.getKeyCode();
	mess = "Released :"+ KeyEvent.getKeyText(keyCode);
	e.consume();
}

//last method from nterface
public void keyTyped(KeyEvent e){
	e.consume();
}




}
