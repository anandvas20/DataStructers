package linkedlist;

public class LinkedList {

	public ListNode head;
	int length;

	LinkedList() {

	}

	public void insertAtBegining(int data) {
		ListNode node = new ListNode(data);
		node.setNext(head);
		head = node;
		length++;
	}

	public void insertAtEnd(int data) {
		ListNode node = new ListNode(data);
		if (head == null) {
			head = node;
		} else {
			ListNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		length++;
	}

	public void insert(int data, int postion) {
		if (postion < 0)
			postion = 0;
		if (postion > length)
			postion = length;

		if (head == null) {
			head = new ListNode(data);
		} else {
			ListNode node = new ListNode(data);
			ListNode temp = head;
			for (int i = 1; i < postion; i++) {
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
		length++;
	}

	public ListNode removeFromBegin() {
		ListNode temp = head;
		if (temp != null) {
			head = temp.getNext();
		}
		length--;
		return temp;
	}

	public ListNode removeFromEnd() {

		ListNode temp = head, temp1;
		if (temp != null) {
			temp1 = temp;
			while (temp1.getNext() != null) {
				temp1 = temp1.getNext();
			}
			temp = temp1.getNext();
			temp1.setNext(null);

		}
		length--;
		return temp;
	}

	/*
	 * public ListNode remove(int postion) { if (postion < 0) postion = 0; if
	 * (postion > length) postion = length;
	 * 
	 * }
	 */

	public void print() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println("");
	}

}
