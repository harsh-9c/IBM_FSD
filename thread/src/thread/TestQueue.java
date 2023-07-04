package thread;

public class TestQueue implements Runnable {
	
	private MyQueue q;
	
	{
		q=new MyQueue();
	}

	@Override
	public void run() {
//		Push
		try {
			q.push('a');
		} catch (OutOfBoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorMessage());		
		}
		
		try {
			q.push('b');
		} catch (OutOfBoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorMessage());		
		}
		
		try {
			q.push('c');
		} catch (OutOfBoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorMessage());		
		}
		
		
//		Pop
		
		try {
			q.pop();
		} catch (OutOfBoundPop e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorMessage());		
		}
		
		try {
			q.pop();
		} catch (OutOfBoundPop e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorMessage());		
		}
		
		
	}
	
	
	


}
