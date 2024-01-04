package collectiondemo.mystack;

import java.util.Stack;

public class Mystack {
public static void main(String[] args) {
	Stack stack=new Stack();
	
	stack.push(40);
	stack.push(80);
	stack.push(90);
	
	System.out.println(stack);
	
	System.out.println(stack.peek());
	System.out.println(stack.empty());
	System.out.println(stack.search(80));
}
}
