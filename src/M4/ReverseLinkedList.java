package M4;

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);

		System.out.println("Original List:");
		printList(head);

		ListNode reversedHead = reverseNode(head);

		System.out.println("Reversed List:");
		printList(reversedHead);
	}

	public static void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + "  -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static ListNode reverseNode(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;

		}
		return prev;
	}
}
