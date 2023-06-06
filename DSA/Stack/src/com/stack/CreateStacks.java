package com.stack;

public class CreateStacks {
	static int [] stack;
	static int top;
	static void createstack(int size) {
		stack = new int [size];
		top=-1;
		System.out.println("Stack has benn ceated with size "+size);

	}
	static void push(int ele) {
		if(top == stack.length-1) {
			System.out.println("Stack overflow");
		}
		else {
			top++;
			stack[top]=ele;
			System.out.println(ele+"is inserted");
		}
	}
	static void pop() {
		if(top==-1) {
			System.out.println("stack underflow");
		}
		else {
			System.out.println(stack[top]+"is going to poped/deleted");
			stack[top]=0;
			System.out.println(stack[top]+ " is empty");
			top--;
		}	
	}
	static boolean isEmpty() {
		if(top==-1) {
			return true;
		} 
		return false;
	}
	static boolean isFull() {
		if(top == stack.length-1) {
			return true;			
		}
		return false;
	}
	public static void main(String[] args) {
		createstack(5);
		push(10);
		push(20);
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
		//isFull();
	}
}
