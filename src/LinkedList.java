
public class LinkedList {
	
	Node head;
	
	//Traverse Linked List(print all elements)
	public void printList() {
		Node pointer = head;
		
		while(pointer!=null) {
			System.out.print(pointer.data + "->");
			pointer = pointer.next;
		}
	}
	
	
	//insert a node at beginning of linkedList
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	//insert a node at last of linkedList
	public void append(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		
		//case when list is empty
		if(head==null) {
			head = newNode;
			return;
		}
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	// insert a node after given node
	
	public void insertAfter(Node prevNode, int data) {
		if(prevNode==null) {
			System.out.println("previous node cannot be null");
			return;
		}
		
		Node newNode = new Node(data);
		Node temp = head;
		while(temp!=prevNode) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
}
