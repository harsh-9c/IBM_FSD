package thread;

public class MyQueue {
	
	private int startIndex=0;
	private int index=0;
	private char info[]=new char[2];
	
	public synchronized void push(char ch) throws OutOfBoundException {
		if(index>=2) {
			throw new OutOfBoundException("Out of bound for push operation in queue!");
		}
		info[index++]=ch;
		
	}
	
	public synchronized char pop() throws OutOfBoundPop {
		if(startIndex>index) {
			throw new OutOfBoundPop("Out of bound for pop operation in queue!");
		}
		return info[startIndex++];	
	}

}
