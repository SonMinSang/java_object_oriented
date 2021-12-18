package Queue;

import LinkedList.MyLinkedList;
import LinkedList.MyListNode;

interface IQueue{
	public void enQueue(String data);
	public String deQueue();
}

public class MyLinkedQueue extends MyLinkedList implements IQueue {

	MyListNode front;
	MyListNode rear;
	
	
	@Override
	public void enQueue(String data) {
		// TODO Auto-generated method stub
		MyListNode newNode;
		
		if (isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return null;
		}
		String data = front.getData();
		front = front.next;
		if (front == null) {
			rear = null;
		}
		return data;
	}


}
