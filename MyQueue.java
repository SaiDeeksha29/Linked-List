package com.blz.training;

public class MyQueue<K> {
	
	private MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<>();
	}
	
	public void enqueu(INode newNode) {
		myLinkedList.append(newNode);
	}

	public INode dequeue() {
		return myLinkedList.pop();
	}
	
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
}