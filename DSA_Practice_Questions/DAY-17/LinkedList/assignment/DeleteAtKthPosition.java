import java.util.Scanner;

//
//class Node{
//	int data;
//	Node next;
//	public Node(int data){
//		this.data=data;
//		this.next=null;	}
//
class Node<T>{
	T data;
	Node next;					//ANOTHER METHOD TO CREATE NODE
	Node(T data){
		this.data=data;
	}
}
public class DeleteAtKthPosition<T> {
	
	Node<T> start;
	void insertdata(Node<T> node) {
		if(start==null){
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
	void print() {
		Node<T> temp=start;
		if(start==null) {
			System.out.println("Empty Linked List");
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	void deletepos(int pos) {
		Node<T> temp=start;
		int count=0;
		if(pos==0) {
			start=temp.next;
			System.out.println("Node deleted");
			return;
		}
		while(temp.next!=null&& count<pos-1) {
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
		System.out.println("Node deleted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteAtKthPosition d=new DeleteAtKthPosition();
		Scanner scanner=new Scanner(System.in);
		outer:
		while(true) {
			System.out.println("1. Enter a element");
			System.out.println("2. Print elements");
			System.out.println("3. Delete");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the data: ");
				int data=scanner.nextInt();
				Node<Integer> node=new Node<>(data);
				d.insertdata(node);
				break;
			case 2:
				System.out.println("Printing elements: ");
				d.print();
				break;
			case 3:
				System.out.println("Enter the position to delete: ");
				int pos=scanner.nextInt();
				d.deletepos(pos);
				break;
			default:
				System.out.println("wrong choice, PROGRAM TERMINATED");
				break outer;
			}
		}
		scanner.close();
		
	}

}
