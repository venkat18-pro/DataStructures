package com.datastructures.java;

class NodeLink{
	int data;
	NodeLink next;
	NodeLink(int data){
		this.data = data;
		next = null;
	}
}	

public class LinkedListDS{
	NodeLink head;	
		
	void printList() {
		NodeLink n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	public void push(int data) {
		NodeLink newNode = new NodeLink(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfter(NodeLink perNode, int data) {
		if(perNode == null) {
			System.out.println("insert value cannot be null.");
			return;
		}
		NodeLink newNode = new NodeLink(data);
		
		newNode.next = perNode.next;
		perNode.next = newNode;
		
	}
	
	public static void main(String[] args) {

		LinkedListDS list = new LinkedListDS();
		list.head = new NodeLink(10);
		NodeLink second = new NodeLink(20);
		NodeLink thrid = new NodeLink(30);
		
		list.head.next = second;
		second.next = thrid;
		System.out.println("print the node value: ");
		list.printList();
		System.out.println("Add the new Node: ");
		list.push(40);
		list.printList();
		System.out.println("After insert value: ");
		list.insertAfter(second, 50);
		list.printList();
		
		
	}

}
