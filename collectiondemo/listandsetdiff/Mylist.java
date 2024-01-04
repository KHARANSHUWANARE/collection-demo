package collectiondemo.listandsetdiff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mylist {
public static void main(String[] args) {
	List l1=new ArrayList();
	l1.add(100);
	l1.add(200);
	l1.add(200);
	l1.add(null);
	l1.add(null);
	l1.add(2,500);
	System.out.println(l1);
	
	Iterator itr1=l1.iterator();
	while (itr1.hasNext()) {
		System.out.println(itr1.next());		
	}
}
}
