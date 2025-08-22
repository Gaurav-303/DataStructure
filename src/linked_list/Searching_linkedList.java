package linked_list;

public class Searching_linkedList {

    public static int search(ListNode head, int key) {
        int position = 1;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == key) {
                return position;
            }
            temp = temp.forward;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.forward = new ListNode(20);
        head.forward.forward = new ListNode(30);

        int key = 20;
        int result = search(head, key);

        if (result != -1) {
            System.out.println("Found at position " + result);
        } else {
            System.out.println("Not Found");
        }
    }
}
