

import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class AI_Battle {
	static final int pokemonNUMBER = 365;
	public AI_Battle() throws Exception{
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
		for(int j = 0; j < pokemonNUMBER; j++)
		{
			for(int i = 0; i < pokeLIST[j].length; i++)
				System.out.print(pokeLIST[j][i] + " ");
		System.out.println("");
		}
		System.out.println("What will you do?");	
	}
	
	public static void main(String [] args0){
		try {
			AI_Battle t = new AI_Battle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
public void Battle(){
	
	
}


}
