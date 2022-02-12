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
	
	public void append(int data) {
		NodeLink newNode = new NodeLink(data);
		
		if(head == null) {
			head = new NodeLink(data);
			return;
		}
		
		NodeLink lists = head;
		while(lists.next != null) lists = lists.next;
		
		lists.next = newNode;
		return;
		
	}
	
	public void deleteNode(int key)
	   {
      
        NodeLink temp = head, prev = null;
 
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;
        prev.next = temp.next;
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
		System.out.println("insert the value in last Node: ");
		list.append(60);
		list.printList();
		System.out.println("Delete Node list value: ");
		list.deleteNode(30);
		list.printList();
		
	}

}
