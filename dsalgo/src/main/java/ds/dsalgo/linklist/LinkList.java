package ds.dsalgo.linklist;

public class LinkList {

	static Node head =null;
	
	public static void main(String[] args) {
		
		int data= 7;
		addNodeAtHead(data);
		
		int data2= 8;
		addNodeAtHead(data2);
		
		printLinklist();

		
		reverseLinkList(head);
	}

	private static Node  reverseLinkList(Node head) {
		
		if(head == null) {
			return head;
		}
		
		reverseLinkList(head.next);
		
		System.out.println("reversing now ::"+head.data);
		return head;
	}

	private static void printLinklist() {
		Node iterate = head;
		Node lastNode = null;
		while(iterate.next!=null) {
			System.out.println(iterate.data);
			iterate = iterate.next;
			
		}
		System.out.println(iterate.data);
	}

	private static Node addNodeAtHead(int data) {
		
		Node temp = new Node(data);
		if(head== null) {
			head = temp;
			
		}else {
			Node tempo = head;
			head = temp;
			temp.next=tempo;
			
		}
		return head;
	}
	

}
