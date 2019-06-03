package linkedlist;

public class FloydCycleAlgorithm {

	public boolean isLoopFound(ListNode head) {
		ListNode ptr1 = head, ptr2 = head;
		while (ptr2 != null && ptr2.getNext() != null) {
			if (ptr1 == ptr2)
				return true;
			ptr2 = ptr2.getNext().getNext();
			ptr1 = ptr1.getNext();
		}
		return false;

	}

	public ListNode findBeginLoopNode(ListNode head) {
		ListNode ptr1 = head, ptr2 = head;
		boolean isLoopFound = false;
		while (ptr2 != null && ptr2.getNext() != null) {
			if (ptr1 == ptr2) {
				isLoopFound = true;
				break;
			}
			ptr2 = ptr2.getNext().getNext();
			ptr1 = ptr1.getNext();
		}
		if (isLoopFound) {
			ptr1 = head;
			while (ptr1 != ptr2) {
				ptr1 = ptr1.getNext();
				ptr2 = ptr2.getNext();
			}
			return ptr1;
		}

		return null;

	}
}
