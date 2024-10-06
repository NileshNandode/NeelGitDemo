package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	
	
	 public void onTestFailure(ITestResult result) {
		 System.out.println(result.getName() + " <- this method got failed.....!!");
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 System.out.println(result.getName() + " Successfully executed pass code of listener...!!");
		  }
}
