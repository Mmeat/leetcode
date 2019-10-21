# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        sum = l1.val + l2.val
        carrierBit = sum//10
        head = ListNode(sum%10)
        cursor = head
        while l1.next or l2.next:
            l1val = 0
            l2val = 0
            if l1.next:
                l1 = l1.next
                l1val = l1.val
            if l2.next:
                l2 = l2.next
                l2val = l2.val
            sum = l1val + l2val + carrierBit
            carrierBit = sum//10
            cursor.next = ListNode(sum%10)
            cursor = cursor.next
        if carrierBit > 0:
            cursor.next = ListNode(carrierBit)
        return head
l1 = ListNode(2)
cursor = l1
cursor.next = ListNode(4)
cursor = cursor.next
cursor.next = ListNode(3)
l2 = ListNode(5)
cursor = l2
cursor.next = ListNode(6)
cursor = cursor.next
cursor.next = ListNode(4)
s = Solution()
result = s.addTwoNumbers(l1, l2)
while result:
    print(result.val)
    result = result.next