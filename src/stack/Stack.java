package stack;

import linkedlist.ListNode;

public class Stack<T> {

	ListNode<T> head;
	int length = 0;

	public void push(T data) {
		ListNode<T> node = new ListNode<T>(data);
		node.setNext(head);
		head = node;
		length++;
	}

	public T pop() {
		ListNode<T> node = head;
		head = head.getNext();
		length--;
		return node.getData();
	}

	public boolean isEmpty() {
		if (length < 1) {
			return true;
		}
		return false;
	}
}
