package linked_list;

public class FloydAlgorithm {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.forward == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.forward != null) {
            slow = slow.forward;
            fast = fast.forward.forward;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.forward = new ListNode(2);
        head.forward.forward = new ListNode(3);
        head.forward.forward.forward = new ListNode(4);
        head.forward.forward.forward.forward = head.forward;

        System.out.println(hasCycle(head));
    }
}

