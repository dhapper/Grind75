/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int digit = 0;
        int sum = 0;
        ListNode l3 = new ListNode();
        ListNode head = l3;
        bool carry = false;
        while((l1 != null || l2 != null) || carry){
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int currentDigitSum = num1 + num2;
            if (carry) currentDigitSum++;
            carry = currentDigitSum > 9;
            l3.val = carry ? currentDigitSum - 10 : currentDigitSum;

            //Console.WriteLine("index "+digit+": "+num1+" : "+num2);

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            if((l1 != null || l2 != null) || carry) {
                ListNode tempNode = new ListNode();
                l3.next = tempNode;
                l3 = l3.next;
            }
            digit++;
        }
        return head;
    }
}