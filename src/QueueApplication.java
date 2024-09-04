import java.util.LinkedList;
import java.util.Queue;
//import java.util.Scanner;

public class QueueApplication {

	public static void main(String[] args) {
		//create the queue string
		Queue<String> queue = new LinkedList<>();
		
		//prepare the Scanner
		//Scanner sc = new Scanner(System.in);
		
		//add initial line to the queue
		queue.add("Bill");
		queue.add("Alice");
		queue.add("Bob");
		
		//print queue
		System.out.println("Queue: " + queue);
		
		//remove front of queue
		String front = queue.remove();
		System.out.println("Customer served. Removed " + front);
		
		//print current queue
		System.out.println("Queue: " + queue);
		
		//add new customer Jane
		queue.add("Jane");
		//String add1 = sc.nextLine();
		System.out.println("Queue: " + queue);
		
		//add new customer Hamad
		queue.add("Hamad");
		System.out.println("Queue: " + queue);
		
		//remove two customers served
		String front1 = queue.remove();
		String front2 = queue.remove();
		System.out.println("Customer served. Removed " +front1+ " and " +front2);
		
		//add new customer Jim
		queue.add("Jim");
		System.out.println("Queue: " + queue);
		
		//remove two customers served
		String front3 = queue.remove();
		String front4 = queue.remove();
		System.out.println("Customer served. Removed " +front3+ " and " +front4);
		
		//print final queue
		System.out.println("Queue: " + queue);

	}//end main

}//end class
