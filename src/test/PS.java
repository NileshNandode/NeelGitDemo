package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {

	
	public void doThis()
	{
		System.out.println("Do this method of parent class - PS");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Inside before method ! ");
	}
	
}
