package com.blz.training;

public class MyStack<K> {

	private final MyLinkedList myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList<>();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
