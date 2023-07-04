package thread;


public class MyStack {
	
	private int index=0;
	private char info[]=new char[4];
	
	public synchronized void push(char ch) throws OutOfBoundException {
		if(index>=4) {
			throw new OutOfBoundException("Out of bound for push operation in stack!");
		}
		info[index++]=ch;
		
	}
	
	public synchronized char pop() throws OutOfBoundException {
		if(index>4 || index<0) {
			throw new OutOfBoundException("Out of bound for pop operation in stack!");
		}
		index--;
		return info[index];	
	}
	
	

}
