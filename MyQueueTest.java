package com.blz.training;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

	@Test
	public void threeNumbersAddedToQueueTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueu(firstNode);
		myQueue.enqueu(secondNode);
		myQueue.enqueu(thirdNode);
		myQueue.printQueue();
		Assert.assertEquals((int) firstNode.getKey(), 56);
	}

	@Test
	public void threeNumbersDeletedFromStackTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueu(firstNode);
		myQueue.enqueu(secondNode);
		myQueue.enqueu(thirdNode);
		myQueue.printQueue();
		INode popedNode = myQueue.dequeue();
		myQueue.printQueue();
		INode popedNode1 = myQueue.dequeue();
		myQueue.printQueue();
		INode popedNode2 = myQueue.dequeue();
		Assert.assertEquals(thirdNode, popedNode2);
	}
}
