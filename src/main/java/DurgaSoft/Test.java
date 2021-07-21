package DurgaSoft;

public class Test {

	public static void main(String[] args) {
		Runnable r = new Demo();
		Thread t = new Thread(r);
		//Now a new thread will be started
		t.start();
		
		Runnable rL = () -> {
			for(int i=0; i<10; i++)
				System.out.println("Thread in lambda : " + i);
		};
		Thread t2 = new Thread(rL);
		t2.start();
		
		for(int i=0; i<10; i++)
			System.out.println("Thread in main : " + i);
	}

}
