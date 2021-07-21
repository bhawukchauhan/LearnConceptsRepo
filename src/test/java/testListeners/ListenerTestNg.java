package testListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNg implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart result = " + result.toString());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess result = " + result.toString());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure message from result = " + result.getThrowable().getMessage());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//System.out.println("onTestSkipped");
		System.out.println("onTestSkipped overwrite");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart result = " + context.toString());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish result = " + context.toString());
	}

}
