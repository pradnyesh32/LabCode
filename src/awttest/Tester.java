package awttest;

import snakegame1.Snake;
public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		Snake s = new Snake();
		KeyAwt k = new KeyAwt(s);
		
		s.randomgenerate();
		while(!s.kill) {
			Thread.sleep(500);
		s.runs();	
		if(s.killcheck(s)) {
			System.out.println("----Game Over----"+"\n Score : "+s.score);	 
		}
		s.scorecheck();
		}
	

	}

}
