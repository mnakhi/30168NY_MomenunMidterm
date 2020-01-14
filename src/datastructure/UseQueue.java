package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer>ticketNumber = new PriorityQueue<>();
		ticketNumber.add(122);
		ticketNumber.add(123);
		ticketNumber.add(311);
		ticketNumber.add(257);
		ticketNumber.add(178);
		ticketNumber.add(200);
		ticketNumber.add(120);

		ticketNumber.peek(); //Retrieves, but does not remove, the head of this queue in this case 120

		ticketNumber.remove();//Retrieves and removes the head of this queue, in this case retrieves and removes 120
		ticketNumber.poll();//Retrieves and removes the head of this queue, in the case retrieves and removes the new head 122
		System.out.println("Using for each loop to retrieve the ticketNumber queue: ");
		for (Integer i:ticketNumber) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Using while loop with iterator to retrieve the ticketNumber queue: ");
		Iterator iterator = ticketNumber.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
