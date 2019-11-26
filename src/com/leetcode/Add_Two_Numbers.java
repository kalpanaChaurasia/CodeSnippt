package com.leetcode;

import java.util.LinkedList;

public class Add_Two_Numbers {

	/*
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order and each of their nodes
	 * contain a single digit. Add the two numbers and return it as a linked list.
	 * 
	 * You may assume the two numbers do not contain any leading zero, except the
	 * number 0 itself.
	 * 
	 * Example:
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
	 * 465 = 807.
	 */
	public static void main(String[] args) {

		LinkedList<Integer> linkedList1 = new LinkedList<>();
		LinkedList<Integer> linkedList2 = new LinkedList<>();
		LinkedList<Integer> linkedList3 = new LinkedList<>();
	
		linkedList1.add(2);
		linkedList1.add(4);
		linkedList1.add(3);
		
		linkedList2.add(5);
		linkedList2.add(6);
		linkedList2.add(4);
		
		linkedList3 = addTwoLists(linkedList1, linkedList2);
		linkedList3.forEach(a -> System.out.print(" " + a));
	}

	public static LinkedList<Integer> addTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		//case if l1 is null or lesser then l2 or vise versa
		int carry = 0;
		LinkedList<Integer> l3 = new LinkedList<>();
		for (int i = l1.size() - 1; i >= 0; i--) {
			int parseInt = Integer.parseInt(l1.get(i).toString());
			int parseInt2 = Integer.parseInt(l2.get(i).toString());
			int sum = parseInt + parseInt2 + carry;
			int value = sum % 10;
			carry = sum / 10;
			l3.add(value);
		}
		return l3;
	}

}
