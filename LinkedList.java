/*
 * Created by Harish Choudhary
 */

class LinkedList
{
    Node head;  // head of list

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    //insert at the front
    public void insertFront(int data)
    {
        Node new_node = new Node(data);
 
        new_node.next = head;
 
        head = new_node;
    }
    //insert after a given node
    public void insertAfter(Node prev_node, int data)
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
 
        Node new_node = new Node(data);
 
        new_node.next = prev_node.next;

        prev_node.next = new_node;
    }
    //insert at the end
    public void insertAtEnd(int data)
    {
        Node n = new Node(data);
 
        if (head == null)
        {
            head = new Node(data);
            return;
        }
 
        n.next = null;
        
        Node last = head; 
        
        while (last.next != null){
            last = last.next;
        }    
 
        last.next = n;
        return;
    }
    //delete node with given data to be deleted
    public void delete(int data){
    	Node key=head;
    	Node prev=null;
    	if (key != null && key.data == data)
        {
            head = key.next;
            return;
        }
    	while(key!=null && key.data!=data){
    		prev=key;
    		key=key.next;
    	}
    	if(key==null){
    		return;
    	}
    	
    	prev.next=key.next;
    	
    	return;
    }
    //delete node with given position to be deleted
    public void deleteNode(int position){
    	if (head == null){
            return;
    	}    
    	
    	Node key=head;
    	Node prev;
    	if(position==0){
    		head=key.next;
    		return;
    	}
        for (int i=0; key!=null && i<position-1; i++){
            key = key.next;
        }
        if(key==null && key.next==null){
        	return;
        }
        prev=key;
        prev.next=key.next.next;    
    }
    //print the list
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
        	System.out.print(n.data);
            n = n.next;
            if(n==null){
            	System.out.print("");
            }else{
            	System.out.print("-->");
            }
        }
    }
    //find the length of LinkedList by iterative method
    public int getLength(){
    	Node key=head;
    	int count=0;
    	while(key!=null){
    		key=key.next;
    		count++;
    	}
    	return count;
    }
    //find length by recursive method
    public int getLengthRecursive(Node node){
    	if(node==null){
    		return 0;
    	}
    	return 1+getLengthRecursive(node.next);
    }
    
    public int getCountRec(){
    	return getLengthRecursive(head);
    }
    
    //find whether an element exist in the LinkeList(Iterative method)
    public boolean search(int x){
    	Node current=head;
    	while(current!=null){
    		if(current.data==x){
    			return true;
    		}
    		current=current.next;
    		
    	}
    	return false;
    }
    
   //find whether an element exist in the LinkedList(Recursive method)
    public boolean searchRec(Node head,int x){
    	if(head==null){
    		return false;
    	}
    	if(head.data==x){
    		return true;
    	}
    	return searchRec(head.next,x);
    }
    // main method to execute all operations
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
 
        llist.insertAtEnd(6);
 
        llist.insertFront(7);
 
        llist.insertFront(1);
 
        llist.insertAtEnd(4);
 
        llist.insertAfter(llist.head.next, 8);
        
        //llist.delete(1);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
        llist.deleteNode(2);
        System.out.println("\nAfter opertions:");
        llist.printList();
        //System.out.println("\n"+llist.getCountRec());
        
    }
}