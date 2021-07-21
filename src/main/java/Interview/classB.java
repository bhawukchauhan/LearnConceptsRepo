package Interview;

public class classB extends classA{
	
	public classB() {
		super(); //parent class constructor is called by default
		//super() is implicit, parent class constructor doesn't get executed twice even if you write super() explicitly
		System.out.println("In class B constructor");
	}

	public void fnPrintB() {
		System.out.println("In class B");
	}
}
