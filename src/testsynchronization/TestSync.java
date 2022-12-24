package testsynchronization;
import java.awt.event.k
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestSync {

	public static void main(String[] args)  {
		try {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		while(!exit) {
			
			Thread t1 = new Thread(new Thread1(sc));
			Thread t2 = new Thread(new Thread2(t1));
			//t1.setPriority(9);
			t1.start();
			t2.start();
			
			t2.join();
			
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
