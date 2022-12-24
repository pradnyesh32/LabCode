package snakegame1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputsThread implements Runnable {
	public Snake s;
	public BufferedReader sc;
	
	public InputsThread(Snake s,BufferedReader sc) {
		super();
		this.s = s;
		this.sc=sc;
	}

	@Override
	public void run() {
		try {
			String str = sc.readLine();
			s.inputs(str);
		}
		catch(Exception e) {
			
		}
		
	}

}
