public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {

        // a -> b -> c
        // c -> b -> a

        ListNode prev = null; // prev = null
        ListNode current = head; // current = a

        while (current != null) {
            // temp storage to hold rest of list // iteration 1 // iteration 2 // iteration
            // 3
            ListNode nextNode = current.next; // nextNode = b // nextNode = c // nextNode = null
            current.next = prev; // a.next = null // b.next = a // c.next = b
            prev = current; // prev = a // prev = b // prev = c
            current = nextNode; // current = b // current = c // current = null
                                // a -> null // b -> a -> null
        }

        // at end
        // current = null
        // prev = c

        return prev;

    }
}
