import java.util.Scanner;

public class LinkedListOperations<T> {
	static class Node<T>{
		T data;
		Node next;
		Node(T data){
			this.data=data;
		}
	}
	Node<T> start;
	void insertAtbeg(Node<T> node) {
		node.next=start;
		start=node;
	}
	void insertAtlast(Node<T> node) {
		if(start==null) {
			start=node;
		}
		else {
			Node<T> temp=start;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	void insertAtpos(Node<T> node,int pos) {
		Node<T> temp=start;
		if(pos==0) {
			insertAtbeg(node);
			return;
		}
		
		 while(pos>1)
	        {
	            if(temp==null)
	            {
	              // System.out.println("cannot insert in this poition");
	                throw new RuntimeException("cannot insert in this poition");
	            }
	            temp=temp.next;
	            pos--;
	        }
	        node.next=temp.next;
	        temp.next=node;
	
	}
	void deleteAtbeg() {
		if(start==null) {
			System.out.println("empty list");
			return;
		}
		start=start.next;
		
	}
	void deleteAtlast() {
		if(start==null) {
			System.out.println("empty list");
			return;
		}
		if(start.next==null) {
			start=null;
			return;
		}
		else {
			Node<T> temp=start;
			Node<T> prevtemp=start;
			while(temp.next!=null) {
				prevtemp=temp;
				temp=temp.next;
			}
			temp=null;
			prevtemp.next=null;
		}
	}
	void deleteAtpos(int pos) {
		if(start==null)
        {
            System.out.println("empty list");
            return;
        }
        if(pos==1)
        {
            deleteAtbeg();
            return;
        }
		Node<T> temp=start;
		int count=0;
		if(pos==0) {
			start=temp.next;
			System.out.println("Node deleted");
			return;
		}
		while(pos>2)
        {
            temp = temp.next;
            if(temp == null)
            {
                System.out.println("deletion not possible");
                return;
            }
            pos--;
        }
        if(temp.next == null)
        {
            System.out.println("deletion not possible");
            return;
        }
        temp.next = temp.next.next;
	}
	void print() {
		Node<T> temp=start;
		if(start==null) {
			System.out.println("empty list");
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void searchlist(T data) {
		if(start==null) {
			System.out.println("empty list");
			return;
		}
		else {
			Node<T> temp=start;
			while(temp!=null) {
				if(temp.data==data) {
					System.out.println("Data found");
					return;
				}
				temp=temp.next;
			}
			System.out.println("Data not found");
		}
	}
	void update(T data,T updatedData) {
		  Node<T> temp = start;
	        if(temp==null)
	        {
	            System.out.println("empty list");
	            return;
	        }
	        while(temp!=null)
	        {
	            if(temp.data==data)
	            {
	                temp.data=updatedData;
	                System.out.println("Update Succesfully");
	                return;
	            }
	            temp=temp.next;
	        }
	        System.out.println("Data not found in Linked List");
	}
	void getMid() {
		if(start==null) {
			System.out.println("empty list");
			return;
		}
		Node<T> slow=start;
		Node<T> fast=start;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			}
		System.out.println("Mid ele: "+slow.data);
	}
	void KthElementFromEnd(int k) {
		if(start==null) {
			System.out.println("empty list");
			return;
		}
		Node<T> i=start;
		Node<T> j=start;
		while(k>1) {
			j=j.next;
			k--;
		}
		while(j.next!=null) {
			i=i.next;
			j=j.next;
		}
		System.out.println("Element is: "+i.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations l=new LinkedListOperations();
		Scanner sc=new Scanner(System.in);
		outer:
			while(true) {
				System.out.println("1. insert at beginning");
				System.out.println("2. insrert at end");
				System.out.println("3. insert at any position");
				System.out.println("4. delete at beginning");
				System.out.println("5. delete at end");
				System.out.println("6. delete at specific position");
				System.out.println("7. print list");
				System.out.println("8. search element");
				System.out.println("9. update element");
				System.out.println("10. get middle element of linked list");
				System.out.println("11. Kth Element from end");
				System.out.println("12. Exit");
				int choice=sc.nextInt();
				Node<Integer> node;
				int data,pos;
				switch(choice) {
				case 1:
					System.out.println("Enter the data: ");
					data=sc.nextInt();
					node=new Node<>(data);
					l.insertAtbeg(node);
					break;
					
				case 2:
					System.out.println("Enter the data: ");
					data=sc.nextInt();
					node=new Node<>(data);
					l.insertAtlast(node);
					break;
				case 3:
					System.out.println("Enter the data: ");
					data=sc.nextInt();
					System.out.println("Enter the position");
					pos=sc.nextInt();
					node=new Node<>(data);
					l.insertAtpos(node,pos);
					break;
				case 4:
					l.deleteAtbeg();
					break;
				case 5:
					l.deleteAtlast();
					break;
				case 6:
					System.out.println("Enter the position to delete: ");
					pos=sc.nextInt();
					l.deleteAtpos(pos);
					break;
				case 7:
					System.out.println("Printing elements: ");
					l.print();
					break;
				case 8:
					System.out.println("Enter data element to search");
                    data = sc.nextInt();
                    l.searchlist(data);
                    break;
				case 9:
					System.out.println("Enter data value you want to update");
                    data = sc.nextInt();
                    System.out.println("Enter the New value");
                    int updatedData = sc.nextInt();
                    l.update(data,updatedData);
                    break;
				case 10:
					l.getMid();
					break;
				case 11:
					System.out.println("Enter value of K:");
                    int k = sc.nextInt();
                    l.KthElementFromEnd(k);
                    break;
				default:
                    break outer;	
				}
				
			}
	}

}
