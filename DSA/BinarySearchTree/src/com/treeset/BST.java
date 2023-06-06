
package com.treeset;

public class BST {
	static class Node{
		int data; 
		Node left;
		Node right;
		Node(int value){
			data=value;
		}
	}
	static void insert(Node n, int value) {
		if(n.data>value) {
			if(n.left!=null) {
				insert(n.left,value);
			}
			else {
				System.out.println("inserted "+value+" towards left of "+n.data);
				n.left= new Node(value);
			}
		}
		else if(n.data>value) {
			if(n.right!=null) {
				insert(n.right,value);
			}
			else {
				System.out.println("inserted "+value+" towards right of "+n.data);
				n.right= new Node(value);
			}
		}
	}
	static void inorder(Node  n) {
		if(n!=null) {
			inorder(n.left);
			System.out.println(n.data);
			inorder(n.right);
		}
	}
	static void preorder(Node n) {
		if(n!=null) {
			System.out.println(n.data+"  ");
			preorder(n.left);
			preorder(n.right);

		}
	}
	static void postorder(Node n) {
		if(n!=null) {
			postorder(n.left);
			postorder(n.right);
			System.out.println(n.data+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr = {70,18,7,19,90,80,96,101,17,77,86};
		Node root = new Node(arr[0]);
		for(int i= 0; i<)
		Node root= new Node(5);
		insert(root,3);
		insert(root,2);
		insert(root,4);
		insert(root,7);
		insert(root,6);
		insert(root,8);
	}
}
