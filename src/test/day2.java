package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void methodDisplayForDay2()
	{
		System.out.println("Hello TestNG day 2!!");
	}
	
	@Test(dependsOnMethods= {"methodDisplayForDay2"})
	public void methodDisplayDuplicateForDay2()
	{
		System.out.println("Hello TestNG duplicate day 2!!");
	}
	
	@BeforeTest
	public void beforeTestDay2()
	{
		System.out.println("I executed first[beforetest used] .. day 2!!");
	}
}
