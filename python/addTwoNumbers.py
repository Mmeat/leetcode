# Definition for singly-linked list.
class addTwoNumbers.ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class addTwoNumbers.LongestSubstringWithoutRepeatingCharacters.Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: addTwoNumbers.ListNode
        :type l2: addTwoNumbers.ListNode
        :rtype: addTwoNumbers.ListNode
        """
        sum = l1.val + l2.val
        carrierBit = sum//10
        head = addTwoNumbers.ListNode(sum%10)
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
            cursor.next = addTwoNumbers.ListNode(sum%10)
            cursor = cursor.next
        if carrierBit > 0:
            cursor.next = addTwoNumbers.ListNode(carrierBit)
        return head
l1 = addTwoNumbers.ListNode(2)
cursor = l1
cursor.next = addTwoNumbers.ListNode(4)
cursor = cursor.next
cursor.next = addTwoNumbers.ListNode(3)
l2 = addTwoNumbers.ListNode(5)
cursor = l2
cursor.next = addTwoNumbers.ListNode(6)
cursor = cursor.next
cursor.next = addTwoNumbers.ListNode(4)
s = addTwoNumbers.LongestSubstringWithoutRepeatingCharacters.Solution()
result = s.addTwoNumbers(l1, l2)
while result:
    print(result.val)
    result = result.next