package com.marketplace.insertscript;

import com.marketplace.MarketPlace.LinkedList.Node;

public class LinkedList {

	Node head;
	
	
	static class Node 
	{ 
		
		int data;
		Node next;
		
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
		
	}
	public void print()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.println(node.data);
			
			node=node.next;
		}
	}
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 
	
	public void delete( int posstion)
	{
		Node prev=head;
		int count=1;
		while(count <posstion -1)
		{
			prev=prev.next;
			count++;
		}
		
		Node current =prev.next;
		prev.next=current.next;
		
		current.next=null;
	}
	
	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.push(10);
		ls.push(11);
		ls.push(12);
		ls.push(13);
		ls.print();
		//ls.delete(13);
	}
}
