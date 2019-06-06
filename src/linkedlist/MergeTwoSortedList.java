package linkedlist;

public class MergeTwoSortedList {

	ListNode mergeTwoSortedListsWithRecursion(ListNode<Integer> head1, ListNode<Integer> head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		ListNode head;
		if (head1.getData() >= head2.getData()) {
			head = head2;
			head.setNext(mergeTwoSortedListsWithRecursion(head1, head2.getNext()));
		} else {
			head = head1;
			head.setNext(mergeTwoSortedListsWithRecursion(head2, head1.getNext()));

		}

		return head;
	}

}
