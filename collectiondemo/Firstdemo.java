package collectiondemo;

import java.util.ArrayList;

public class Firstdemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("100");
		a1.add(200);
		a1.add("52");
		a1.add("omi");	
		
		System.out.println(a1.contains(100));
		ArrayList a2=new ArrayList();
		a2.add(45);
		a2.add(799);
		a2.add(200);
		a2.add("adb,mx");	
		a1.remove("100");
		
		a1.addAll(a2);
		System.out.println(a1);
		
		a1.removeAll(a2);
		System.out.println(a1);
	}

}
