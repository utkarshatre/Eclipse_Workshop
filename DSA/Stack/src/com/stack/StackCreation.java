package com.stack;
class StackCreation {
	static int []stack;
	static int top;
	public static void create(int size) {
		stack = new int [size];
		top = -1;
		System.out.println("Stack created of size "+size);
	}
	public static void push(int ele) {
		System.out.println("tyring to enter element "+ele);
		if(top == stack.length-1) {
			System.out.println("Stack overflow");
		}
		else {
			top++;
			stack[top]=ele;
			System.out.println("element "+ele+" stored at top "+top);
		}
	}
	public static void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
		}
		else {
			System.out.println("Element is going to delete at "+top);
			stack[top]=0;
			System.out.println("Element is deleted at "+top);
			top--;
		}
		
	}
	public static boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	public static boolean isFull() {
		if(top==stack.length-1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		create(5);
		push(20);
		push(10);
		push(30);
		push(40);
		push(50);
		push(60);
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		System.out.println(isEmpty());
		System.out.println(isFull());
	}
}