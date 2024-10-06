package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS{
	
	@Test
	public void testRun()
	{
		doThis();
	}
	
	@Test
	public void testRun2()
	{
		System.out.println("This is test run2 method of child class - PS1");
		PS2 obj = new PS2(3);
		System.out.println("Increment is " + obj.increment());
		System.out.println("Decrement is " + obj.decrement());
		
		System.out.println("Muliplication is " + obj.multiplyByTwo());
		System.out.println("Muliplication is " + obj.multiplyByThree());
		
		
		
	}
}
