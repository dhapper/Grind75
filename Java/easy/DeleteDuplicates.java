public class DeleteDuplicates {

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

    public ListNode deleteDuplicates(ListNode head) {

        ListNode traversing = head;
        while (traversing != null && traversing.next != null) {
            ListNode temp = traversing.next;
            if (traversing.val == temp.val)
                traversing.next = temp.next; // has to be .next
            else
                traversing = traversing.next;
        }

        return head;
    }
}
