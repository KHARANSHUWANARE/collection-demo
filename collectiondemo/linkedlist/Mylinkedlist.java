package collectiondemo.linkedlist;

import java.util.LinkedList;
public class Mylinkedlist {
	public static void main(String[] args) {
		LinkedList objLinkedList=new LinkedList();
		objLinkedList.add("55");
		objLinkedList.add(78);		
		System.out.println(objLinkedList);
		
		objLinkedList.addFirst(7);
		objLinkedList.addLast(1);
		
		objLinkedList.getFirst();
		objLinkedList.getLast();
		
		objLinkedList.removeFirst();
		objLinkedList.removeLast();
		
		System.out.println(objLinkedList);
	}
}
