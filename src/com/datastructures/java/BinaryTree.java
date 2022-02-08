package com.datastructures.java;

class Node{
	int key;
	Node left, right;
	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;
	
//	public BinaryTree(int key) {
//		root = new Node(key);
//	}
	
	BinaryTree(){
		root = null;
	}
	
	void printPostorder(Node node) {
		if(node == null) {
			return;
		}
		
		printPostorder(node.left);
		
		printPostorder(node.right);
		
		System.out.print(node.key+" ");
		
	}
	
	void printInorder(Node node) {
		if(node == null) return;
		
		printInorder(node.left);
		
		System.out.print(node.key+" ");
		
		printInorder(node.right);
		
	}
	
	void printInorder() { printInorder(root); }
	void printPostorder(){ printPostorder(root); }
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		System.out.println("Root Node: " + tree.root.key);
		System.out.println("Left Node: " + tree.root.left.key);
		System.out.println("Right Node: " + tree.root.right.key);
		System.out.println("Left Left Node: " + tree.root.left.left.key);
		System.out.println("Left Right Node: " + tree.root.left.right.key);
		System.out.println("Right Left Node: "+tree.root.right.left.key);
		System.out.println("Right Right Node: "+tree.root.right.right.key);
		
		System.out.println("Post Order: ");
		tree.printPostorder();
		System.out.println();
		System.out.println("Inorder: ");
		tree.printInorder();
	}

}
