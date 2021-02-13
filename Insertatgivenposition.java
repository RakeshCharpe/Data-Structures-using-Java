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



public class Insertatgivenposition {
	static Node insertatgivenpos(Node head,int pos,int data) {
		Node temp=new Node(data);
		if(pos==1) {
			temp.next=head;
			return temp;
		}
		Node curr=head;
		for(int i=1;i<=pos-2 && curr!=null;i++) {
			curr=curr.next;
		}
		if(curr==null) {
			return head;
		}
		temp.next=curr.next;
		curr.next=temp;
		return head;
		
	}

	public static void main(String[] args) {
		Node head=null;
		head=insertatend(head,1);
		head=insertatend(head,2);
		head=insertatend(head,3);
		head=insertatend(head,4);
		head=insertatend(head,5);
		head=insertatgivenpos(head,6,10);
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

