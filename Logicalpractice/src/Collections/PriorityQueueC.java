
package Collections;

import java.util.PriorityQueue;

public class PriorityQueueC {
public static void main(String[] args) {
	PriorityQueue<Integer> p = new PriorityQueue<Integer>();
	p.add(10);
	p.add(30);
	p.add(50);
	p.add(20);
	System.out.println(p);
	p.poll();
	System.out.println(p);
	System.out.println(p.peek());
}
}
