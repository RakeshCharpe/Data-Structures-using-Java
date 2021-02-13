package linkedlist;
class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next=null;
	}
}

public class Deletelastnode {
	static Node insertatbegin(Node head,int x) {
		Node temp=new Node(x);
		temp.next=head;
		return temp;
	}
	static Node deletelastnode(Node head) {
		
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return null;
		}
		Node curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
			
		}
		curr.next=null;
		return head;
		
	}

	public static void main(String[] args) {
		Node head=null;
		head=insertatbegin(head,10);
		head=insertatbegin(head,20);
		head=insertatbegin(head,30);
		head=insertatbegin(head,40);
		head=deletelastnode(head);
		printlinked(head);

	}
	
	static void printlinked(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

}
