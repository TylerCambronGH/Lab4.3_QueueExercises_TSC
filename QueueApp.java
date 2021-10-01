import java.util.Scanner;

public class QueueApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> myQueue = new Queue<String>();
		while (true) {
			System.out.println("Enqueue: '+'\nDequeue: '-'\nEnqueue @ index: '+-'\nDequeue @ index: '--'\nDequeue Last: '-='\nShow Queue: 'p'\nClose: 'c'");
			String choice = scanner.next();
			if (choice.equalsIgnoreCase("+")) {
				System.out.print("Enqueue: ");
				String enqueuedItem = scanner.next();
				myQueue.enqueue(enqueuedItem);
			} else if (choice.equalsIgnoreCase("--")) {
				System.out.print("Dequeue #: ");
				String item = scanner.next();
				if (!isNum(item)) {
					System.out.println("Invalid index.");
				} else {
					int intitem = Integer.parseInt(item);
					myQueue.dequeue(intitem);
				}
			} else if (choice.equalsIgnoreCase("-")) {
				myQueue.dequeue();
			} else if (choice.equalsIgnoreCase("+-")) {
				System.out.print("Index #: ");
				String enqueuedPosition = scanner.next();
				if (!isNum(enqueuedPosition)) {
					System.out.println("Invalid index.");
				} else {
					int position = Integer.parseInt(enqueuedPosition);
					System.out.print("Enqueue: ");
					String enqueuedItem = scanner.next();
					myQueue.enqueue(enqueuedItem, position);
				}
			} else if (choice.equalsIgnoreCase("-=")) {
				myQueue.dequeue(myQueue.getQueueSize()-1);
			} else if (choice.equalsIgnoreCase("p")) {
				myQueue.printQueue();
			} else if (choice.equalsIgnoreCase("c")) {
				break;
			}
			System.out.println("---\nNext Up: " + myQueue.getFront() + "\n---");
		}
		scanner.close();
		System.out.println("Queue ended.");
		myQueue.printQueue();
	}
	
	public static boolean isNum(String str) {
	    try {
	        Integer.parseInt(str);
	    } catch (NumberFormatException e) {
	        return false;
	    }
	    return true;
	}
}
