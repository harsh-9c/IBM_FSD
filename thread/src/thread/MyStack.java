package thread;

import java.io.*;

public class MyStack {
	
	private int index=0;
	private char info[]=new char[2];
	
	public synchronized void push(char ch) throws OutOfBoundException {
		if(index>=2) {
			throw new OutOfBoundException("Out of bound for push operation in stack!");
		}
		info[index++]=ch;
		
	}
	
	public synchronized char pop() throws OutOfBoundPop {
		if(index>=2 || index<0) {
			throw new OutOfBoundPop("Out of bound for pop operation in stack!");
		}
		return info[index--];	
	}
	
	

}
