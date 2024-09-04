package LinkedList;

public class Queue<T> implements QueueInterface<T> {
	protected LLNode<T> front; //front of queue
	protected LLNode<T> rear; // rear of queue
	protected int numElements=0; //number of elements in queue
	
	public Queue() {
		front = null;
		rear = null;
	}
	
	public void enqueue(T element) {
		//adds element to rear of queue
		LLNode<T> newNode - new LLNode<T> (element);
		if (rear == null)
			front = newNode;
		else
			rear.setLink(newNode;)
		rear = newNode;
		numElements ++;
	}
	
	public T dequeue() {
	// Throws QueueUnderflowException if this queue is empty,
	// otherwise removes front element from this queue and returns it.
		if(isEmpty())
			throw new QueueUnderflowException("Dequeue attempted on empty queue.");
		else {
			T temp = front.getInfo();
			front = front.getLink();
		if (front == null)
			rear = null;
		numElements --;
		return temp;
		}

}
