package kush.iterator1;

import kush.iterator1.LinkedList.Node;

public class LinkedListIterator implements Iterator{
 private Node current;
 
	public LinkedListIterator(Node head) {
		this.current=head;
	}
	
	@Override
	public boolean hasNext() {
		return current!=null;
	}

	@Override
	public int next() {
		int val=current.data();
		current=current.next();
		return val;
	}

}
