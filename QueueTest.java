
public class QueueTest {
	public static void main(String[] args) {
		Queue<String> myQueue = new Queue<String>();
		
		myQueue.enqueue("Jane");
		myQueue.enqueue("Jess");
		myQueue.enqueue("Jill");
		myQueue.printQueue();
		 
		myQueue.enqueue(myQueue.dequeue());
		myQueue.printQueue();
		 
		myQueue.enqueue(myQueue.getFront());
		myQueue.printQueue();
		 
		myQueue.enqueue("Jim");
		String name = myQueue.dequeue();
		System.out.println("removed " + name);
		myQueue.printQueue();
		 
		myQueue.enqueue(myQueue.getFront());
		myQueue.printQueue();
	}
}
