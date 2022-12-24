package snakegame2;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		Snake s = new Snake();
		KeyAwt k = new KeyAwt(s);
		s.q.add(101);
		s.randomgenerate();
		while(!s.kill) {
			int speed= (s.score/2000)*50;
			Thread.sleep(250-speed);
		s.runs();	
		if(s.killcheck(s)) {
			System.out.println("----Game Over----"+"\n Score : "+s.score);	 
		}
		s.scorecheck();
		}
	

	}

}
