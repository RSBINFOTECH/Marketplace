package com.marketplace.MarketPlace;
public class LinkedList 
{ 
	Node head; // head of list 

	/* Linked list Node*/
	public class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Given a key, deletes the first occurrence of key in linked list */
	void deleteNode(int key) 
	{ 
		Node temp = head, prev = null; 
		if (temp != null && temp.data == key) 
		{ 
			head = temp.next; // Changed head 
			return; 
		} 
		while (temp != null && temp.data != key) 
		{ 
			prev = temp; 
			temp = temp.next; 
		}	 

		// If key was not present in linked list 
		if (temp == null) return; 

		// Unlink the node from linked list 
		prev.next = temp.next; 
	} 

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 
	
	
	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	} 
	public static void main(String[] args) 
	{ 
		LinkedList llist = new LinkedList(); 
		llist.push(1); 
		llist.push(3); 
		llist.push(2); 
		System.out.println("\nCreated Linked list is:"); 
		llist.printList(); 
		llist.deleteNode(1); // Delete node at position 4 
		System.out.println("\nLinked List after Deletion at position 4:"); 
		llist.printList();
		
		    int num = 10;
	        boolean flag = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }
	        if (!flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	    }
	 
	
	
	
} 
