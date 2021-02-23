import java.util.HashSet;

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
	
	
	//delete node for first occurence of key
	public void deleteNode(int key) {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		
		Node temp=head, prev = head;
		
		//key is present at head
		if(temp.data==key) {
			head = temp.next;
			temp.next = null;
			return;
		}
		
		while(temp!=null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp==null) {
			System.out.println("key not present in list");
			return;
		}
		
		prev.next = temp.next;
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
	
	
	//remove duplicates from linked list using hashset O(n) space O(n)
//	public void removeDuplicates() {
//		if(head==null) {
//			System.out.println("List is empty");
//			return;
//		}
//		
//		Node curr=head,prev=head;
//		HashSet<Integer> buffer = new HashSet<>();
//		while(curr!=null) {
//			if(buffer.contains(curr.data)) {
//				prev.next = curr.next;
//			}else {
//				buffer.add(curr.data);
//				prev=curr;
//			}
//			curr = curr.next;
//		}
//	}
	
	//remove duplicates without using extra space
	public void removeDuplicates() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode!=null) {
			Node prev = currNode;
			Node curr = currNode.next;
			while(curr!=null) {
				if(currNode.data == curr.data) {
					prev.next = curr.next;
				}else {
					prev=curr;
				}
				curr = curr.next;
			}
			currNode=currNode.next;
		}
	}
	
}
