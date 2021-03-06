package Thread;

class PriorityThread extends Thread{
	
	public void run() {
		int sum = 0;
		
		Thread t = Thread.currentThread();
		System.out.println(t+"start");

		for (int i = 0; i <= 1000000; i++) {
			sum += i ;
		}
		System.out.println(t.getPriority() + "end");
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
			PriorityThread pt = new PriorityThread();
			pt.setPriority(i); 
			pt.start();
		}
	}

}
