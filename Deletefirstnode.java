package linkedlist;
class Node{
	int data;
	Node next;
	Node prev;
	Node(int x){
		data=x;
		next=null;
	}
}

public class Deletefirstnode {
	static Node deletefirstnode(Node head) {
		if(head==null) {
			return head;
		}else {
			return head.next;
		}
		
		
	}
	


	public static void main(String[] args) {
		Node head=null;
		head=insertatend(head,30);
		head=insertatend(head,20);
		head=insertatend(head,10);
	head=deletefirstnode(head);
		printlinked(head);
	
	}
	static Node insertatend(Node head,int x) {
		Node temp=new Node(x);
		while(head==null) {
			return temp;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		
		}
		curr.next=temp;
		return head;
		
	}
static void  printlinked(Node head) {
		
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}

	}

}
