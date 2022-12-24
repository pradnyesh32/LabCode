package testsynchronization;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		System.out.println("start");
		Queue<Integer> q= new LinkedList<>();
		q.add(16*100+03);
		q.add(1211);
		q.add(23);
		q.add(55);
		q.add(456);
		
		int a = q.peek();
		System.out.println(a/100);
		System.out.println(a%100);
		System.out.println(q.contains(23));
		
		
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
	}
}