import javax.swing.JFrame;

import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Graphics;

import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;

import java.util.Scanner;
public class Battle {
	Main poke = new Main();
	int poke_op=poke.poke_op;
	int poke_1=poke.poke_1;
	String[][] pokeLIST=new String[365][];
	static final int pokemonNUMBER = 365;
	public Battle() throws Exception{
			
	} 
	
	
	public static String[][] PokemonInt() throws Exception{
		Main poke = new Main();
		int poke_op=poke.poke_op;
		int poke_1=poke.poke_1;	
		//HashSet<Integer> mySet= new HashSet<Integer>();
		String csvfile = "C:\\Users\\250148\\workspace\\Pokemon_Game\\resource\\Pokemon.csv";
		BufferedReader br= null;
		String line ="";
		String splitBy= ",";
		br = new BufferedReader(new FileReader(csvfile));
		String[][] pokeLIST = new String[pokemonNUMBER][] ;
		for(int i=0;(line=br.readLine()) != null && i < pokemonNUMBER;i++){
			pokeLIST[i] = line.split(splitBy);
		}
		return pokeLIST;
		
		
		/*for(int j = 0; j < pokemonNUMBER; j++)
		{
			for(int i = 0; i < pokeLIST[j].length; i++)
				System.out.print(pokeLIST[j][i] + " ");
		System.out.println("");
		}
		System.out.println("What will you do?");	
		*/
	}
		
	
	
	public static void UserScreen(){
		int select=1;
		JFrame f=new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pictures p= new pictures();
		f.add(p);
		f.setSize(400, 250);
		f.setVisible(true);


		try {
			p.UserMenu();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.paintComponent(f.getGraphics());
		int c = e.getKeyCode ()
		if (event.getKeyCode() == KeyEvent.VK_UP) {
		
		
		
		
	}
	}
