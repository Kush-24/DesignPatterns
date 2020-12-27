package kush.iterator1;


public class LinkedList implements Collection {
private Node head;
private Node current;

	@Override
	public Iterator getIterator() {
		return new LinkedListIterator(head);
	}

	@Override
	public void insert(int data) {
		Node newNode=new Node(data);
		if(current==null) {
			head=newNode;
			current=newNode;
		}else {
			current.next=newNode;
			current=newNode;
		}
	}

// Inner class Node.
	class Node {
		private Node next;
		private int data;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		public int data() {
			return data;
		}
		public Node next() {
			return this.next;
		}
		
	  }
}
