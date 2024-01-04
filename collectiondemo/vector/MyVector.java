package collectiondemo.vector;

import java.util.ArrayList;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		Vector vector=new Vector();
		vector.add(78);
		vector.add(1);
		vector.add("78");
		vector.add(78);
		
		vector.set(2, "www");
		System.out.println(vector);
	}

}
