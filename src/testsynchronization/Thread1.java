package testsynchronization;
import java.util.Scanner;

public class Thread1 implements Runnable{
	public Scanner sc;
	public Thread1(Scanner br) {
		super();
		this.sc=br;
		
	}

	@Override
	public void run() {
		
		try {
			System.out.println("Inputs start");
			System.out.println(sc.nextLine());
			System.out.println("Inputs end");
			
			
		}catch(Exception e) {
			//e.printStackTrace();
			
		}
		
		
	}
	
	
}
