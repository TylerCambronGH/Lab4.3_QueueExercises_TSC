import java.util.LinkedList;

/**
 * 
 * @author tylercambron
 * @description A queue structure using a linked list.
 * @param <T> Generic type for linked list.
 */
public class Queue<T> {
	private LinkedList<T> linkedQueue;
	private int queueSize;
	
	/**
	 * Constructor
	 */
	public Queue() {
		linkedQueue = new LinkedList<T>();
		queueSize = 0;
	}
	
	/**
	 * add object to the end of the queue.
	 * @param item
	 */
	public void enqueue(T item) {
		linkedQueue.add(item);
		queueSize++;
	}
	
	/**
	 * add object to a position in the queue.
	 * @param item
	 * @param position
	 */
	public void enqueue(T item, int position) {
		if (queueSize-1 <= position) {
			enqueue(item);		
		} else {
			linkedQueue.add(position, item);
			queueSize++;
		}	
	}
	
	/**
	 * Dequeues the first object in the queue.
	 * @return the removed object.
	 */
	public T dequeue() {
		T removed = linkedQueue.removeFirst();
		queueSize--;
		return removed;
	}
	
	/**
	 * Dequeues a specific object in the queue.
	 * @param item
	 * @return the removed object.
	 */
	public T dequeue(T item) {
		linkedQueue.remove(item);
		queueSize--;
		return item;
	}
	
	/**
	 * Dequeues a specific position in the queue.
	 * @param position
	 * @return the removed object.
	 */
	public T dequeue(int position) {
		if (position > queueSize-1) { return null; }
		T removed = linkedQueue.remove(position);
		queueSize--;
		return removed;
	}
	
	/**
	 * @return the first object in the queue.
	 */
	public T getFront() {
		if (queueSize < 1) { return null; }
		return linkedQueue.getFirst();
	}
	
	/**
	 * @return the last object in the queue.
	 */
	public T getBack() {
		return linkedQueue.getLast();
	}
	
	/**
	 * @param position
	 * @return the object at the position.
	 */
	public T getAt(int position) {
		return linkedQueue.get(position);
	}
	
	/**
	 * @return the number of objects in the queue.
	 */
	public int getQueueSize() {
		return queueSize;
	}
	
	/**
	 * Prints the queue in a listed format.
	 */
	public void printQueue() {
		System.out.println("--QUEUE:--");
		for (int i=0; i<=queueSize-1; i++) {
			System.out.println(i+": "+linkedQueue.get(i));
		}
		System.out.println("----------");
	}
}
