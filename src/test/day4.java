package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {


	@Test(groups= {"Smoke","S1"})
	public void webLoginHomeLoan()
	{
		System.out.println("Inside webLoginCarLoan day4");
	}
	
	@Test(timeOut=4000)
	public void MobileLoginHomeLoan()
	{
		System.out.println("Inside MobileLoginCarLoan day4");
	}
	
	@Test(groups= {"S1"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("Inside LoginAPICarLoan day4");
	}
	
	@BeforeSuite
	public void aftersuiteinday4()
	{
		System.out.println("I am executed[beforesuite used] first !!");
	}
	
	@AfterMethod
	public void aftermethodday4()
	{
		System.out.println("I am executed[aftermethod used]  !!");
	}
}
