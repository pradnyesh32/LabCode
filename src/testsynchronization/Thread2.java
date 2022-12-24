package testsynchronization;

public class Thread2 implements Runnable{
	public Thread t1;
	public Thread2(Thread t1) {
		super();
		this.t1=t1;
	}

	@Override
	public void run() {
		try {
			System.out.println("runsss");
			t1.join(4000);
			if (t1.isAlive()) {
				System.out.println("runs sleep end");
				t1.interrupt();
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("thread catch");
		}
		
		
	}
	
	
}