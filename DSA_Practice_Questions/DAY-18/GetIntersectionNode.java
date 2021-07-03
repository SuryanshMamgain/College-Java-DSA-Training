
//THIS IS LEETCODE PROBLEM-160 SOLUTION
//Problem statement-Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
//If the two linked lists have no intersection at all, return null.

public class GetIntersectionNode {

	static class ListNode{
		int data;
        ListNode next;
        ListNode(int data) {
           this.data =data;
           next = null;
      }
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        int count1=0;
        int count2=0;
        while(ptr1!=null){
            count1++;
            ptr1=ptr1.next;
            
        }
        while(ptr2!=null){
            count2++;
            ptr2=ptr2.next;
            
        }
        int diff=Math.abs(count2-count1);
        int count=0;
        if(count2>count1){
            while(diff>0){
                headB=headB.next;
                diff--;
            }
                
            }
        else{
           while(diff>0){ 
               headA=headA.next;
                diff--;
            }
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
           
        }
        return headA;
        
    }
    
}
