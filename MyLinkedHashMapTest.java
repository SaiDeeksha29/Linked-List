package com.blz.training;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnWordsFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but"
				+ " because they keep putting themselves deliberately " + "into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		Assert.assertEquals(3, frequency);
	}

	@Test
	public void givenASentenceWhenWordsAreDeletedFromList() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately " + "into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		MyMapNode<String, Integer> delete = myLinkedHashMap.remove("avoidable");
		Assert.assertEquals("avoidable", delete.getKey());

	}
}
