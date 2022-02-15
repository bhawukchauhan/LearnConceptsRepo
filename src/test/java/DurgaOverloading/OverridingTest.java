package DurgaOverloading;

import org.testng.annotations.Test;

import DurgaOveriding.Demo;

public class OverridingTest {
  @Test
  public void f() {
	  Demo d = new Demo();
	  d.m1(10);
  }
}
