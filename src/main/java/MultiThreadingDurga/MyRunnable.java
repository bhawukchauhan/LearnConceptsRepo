package MultiThreadingDurga;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread run method - " + i);
				if (i == 4)
					Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Interrupted Exception message : " + e.getMessage());
		}
	}
}
