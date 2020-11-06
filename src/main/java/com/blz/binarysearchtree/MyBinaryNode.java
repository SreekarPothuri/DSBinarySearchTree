package com.blz.binarysearchtree;

public class MyBinaryNode<K extends Comparable<K>> {

	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
