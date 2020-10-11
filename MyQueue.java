package com.blz.training;

public class MyQueue<K> {
	
	private MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<>();
	}
	
	public void enqueu(INode newNode) {
		myLinkedList.append(newNode);
	}
	
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
}