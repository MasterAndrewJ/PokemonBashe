import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;	
public class Picture extends JPanel implements KeyListener{
	static Battle stat;
		static Main stats;
		static int namenum;
		static String[][] pokeLIST;
		static String name = "";
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//this.setBackground(Color.WHITE);
	//g.setColor(Color.BLUE);
		//g.fillRect(25,25,100,30);
		//g.setColor(new Color(190,81,215));
		//g.fillRect(25,65,100,30);
		try {
			UserMenu();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(Color.RED);
		g.drawString("A wild", 25, 105);
		if(!name.equals("")){
		g.drawString(name,65,105);}else{
			System.out.println("Propaganda!");
		}
		g.drawString("has aproahced you!", 145, 105);
		g.drawString("What will you do?", 25, 120);
		g.drawString("Fight", 25, 150);
		g.drawString("Bag", 100, 150);
		g.drawString("Pokemon", 25, 200);
		g.drawString("Run", 100, 200);
		g.fillRect(10, 145, 10, 2);
	}
public static void UserMenu() throws Exception{
	try{
	Battle stat = new Battle();
	Main stats = new Main();
	namenum= stats.poke_op;
	int pokemonNUMBER = 365;
	String[][] pokeLIST = new String[pokemonNUMBER][];
	pokeLIST= stat.PokemonInt();
	name = pokeLIST[namenum][1];
	}
	catch (Exception e){
		e.printStackTrace();
		System.out.println(pokeLIST[2][1]);
		System.out.println(name);
	
	}
}
@Override
public void keyPressed(KeyEvent e) {
	paintComponent();
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_RIGHT){
		g.drawString("PROPAGANDA COMUNIST PROPAGANDA!!!", 100, 200);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
	
	
	
	
	
	
}