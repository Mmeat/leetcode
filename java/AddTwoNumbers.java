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
        ListNode head = new ListNode((l1.val+l2.val)%10);
        ListNode cursor = head;
        int carrierBit = (l1.val+l2.val)/10;
        while(l1.next != null||l2.next != null){
            int l1val = 0;
            int l2val = 0;
            if(l1.next != null){
                l1 = l1.next;
                l1val = l1.val;
            }
            if(l2.next != null){
                l2 = l2.next;
                l2val = l2.val;
            }
            int sum = l1val + l2val + carrierBit;
            cursor.next = new ListNode(sum%10);
            cursor = cursor.next;
            carrierBit = sum/10;
        }
        if(carrierBit > 0){
            cursor.next = new ListNode(carrierBit);
        }
        return head;
    }
}