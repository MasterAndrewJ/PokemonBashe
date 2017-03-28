import javax.swing.JFrame;


import java.awt.*;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.*;
public class Main {
	int poke_op=20;
	int poke_1=94;
	public static void main(String[] args)throws Exception{
		Battle b = new Battle();
		b.UserScreen();
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int myint = Keyboard.nextInt();
		System.out.println(myint+"j");
	}

}
