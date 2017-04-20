package resources;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Data {

		  public static void doc(String[] args) {

		    File file = new File ("resource//file.txt");
		    PrintWriter printWriter;
			try {
				printWriter = new PrintWriter ("file.txt");
				  printWriter.println ("Ghastly,2,113,Joker");
				    printWriter.close ();    
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		  }
		  
		  
		  
		  
		  public static void get(String[] args) throws IOException{
			  BufferedReader br= null;
				String line ="";
				String splitBy= ",";
				br = new BufferedReader(new FileReader("file.txt"));
				String[] pokemon1 = new String[6];
				for(int i=0;(line=br.readLine()) != null && i < 6;i++){
					pokemon1 = line.split(splitBy);
				}
				System.out.println(pokemon1[1]);
		
			  
			  
		  }
		  
		  
		  
		  
		  
		}

