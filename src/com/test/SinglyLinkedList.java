package com.test;

public class SinglyLinkedList  {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(3);
		sll.addNode(4);
		
		sll.display();
	}

	 class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
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
