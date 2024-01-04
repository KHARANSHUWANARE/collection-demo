package collectiondemo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	ListIterator ltr1=a1.listIterator();
	
	while (ltr1.hasNext()){
		System.out.println(ltr1.next());
	}
	System.out.println("*****************************************************");
	while (ltr1.hasPrevious()) {
		System.out.println(ltr1.previous());
	}
	//ltr1.next();
	ltr1.set(555555555);
	System.out.println(a1);
	
	
}
}
