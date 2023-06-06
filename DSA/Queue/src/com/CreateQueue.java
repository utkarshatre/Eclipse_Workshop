package com;

public class CreateQueue {
static int[] queue;
static int front;
static int rear;
static int capacity;
public static void createqueue(int size) {
	queue = new int[size];
	front = 0;
	rear = 0;
	capacity = 0;
}
public static void enqueue(int ele) {
	if(rear==queue.length) {
		System.out.println("queue is full");
	}
	else {
		queue[rear]=ele;
		rear++;
		capacity++;
		System.out.println(ele+" elemenrtt is added to queue");
	}
}
public static void dequeue(int ele) {
	if(front == rear) {
		System.out.println("queue is empty");
	}
	else {
		System.out.println(queue[0]+" is deleted");
	}
}

public static void main(String[] args) {
	
}
}
