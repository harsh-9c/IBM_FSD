package thread;

import java.io.*;

public class TestStack implements Runnable {

	private MyStack myStack;
	
	{
		myStack=new MyStack();
	}

	@Override
	public void run(){
//		Push
		try {
			myStack.push('a');
		} catch (OutOfBoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getErrorMessage());
		}
		try {
			myStack.push('b');
		} catch (OutOfBoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getErrorMessage());
		}
		try {
			myStack.push('c');
		} catch (OutOfBoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getErrorMessage());
		}
		
//		Pop
		try {
			System.out.println(myStack.pop());
		} catch (OutOfBoundPop e) {
			// TODO Auto-generated catch block
			System.err.println(e.getErrorMessage());
		}
		try {
			System.out.println(myStack.pop());
		} catch (OutOfBoundPop e) {
			// TODO Auto-generated catch block
			System.err.println(e.getErrorMessage());
		}
		
	}
		
	
}
