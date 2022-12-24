package snakegame1;

import java.util.Random;

public class Snake {
	public boolean run;
	public boolean kill =false;
	public boolean check = false; 
	public boolean stop=false;
	public char direction = 'd';
	public int rowsp = 1;
	public int colsp =1;
	public int rp = 1;
	public int cp=1;
	public int score = 0;
	public String arr[][] = {{"|","--","--","--","--","--","--","--","--","--","--","--","--","--","--","|"},
			  {"|","S ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","|"},
			  {"|","--","--","--","--","--","--","--","--","--","--","--","--","--","--","|"}};
	
	
	
@Override
	public String toString() {
	String str ="";

		for (int i = 0;i<arr.length;i++) { 
			for(int j = 0;j<arr.length;j++)  {
				str = str +arr[i][j];
			}
			str = str +" \n";
		}
		return str+" \n\n---Score: "+score;
	}



//printing arr	
 public void runs() {
switch(direction){
 	 case 'w':{
	 rowsp-=1;
	 arr[rowsp+1][colsp] = "  ";
	 break;
 	 }
 	 case 'a':{
	 colsp-= 1;
	 arr[rowsp][colsp+1] = "  ";
	 break;
 	 }
 	 case 's' :{
	 rowsp+=1;
	 arr[rowsp-1][colsp] = "  ";
	 break;
 	 }
 	 case 'd':{
	 colsp+=1;
	 arr[rowsp][colsp-1] = "  ";
	 break;
 	 }	 
 }

 arr[rowsp][colsp] = "S ";	 
 System.out.println(this);
	 
	 
 }
 
 
 
 
//for input
 public boolean inputs(char sc) {
	 
		 direction =sc;
//		 switch(direction){
//		 case 'w':{
//			 //System.out.println("yes");
//			 rowsp-=1;
//			 arr[rowsp+1][colsp] = "   ";
//			 //direction = "w";
//			 break;
//		 }
//		 case 'a':{
//			 colsp-= 1;
//			 arr[rowsp][colsp+1] = "   ";
//			 //direction = "a";
//			 break;
//		 }
//		 case 's' :{
//			 rowsp+=1;
//			 arr[rowsp-1][colsp] = "   ";
//			 //direction = "s";
//			 break;
//		 }
//		 case 'd':{
//			 colsp+=1;
//			 arr[rowsp][colsp-1] = "   ";
//			 //direction = "d";
//			 break;
//		 }
//		 }
//		 if(s.killcheck(s)) {
//				System.out.println("----Game Over----"+"\n Score : "+s.score);
//				 
//			}
//		s.scorecheck();
//			
//		 
//		 
//		 arr[rowsp][colsp] = " S ";	 
//		 	 
	 return true;
	 
 }
 
 //kill check
 public boolean killcheck(Snake s) {
	 if (rowsp == 0 || rowsp == 15 || colsp == 0 || colsp== 15) {
			kill = true;
			//System.out.println(this);
			
	 }
	 
	 return kill;
 }
 
 //scorcheck
 public void scorecheck() {
	 if(rp == rowsp && cp == colsp) {
			score++;
			arr[rp][cp]="S ";
			this.randomgenerate();
	 }
 }
 
 
 
 //randompoint
 public void randomgenerate() {
	 Random ra = new Random();
	 boolean exit = false;
	 
	 while(!exit) {
	 rp = ra.nextInt(14);
		
		if (rp == 0 ) {
			continue;
		}
	cp = ra.nextInt(14);
		if (cp == 0) {
			continue;
		}
		if(rp == rowsp && cp == colsp) {
			continue;
		}
		exit = true;
	 }
	 arr[rp][cp] = "x ";
	 
 }
 
// public void intrpt() {
//	 stop= true;
// }
	
	

}
