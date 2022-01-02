package Thread;

class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i <200; i++ ) {
			System.out.println(i + "\t");
		}
	}
	
}

public class ThreadRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread() + "start");
		
		MyRunnableThread runnable = new MyRunnableThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
		
	}

}
