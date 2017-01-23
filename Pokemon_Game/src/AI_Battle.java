package com.mkyong.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AI_Battle {
	Main poke = new Main();
int poke_op=poke.poke_op;
int poke_1=poke.poke_1;	
Set,Integer. mySet= new HasSet<Integer>();
String csvfile = "C:\Users\250148\workspace\Pokemon_Game\resource\Pokemon.csv";
BufferedReader br= null;
String line ="";
String SplitBy=",";
Br= new BufferedReader(new FileReader(csvfile));
for(int i=1;i>0; i++){
while((line=br.readLine())) != null){
	String[] poke= line.split(SplitBy); 
	String[]poke.myset.add(i);
}
}
System.out.println("What will you do?");	
	
	
	
public static void Battle{
	
	
}


}
