//THIS IS GEEKS FOR GEEKS PROBLEM
//Given a singly linked list of size N. Your task is to complete the function alternatingSplitList() that splits the given linked list into two smaller list. The sublists should be made from alternating elements from the original list.
//Note: the sublist should in the order with respect to original list.
//

public class SplitSinglyLinkedListAlternatingly {
//	static class Node {
//	    int data;
//	    Node next;
//	    
//	    public Node(int head){
//	        this.data = head;
//	        this.next = null;
//	    }
//	}
//	class GFG {
//	    public static Node a; //store the head of first list in this
//	    public static Node b; //store the head of second list in this
//	}
	public void alternatingSplitList(Node node){
	       
		//Your code here

	    Node firsthead=node;
	    Node secondhead=node.next;
	    if(node == null){
	          return;
	    }
	     GFG.a=firsthead;
	    if(node.next == null){
	     return;
	    }
	    GFG.b=secondhead;
	        
	    Node firstTemp;
	    Node secondTemp;
	    
	    firsthead = firstTemp = node;
	    secondhead = secondTemp = node.next;
	    node = node.next.next;
	    
	    while(node != null && node.next != null) {
	      firstTemp.next = node;
	      secondTemp.next = node.next;
	      
	      firstTemp = firstTemp.next;
	      secondTemp = secondTemp.next;
	      
	      node = node.next.next;
	    }
	    
	    if(node != null) {
	      firstTemp.next = node;
	      firstTemp = firstTemp.next;
	    }
	    
	    firstTemp.next = null;
	    secondTemp.next = null;

	    GFG.a=firsthead;
	    GFG.b=secondhead;
	    }

}
