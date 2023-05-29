package Queues;
import java.util.List;
import java.util.PriorityQueue;

/* Week 4 - Day 5
 * Completed on 2023/05/19
 */

//1. 	Highest element stored at beginning of queue
//2. 	Min Heap Data Structure
//3. 	Index based access not allowed
//4.    Level based traversal
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(); // Min Heap data structure
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		
		System.out.println(pq);
		//Level 1 - 25
		//Level 2 - 50, 125
		//Level 3 - 100, 75, 150, 175
	
		System.out.println(pq.poll()); //removes head (25)
		System.out.println(pq.offer(999)); //adds element to queue
		
		System.out.println(pq);
		//Level 1 - 50
		//Level 2 - 75, 125
		//Level 3 - 100, 75, 150, 999	
		
		System.out.println(pq.peek());
		System.out.println(pq.retainAll(List.of(75, 150)));
		
		System.out.println(pq);
		//Level 1 - 75
		//Level 2 - 150
		
		pq.clear();
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		PriorityQueue pq2 = new PriorityQueue();
		pq2.add("a");
		pq2.add("z");
		pq2.add("f");
		pq2.add("e");
		System.out.println(pq2);
		//Level 1 - a
		//Level 2 - e, f
		//Level 3 - z
	}

}
