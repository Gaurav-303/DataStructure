package linked_list;

public class RecursiveSorting_linkedList {

    public static ListNode sortList(ListNode head) {
        if (head == null || head.forward == null) {
            return head;
        }

        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.forward;
        mid.forward = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return merge(left, right);
    }

    private static ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.forward != null && fast.forward.forward != null) {
            slow = slow.forward;
            fast = fast.forward.forward;
        }
        return slow;
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.forward = merge(l1.forward, l2);
            return l1;
        } else {
            l2.forward = merge(l1, l2.forward);
            return l2;
        }
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.forward;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.forward = new ListNode(2);
        head.forward.forward = new ListNode(1);
        head.forward.forward.forward = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = sortList(head);

        System.out.println("Sorted List:");
        printList(head);
    }
}
