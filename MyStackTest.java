package com.blz.training;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyStackTest {

	@Test
	public void threeNumbersPushedToStackTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(thirdNode, peak);
	}

	@Test
	public void threeNumbersPoppedFromStackTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		INode popedNode = myStack.pop();
		myStack.printStack();
		INode popedNode1 = myStack.pop();
		myStack.printStack();
		INode popedNode2 = myStack.pop();
		Assert.assertEquals(firstNode, popedNode2);
	}

}
