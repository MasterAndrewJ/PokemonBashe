

	import javax.swing.JFrame;

	import java.util.Scanner;
	import java.awt.*;
	import java.awt.Graphics;
	import java.applet.Applet;
	import java.awt.Graphics2D;
	import javax.swing.*;
	import javax.swing.JFrame;
	import java.awt.*;
	import java.awt.Graphics;
import java.io.*;
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
		static  int pl[]=new int[7];
		static int op[]=new int[7];

		 int poke_op=poke.poke_op;
		int poke_1=poke.poke_1;
		static String[][] pokeMOVES=new String[365][];
		static String[][] pokeLIST=new String[365][];
		static final int pokemonNUMBER = 365;
		public Battle() throws Exception{
				
		} 
		String name;
		public Battle(String s){
			name=s;
			System.out.println(name);
		}
	
		
		public static String[][] PokemonInt() throws Exception{
			Main poke = new Main();
			int poke_op=poke.poke_op;
			int poke_1=poke.poke_1;	
			//HashSet<Integer> mySet= new HashSet<Integer>();
			//String csvfile= "C:\\Users\\250148\\workspace\\NewTest\\resource\\Pokemon.csv";
			BufferedReader br= null;
			String line ="";
			String splitBy= ",";
			br = new BufferedReader(new FileReader("resource\\Pokemon.csv"));
			pokeLIST = new String[pokemonNUMBER][] ;
			for(int i=0;(line=br.readLine()) != null && i < pokemonNUMBER;i++){
				pokeLIST[i] = line.split(splitBy);
			}
			System.out.println(pokeLIST);
			System.out.println("hi");
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
			
		public static int associate(int poke_op, int poke_1){
			
			
        op[0] = Integer.parseInt(pokeLIST[poke_op-1][4]);
        op[1] = Integer.parseInt(pokeLIST[poke_op-1][5]);
        op[2] = Integer.parseInt(pokeLIST[poke_op-1][6]);
        op[3] = Integer.parseInt(pokeLIST[poke_op-1][7]);
        op[4] = Integer.parseInt(pokeLIST[poke_op-1][8]);
        op[5] = Integer.parseInt(pokeLIST[poke_op-1][9]);
        op[6] = Integer.parseInt(pokeLIST[poke_op-1][10]);
      
        pl[0] = Integer.parseInt(pokeLIST[poke_1-1][4]);
        pl[1] = Integer.parseInt(pokeLIST[poke_1-1][5]);
        pl[2] = Integer.parseInt(pokeLIST[poke_1-1][6]);
        pl[3] = Integer.parseInt(pokeLIST[poke_1-1][7]);
        pl[4] = Integer.parseInt(pokeLIST[poke_1-1][8]);
        pl[5] = Integer.parseInt(pokeLIST[poke_1-1][9]);
        pl[6] = Integer.parseInt(pokeLIST[poke_1-1][10]);
        
     
System.out.println(op[0]-pl[6]);
			return 0;
		}
		
		public static int Move(int target,int move, int level){
			if(target==1){
				int temp1=op[0]*level;
				int temp2=Integer.parseInt(pokeMOVES[move][6]);
				int temp3= temp1-temp2;
				return temp3;
				
			}else{
				int temp1=pl[0]*level;
				int temp2=Integer.parseInt(pokeMOVES[move][6]);
				int temp3= temp1-temp2;
				return temp3;
			
		}
		}
		public static void Moves() throws IOException{
	int j=741;
			//HashSet<Integer> mySet= new HashSet<Integer>();
			//String csvfile= "C:\\Users\\250148\\workspace\\NewTest\\resource\\PokemonMoves.csv";
			BufferedReader br= null;
			String line ="";
			String splitBy= ",";
			br = new BufferedReader(new FileReader("resource\\PokemonMoves.csv"));
			pokeMOVES = new String[j][] ;
			for(int i=0;(line=br.readLine()) != null && i < j;i++){
				pokeMOVES[i] = line.split(splitBy);
				
			}
			
			System.out.println(pokeMOVES[33][5]);
			
			
		}
			
		public static void turn(){
			
			
			
		}
			
			
		}
		/*public static string readArray(String fle){
			int
			try{
				Scanner s1=new Scanner(new File(file));
			}
			catch (FileNotFoundExeption){
				System.out.println("filenot found");
			}
		}*/
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
