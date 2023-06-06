package com;

public class HashMap {
	static  int[] hashmap;
	static int hash;
	static void createHashMap(int size) {
		hashmap = new int [size];
		hash = size;
		for(int i =0; i<hashmap.length;i++){
			hashmap[i]=-1;
		}
	}
	static void insert(int ele) {
		int index;
		index=ele%hash;
		if(hashmap[index]!=-1) {
			System.out.println("element already existed");

		}
		else {
			hashmap[index]=ele;
		}
	}
	static void delete(int ele) {
		int index;
		index=ele%hash;
		if(hashmap[index]==ele) {
			hashmap[index]=-1;
			System.out.println("element deleted");
		}
		else {
			System.out.println("already empty");
		}
	}
	static void reset() {
		for(int i =0; i<hash; i++) {
			hashmap[i]=-1;
		}
		System.out.println("hashmap is reset");
	}
	static void display() {
		for(int ele : hashmap) {
			if(ele!=-1) {
				System.out.println(ele);
			}
		}
	}
	public 	static void main(String[] args) {
		createHashMap(5);
		insert(0);
		insert(10);
		insert(1);
		insert(6);
		display();
		reset();
	}
}
