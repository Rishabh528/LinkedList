
public class Runner {

	public static void main(String[] args) {
		
		/* Start with the empty list */
        LinkedList llist = new LinkedList(); 
  
        // Insert 6.  So linked list becomes 6->NUllist 
        llist.append(6); 
        // Insert 7 at the beginning. So linked list becomes 
        // 7->6->NUllist 
        llist.push(7); 
        // Insert 1 at the beginning. So linked list becomes 
        // 1->7->6->NUllist 
        llist.push(1); 
        // Insert 4 at the end. So linked list becomes 
        // 1->7->6->4->NUllist 
        llist.append(4); 
        // Insert 8, after 7. So linked list becomes 
        // 1->7->8->6->4->NUllist 
        llist.insertAfter(llist.head.next, 8); 
  
//        System.out.println("\nCreated Linked list is: "); 
//        llist.printList();
//        
//        llist.deleteNode(4);
//        System.out.println("\nCreated Linked list is: "); 
//        llist.printList();
//        
//        llist.deleteNode(1);
//        System.out.println("\nCreated Linked list is: "); 
//        llist.printList();
//        
//        llist.deleteNode(10);
        
        llist.push(6);
        llist.push(1);
        llist.push(7);
        llist.push(8);
        System.out.println("\nCreated Linked list is: "); 
        llist.printList();
        
        llist.removeDuplicates();
        System.out.println("\nCreated Linked list is: "); 
        llist.printList();
        
	}

}
