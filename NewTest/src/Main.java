import javax.swing.JFrame;


import java.awt.*;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.*;
public class Main {
	static int poke_op=1;
	static int poke_1=94;
	public static void main(String[] args)throws Exception{
		Battle b = new Battle();
		Picture p =new Picture();
		b.PokemonInt();
		b.associate(poke_op , poke_1);
		b.Moves();
		int level=2;
		int move=1;
		int target=1;
		System.out.println(b.Move(target, move, level));
		//p.UserScreen();
		p.UserScreen();
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int myint = Keyboard.nextInt();
		System.out.println(myint+"j");
	}

}
