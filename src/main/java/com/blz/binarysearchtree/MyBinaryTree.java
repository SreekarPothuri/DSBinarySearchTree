package com.blz.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {
	public MyBinaryNode<K> root;
	public MyBinaryNode<K> current;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public boolean searchRecursively(MyBinaryNode<K> root, int value, MyBinaryNode<K> parent) {
		if (root == null) {
			return false;
		}
		if (root.key.equals(value)) {
			if (parent == null) {
				System.out.println("the node with key " + value + " is root node");
			} else if (value > (int) parent.key) {
				System.out.println("Given key is right node of node with key " + parent.key);
			} else {
				System.out.println("Given key is left node of node with key " + parent.key);
			}
		}

		if (value < (int) root.key)
			searchRecursively(root.left, value, root);
		else
			searchRecursively(root.right, value, root);

		return true;
	}
}
