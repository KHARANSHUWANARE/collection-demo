package collectiondemo.listandsetdiff;

import java.util.HashSet;
import java.util.Set;

public class Myset {
public static void main(String[] args) {
	Set s1=new HashSet();
	s1.add(100);
	s1.add(200);
	s1.add(300);
	s1.add(50);
	s1.add(250);
	s1.add(300);
	s1.add(400);
	s1.add(null);
	s1.add(null);
	System.out.println(s1);
}
}
