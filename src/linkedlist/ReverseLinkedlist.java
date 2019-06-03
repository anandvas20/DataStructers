package linkedlist;

public class ReverseLinkedlist {

	ListNode reverseLinkedListIterativeVersion(ListNode head) {
		ListNode prev = null;
		ListNode temp = head;
		while (temp != null) {
			ListNode next = temp.getNext();
			temp.setNext(prev);
			prev = temp;
			temp = next;
		}

		return prev;
	}

	ListNode reverse;

	ListNode reverseLinkedListrecursiveVersion(ListNode head) {
		reverseLinkedListrecursiveVersion(head.getNext());
		if (head != null) {
			head.setNext(reverse);
			reverse = head;
		}

		return reverse;
	}
}
