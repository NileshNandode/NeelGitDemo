package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void methodDisplayForDay1()
	{
		System.out.println("Hello TestNG day 1!!");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void beforeTestDay1()
	{
		System.out.println("I executed first [beforetest used] .. day 1!!");
	}
	
	@AfterTest
	public void afterTestDay1()
	{
		System.out.println("I executed last[aftertest used] .. day 1!!");
	}
	
	@AfterSuite
	public void aftersuiteinday1()
	{
		System.out.println("I am executed first[aftersuite used] from last !!");
	}
	
}
