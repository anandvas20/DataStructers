package linkedlist;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertAtEnd(1);
		l.insertAtEnd(2);
		l.insertAtEnd(3);
		l.insertAtEnd(5);
		l.insertAtEnd(6);
		l.insertAtEnd(7);
		l.insertAtEnd(8);
		l.insertAtEnd(9);
		// System.out.println(fetchNthNodeFromListAtEnd(3, l.head));
		System.out.println(recursionFetchNthNodeFromListAtEnd(3, l.head));

	}

	public static int count = 0;

	public static int recursionFetchNthNodeFromListAtEnd(int n, ListNode<Integer> head) {
		int result = Integer.MIN_VALUE;
		if (head != null) {
			result = recursionFetchNthNodeFromListAtEnd(n, head.getNext());
			count++;
			if (count == n)
				result = head.getData();

		}
		return result;
	}

	public static int fetchNthNodeFromListAtEnd(int n, ListNode head) {
		ListNode<Integer> ptrFirst = head, ptrSnd = null;
		for (int i = 1; i < n; i++) {
			if (ptrFirst != null)
				ptrFirst = ptrFirst.getNext();
		}

		while (ptrFirst != null) {
			if (ptrSnd == null)
				ptrSnd = head;
			else
				ptrSnd = ptrSnd.getNext();
			ptrFirst = ptrFirst.getNext();
		}

		if (ptrSnd != null)
			return ptrSnd.getData();

		return Integer.MIN_VALUE;

	}

}
