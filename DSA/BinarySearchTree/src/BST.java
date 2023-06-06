
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
	public static void main(String[] args) {
		Node root= new Node(5);
		insert(root,3);
		insert(root,2);
		insert(root,4);
		insert(root,7);
		insert(root,6);
		insert(root,8);
	}
}
