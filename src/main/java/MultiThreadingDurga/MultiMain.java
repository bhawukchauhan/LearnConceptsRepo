package MultiThreadingDurga;

public class MultiMain {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		t.interrupt();
		for (int i = 0; i < 10; i++)			
			System.out.println("main method - " + i);
	}
}
