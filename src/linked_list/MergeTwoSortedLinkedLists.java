package linked_list;

public class  MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.forward = l1;
                l1 = l1.forward;
            } else {
                tail.forward = l2;
                l2 = l2.forward;
            }
            tail = tail.forward;
        }

        if (l1 != null) tail.forward = l1;
        else tail.forward = l2;

        return dummy.forward;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.forward = new ListNode(3);
        l1.forward.forward = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.forward = new ListNode(4);
        l2.forward.forward = new ListNode(6);

        ListNode merged = mergeTwoLists(l1, l2);

        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.forward;
        }

    }
}

