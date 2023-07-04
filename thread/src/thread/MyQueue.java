package thread;

public class MyQueue {
	
	private int startIndex=0;
	private int tailIndex=0;
	private char info[]=new char[2];
	
	public synchronized void push(char ch) throws OutOfBoundException {
		if(tailIndex>=2) {
			throw new OutOfBoundException("Out of bound for push operation in queue!");
		}
		info[tailIndex++]=ch;
		
	}
	
	public synchronized char pop() throws OutOfBoundException {
		if(startIndex>tailIndex) {
			throw new OutOfBoundException("Out of bound for pop operation in queue!");
		}
		return info[startIndex++];	
	}

}
