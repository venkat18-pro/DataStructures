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
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void main(String[] args) {

		LinkedListDS list = new LinkedListDS();
		list.head = new NodeLink(10);
		NodeLink second = new NodeLink(20);
		NodeLink thrid = new NodeLink(30);
		
		list.head.next = second;
		second.next = thrid;
		
		list.printList();
		
	}

}
