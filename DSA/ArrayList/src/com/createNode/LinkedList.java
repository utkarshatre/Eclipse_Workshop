package com.createNode;

public class LinkedList {
	Node head;
	void insert(int ele) {
		Node n = new Node(ele);     // ele ! node n
		if(head==null) {            // case 1
			head= n;				// n stored in head and head is having elemnet
		}
		else {
			Node temp = head;			// create temp adddress 
			while(temp.next!=null) {     // last element kw phle tak
				temp= temp.next;         // us ele ke adrress pe age wala address dalna hai
			}
			temp.next =n;				
		}
		System.out.println("Node added with value "+ele);
	}
	void display() {
		if(head==null) {
			System.out.println("LinkedList Emplty");
		}
		else {
			System.out.println("linkedlist element are");
			Node temp = head;
			while(temp.next!=null) {
			System.out.println("["+temp.data);
			System.out.println(" " +temp.next+"] "+temp+"  ");
			
			temp=temp.next;
			}
			System.out.print(" ["+temp.data);
			System.out.print(" " +temp.next+"]\n");
		}
	}
	void insertfront(int ele) {
		Node n = new Node(5);
		if(head==null) {
			head=n;
		}
		else {
			n.next= head; // create a link with n to head
			head=n;       // n  will become head
		}
	}
	int count() {
		if(head==null) {
			return 0;
		}
		else {
			int c =0;
			Node temp = head;
			while(temp.next!=null) {
				c++;
				temp = temp.next;
			}
			c++;
			return c;
		}
	}
	void insert(int ele, int pos)
	{
		if(pos>count()) {
			System.out.println("invalid position");
		}
		else if(pos==1){
			insertfront(ele);
		}
		else {
			Node n = new Node(ele);
			int c=2;
			Node temp = head;
			while(temp.next!=null) {
				if(c==pos) {
					break;
				}
				temp=temp.next;
				c++;	
			}
			n.next=temp.next;
			temp.next=n;
			System.out.println("Node added with value "+ele);
		}
	}
	void reverse() {
		
	}
}
