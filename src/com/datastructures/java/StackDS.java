package com.datastructures.java;

class Stack{
	
	private int maxSize;
	private int[] stack;
	private int top;
	
	Stack(int max){
		maxSize = max;
		stack = new int[maxSize];
		top = -1;
	}
	
	public void push(int value) {
		stack[++top] = value;
	}
	
	public int pop() {
		return stack[top--];
	}
	
	public int peek() {
		return stack[top];
	}
	
	public boolean isEmity() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
}

public class StackDS {

	public static void main(String[] args) {
		
		Stack st = new Stack(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(60);
		
		System.out.println(st.pop());
		System.out.println(st.isFull());
		
		st.push(70);
		System.out.println(st.isFull());
		
		while(!(st.isEmity())) {
			System.out.println(st.peek());
			st.pop();
		}
		
	}

}
