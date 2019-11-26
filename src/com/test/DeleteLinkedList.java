package com.test;

public class DeleteLinkedList {

	public static void main(String[] args) {
		DeleteLinkedList dd = new DeleteLinkedList();
		dd.insert(1);
		dd.insert(2);
		dd.insert(3);
		dd.insert(4);

		dd.display();

		dd.delete(2);

		dd.display();

	}

	Node head = null, tail = null;

	class Node {
		int data;
		Node next;

		// Constructor
		public Node(int d) {
			data = d;
			next = null;
		}
	}

	void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	void delete(int key) {
		Node current = head, prev = null;
		if (current != null && current.data == key) {
			head = current.next;
			// Display the message
			System.out.println(key + " found and deleted");
		}

		while (current != null && current.data != key) {
			prev = current;
			current = current.next;
		}

		if (current != null) {
			// Since the key is at currNode
			// Unlink currNode from linked list
			prev.next = current.next;

			// Display the message
			System.out.println(key + " found and deleted");
		}

		if (current == null) {
			// Display the message
			System.out.println(key + " not found");
		}

	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		System.out.println("Nodes of singly linked list: ");

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

}
