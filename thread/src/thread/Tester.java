package thread;

public class Tester {

	public static void main(String[] args) {
		
		TestStack testStack=new TestStack();
		Thread t1=new Thread(testStack);
		t1.start();
		Thread t2=new Thread(testStack);
		t2.start();
		
		TestQueue testQueue=new TestQueue();
		Thread t3=new Thread(testQueue);
		t3.start();

	}

}
