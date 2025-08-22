package linked_list;


public class Reverse_LinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.forward;
            curr.forward = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.forward = new ListNode(2);
        head.forward.forward = new ListNode(3);
        head.forward.forward.forward = new ListNode(4);

        head = reverseList(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.forward;
        }
    }
}

