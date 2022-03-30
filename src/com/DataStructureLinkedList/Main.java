package com.DataStructureLinkedList;

public class Main {
	public static void main(String[] args) {

		MyLinkedList mls = new MyLinkedList();
		mls.addNode(mls, 55);
		mls.addNode(mls, 30);
		mls.addNode(mls, 70);

		mls.printList(mls);

		mls.addFirst(mls, 25);

		System.out.println("My linked list after add method ");
		mls.printList(mls);

		mls.deleteMiddle(mls, 30);
		System.out.println("My linked list after delete method ");
		mls.printList(mls);
		
		mls.removeLast(mls);
		System.out.println("My linked list after deleteLast method ");
		mls.printList(mls);

	}

}
