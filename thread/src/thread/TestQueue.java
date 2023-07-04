package thread;

public class TestQueue implements Runnable {
	
	private MyQueue q;
	
	{
		q=new MyQueue();
	}

	
//	Insert
	public void insertIt(char ch) {
		try {
			q.push(ch);
		} catch (OutOfBoundException e) {
			System.out.println(e.getErrorMessage());		
		}
		
	}
	
	
//	Pop
	public void popIt() {
		try {
			System.out.println(q.pop());	
		} catch (OutOfBoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorMessage());		
		}
		
	}
	
	
	
	@Override
	public void run() {
//		Insert
		insertIt('a');
		insertIt('b');
		insertIt('c');
		
//		Pop
		popIt();
		popIt();
		
			
	}
	

}
