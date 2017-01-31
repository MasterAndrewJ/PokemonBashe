import javax.swing.JFrame;
import javax.swing.*;
public class Main {

	int poke_op=19;
	int poke_1=94;
	public static void main(String[] args){
JFrame f=new JFrame("Title");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
pictures p= new pictures();
f.add(p);
f.setSize(400, 250);
f.setVisible(true);

	}

}
