package com.DataStructureLinkedList;

public class MyLinkedList {

	Node head;

	public MyLinkedList addNode(MyLinkedList list, int data) {

		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse till the last node and insert the new_node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		return list;
	}

	public void printList(MyLinkedList list) {
		Node currNode = list.head;
		System.out.println("LinkedList: ");

		while (currNode != null) {

			System.out.println(currNode.key + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

	// create add first method
	public void addFirst(MyLinkedList list, int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node newNode = new Node(data);
			newNode.setNext(head);
			head = newNode;
		}

	}

	// create remove middle method
	public void deleteMiddle(MyLinkedList list, int data) {
		Node first = head;
		Node second = head;
		Node prev = null;

		while (second != null && second.next != null) {
			prev = first;
			first = first.next;
			second = second.next.next;
		}

		if (prev != null)
			prev.next = first.next;
		else
			head = head.next;

	}

	// create remove last method
	public int removeLast(MyLinkedList list) {
		if (head == null) {
			System.out.println("Empty list");
			return 0;
		} else if (head.getNext() == null) {
			int temp = head.getKey();
			head = null;
			return temp;
		} else {
			Node current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			int temp = current.getNext().getKey();
			current.setNext(null);
			return temp;
		}
	}

}
