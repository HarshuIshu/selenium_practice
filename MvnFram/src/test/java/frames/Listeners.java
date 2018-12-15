
package frames;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

 BaseClass b=new BaseClass();
	
	

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test passed.Passed test name:"+ result);
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			
			b.Screenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Execution of test failed.Failed Test Name: "+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("contextof the test-onstart " + context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Iam tired so pls stop lol");
		System.out.println("finished testcontext-on finish" +context );
		
	}

}