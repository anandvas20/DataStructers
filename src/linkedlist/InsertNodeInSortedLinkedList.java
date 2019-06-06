package linkedlist;

public class InsertNodeInSortedLinkedList {
	ListNode<Integer> head;

	public void inserNodeInSortedList(int data) {
		ListNode<Integer> node = new ListNode<Integer>(data);
		if (head == null)
			head = node;
		else {
			ListNode<Integer> temp = head, current = head;
			while (current != null & current.getData() > data) {
				temp = current;
				current = current.getNext();
			}
			node.setNext(current);
			temp.setNext(node);
		}
	}
}
