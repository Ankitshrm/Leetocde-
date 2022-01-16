class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode fst =dummy;
        ListNode slw =dummy;
        for(int i=1;i<=n+1;i++)
        {
            fst=fst.next;
        }
        while(fst!=null)
        {
            
            slw=slw.next;
            fst=fst.next;
        }
        slw.next=slw.next.next;
        return dummy.next;
        
    }
}
