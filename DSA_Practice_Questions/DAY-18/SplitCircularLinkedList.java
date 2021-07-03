//THIS IS GEEKS FOR GEEKS PROBLEM
//Given a Cirular Linked List of size N, split it into two halves circular lists.
//If there are odd number of nodes in the given circular linked list then out of the resulting two halved lists, first list should have one node more than the second list.
//The resultant lists should also be circular lists and not linear lists.
public class SplitCircularLinkedList {
	class Node {
		   int data;
		    Node next;
		    Node(int d)  { data = d;  next = null; }
		}
	 void splitList(circular_LinkedList list)
     {
          // Your code here
          if(list.head==null){
              return;
          }
          if(list.head.next==list.head){
               list.head1 = list.head;
              list.head2 = null;
              return;
          }
          Node slow=list.head;
          Node fast=list.head.next;
         while(fast!=list.head && fast.next!=list.head)
          {
              slow = slow.next;
              fast = fast.next.next;
          }
         list.head1=list.head;
         list.head2=slow.next;
         slow.next=list.head1;
         Node temp=list.head2;
         while(temp.next!=list.head)
             {
                 temp = temp.next;
             }
         temp.next = list.head2;
	 }
}
