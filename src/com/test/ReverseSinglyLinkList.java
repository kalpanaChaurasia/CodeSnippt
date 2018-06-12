package com.test;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseSinglyLinkList {

	public static void main(String args[]) {
		//one way
		LinkedList<Integer> linkedListArray = new LinkedList<>();
		linkedListArray.add(5);
		linkedListArray.add(15);
		linkedListArray.add(55);
		linkedListArray.add(35);
	
		Iterator<Integer> reverseLinked =	linkedListArray.descendingIterator();
		do {
			System.out.println(""+reverseLinked.next());
		}while(reverseLinked.hasNext());
		
	}
	
	
	
	class Node<T> implements Comparable<T>{
		private T value;
		private Node<T> nextRef;

		
		
		public T getValue() {
			return value;
		}



		public void setValue(T value) {
			this.value = value;
		}



		public Node<T> getNextRef() {
			return nextRef;
		}



		public void setNextRef(Node<T> nextRef) {
			this.nextRef = nextRef;
		}



		@Override
		public int compareTo(T o) {
			// TODO Auto-generated method stub
			if(o ==  this.value) {
				return 0;
			}else {
			return 1;
			}
		}
		
	}
}
