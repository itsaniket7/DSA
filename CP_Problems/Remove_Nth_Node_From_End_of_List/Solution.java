package CP_Problems.Remove_Nth_Node_From_End_of_List;


//   Definition for singly-linked list.
// class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        ListNode prev = null;
        ListNode back = head;
        if(head.next == null)
        {
            head = head.next;
        }
        else
        {
            while(temp != null)
            {
                count++;
                if(count > n)
                {
                    prev = back;
                    back = back.next;
                }
                temp = temp.next;
            }
            if(back == head)
            {
                head = head.next;
            }
            else
            prev.next = back.next;
        
        }
        
        return head;
    }
}