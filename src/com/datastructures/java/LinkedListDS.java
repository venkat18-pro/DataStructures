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
	
	public static void main(String[] args) {

		LinkedListDS list = new LinkedListDS();
		list.head = new NodeLink(10);

	}

}
