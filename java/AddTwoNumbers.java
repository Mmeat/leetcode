import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next = head;
        for (int i=0;i<9;i++){
            next.next = new ListNode(9);
            next = next.next;
        }
        ListNode head2 = new ListNode(9);
        System.out.println(head);
        System.out.println(head2);
        ListNode result = new Solution().addTwoNumbers(head,head2);
        System.out.println(result);
    }


}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        String result = "";
        ListNode temp = this;
        while (temp.next != null){
            result = result + temp.val;
            temp = temp.next;
        }
        return result;
    }
}
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long ll1 = l1.val;
        long ll2 = l2.val;
        long bitsignificance1 = 10L;
        long bitsignificance2 = 10L;
        while(l1.next != null){
            l1 = l1.next;
            ll1 = ll1+l1.val*bitsignificance1;
            bitsignificance1 = bitsignificance1 *10;
        }
        while(l2.next != null){
            l2 = l2.next;
            ll2 = ll2+l2.val*bitsignificance2;
            bitsignificance2 = bitsignificance2*10;
        }
        long result = ll1 + ll2;
        System.out.println(ll1);
        System.out.println(ll2);
        System.out.println("step1");
        System.out.println(result);
        ListNode head = new ListNode((int)result%10);
        System.out.println((int)(result%10));
        ListNode next = head;
        result = result/10;
        System.out.println(result);
        while(result > 0){
            next.next = new ListNode((int)result%10);
            next = next.next;
            result = result/10;
            System.out.println(result);
            System.out.println(head);
        }
        System.out.println(head);
        return head;
    }


}