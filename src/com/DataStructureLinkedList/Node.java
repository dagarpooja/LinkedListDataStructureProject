package com.DataStructureLinkedList;

public class Node {

	int key;
	Node next;

	Node(int d) {
		key = d;
		next = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("MyNode{" + key + "}");

		if (next != null) {
			sb.append("=>" + next);
		}
		return sb.toString();

	}
}
