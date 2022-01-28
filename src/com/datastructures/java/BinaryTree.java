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
	
	public BinaryTree(int key) {
		root = new Node(key);
	}
	
	BinaryTree(){
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Root Node: " + tree.root.key);
		System.out.println("Left Node: " + tree.root.left.key);
		System.out.println("Right Node: " + tree.root.right.key);
		System.out.println("Left Left Node: " + tree.root.left.left.key);
		System.out.println("Left Right Node: " + tree.root.left.right.key);
		
		
	}

}
