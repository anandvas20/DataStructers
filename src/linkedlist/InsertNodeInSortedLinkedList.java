package linkedlist;

public class InsertNodeInSortedLinkedList {
	ListNode head;

	public void inserNodeInSortedList(int data) {
		ListNode node = new ListNode(data);
		if (head == null)
			head = node;
		else {
			ListNode temp = head, current = head;
			while (current != null & current.getData() > data) {
				temp = current;
				current = current.getNext();
			}
			node.setNext(current);
			temp.setNext(node);
		}
	}
}
