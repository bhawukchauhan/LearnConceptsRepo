package MultiThreadingTest;

import org.testng.annotations.Test;

import MultiThreadingDurga.MyThread;

public class NewTest {
  @Test
  public void f() {
		MyThread t = new MyThread();
		t.start();
  }
}
