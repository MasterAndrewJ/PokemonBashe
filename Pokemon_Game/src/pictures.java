import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class pictures extends JPanel{
	Battle stat = new Battle();
		Main stats = new Main();
		int namenum= stats.poke_op;
		String[][] pokeLIST= stat.PokemonInt();
		String name = pokeLIST[namenum][1];
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//this.setBackground(Color.WHITE);
	//g.setColor(Color.BLUE);
		//g.fillRect(25,25,100,30);
		//g.setColor(new Color(190,81,215));
		//g.fillRect(25,65,100,30);
		g.setColor(Color.RED);
		g.drawString("A wild", 25, 105);
		g.drawString(name, 70, 105);
		g.drawString("has aproahced you!", 145, 105);
		g.drawString("What will you do?", 25, 120);
		
	}
public static void UserMenu(){
	
	
	
	
}
	
	
	
	
	
	
}
