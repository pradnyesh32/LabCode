package snakegame1;

public class RunsThread implements Runnable{
	public Snake s;
	public Thread t1;
	public RunsThread(Snake s, Thread t1) {
		super();
		this.s = s;
		this.t1=t1;
	}

	@Override
	public void run() {
		try {
			s.runs();
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	

}
