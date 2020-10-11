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

}
