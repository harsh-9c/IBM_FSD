package thread;

import java.io.*;

public class TestStack implements Runnable {

	private MyStack myStack;
	
	
	{
		myStack=new MyStack();
	}

	public void pushIt(char ch) {
		try {
			myStack.push(ch);
		} catch (OutOfBoundException e) {
			
			System.err.println(e.getErrorMessage());
		}	
	}
	
	public void popIt() {
		try {
			System.out.println(myStack.pop());
		} catch (OutOfBoundException e) {
			
			System.err.println(e.getErrorMessage());
		}
	}
	
	@Override
	public void run(){
//		Push
		pushIt('a');
		pushIt('b');
		pushIt('c');
		pushIt('d');
		pushIt('e');
		
//		Pop
		popIt();
		popIt();
		popIt();
		
	}
		
	
}
