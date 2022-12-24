package snakegame1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tester2 {

	public static void main(String[] args) {
		try{
			Snake s = new Snake();
			s.randomgenerate();
			boolean exit = false;
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			while(!exit) {
				Thread t1 = new Thread(new InputsThread(s,sc));
				Thread t2 = new Thread(new RunsThread(s,t1));
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e) {
			
		}
		
		
		
	}

}
