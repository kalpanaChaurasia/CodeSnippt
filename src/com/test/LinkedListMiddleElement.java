package com.test;

public class LinkedListMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListType linkedList = new LinkedListType();
		LinkedListType.Node head = linkedList.head();
	  
	    
	      linkedList.add( new LinkedListType.Node("1"));
//	      linkedList.add( new LinkedListType.Node("3"));
//	      linkedList.add( new LinkedListType.Node("34"));
//	      linkedList.add( new LinkedListType.Node("44"));
//	      linkedList.add( new LinkedListType.Node("55"));
	      //finding middle element of LinkedList in single pass
	      
	    
	      
	      
	      LinkedListType.Node current = head;
	      int length = 0;
	      LinkedListType.Node middle = head;
	    
	      while(current.next() != null){
	    	  System.out.println(  current.toString());
	          length++;
	          if(length%2 ==0){
	              middle = middle.next();
	          }
	          current = current.next();
	      }
	    
	      if(length%2 == 1){
	          middle = middle.next();
	      }

	      System.out.println("length of LinkedList: " + length);
	      System.out.println("middle element of LinkedList : " + middle);
	      
	    } 
	  
	}

	class LinkedListType{
	    private Node head;
	    private Node tail;
	  
	    public LinkedListType(){
	        this.head = new Node("head");
	        tail = head;
	    }
	  
	    public Node head(){
	        return head;
	    }
	  
	    public void add(Node node){
	        tail.next = node;
	        tail = node;
	    }
	  
	    public static class Node{
	        private Node next;
	        private String data;

	        public Node(String data){
	            this.data = data;
	        }
	      
	        public String data() {
	            return data;
	        }

	        public void setData(String data) {
	            this.data = data;
	        }

	        public Node next() {
	            return next;
	        }

	        public void setNext(Node next) {
	            this.next = next;
	        }
	      
	        public String toString(){
	            return this.data;
	        }
	    }
	}
