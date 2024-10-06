package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({ "URL" })
	@Test
	public void webLoginCarLoan(String urlName)
	{
		System.out.println("Inside webLoginCarLoan day3");
		System.out.println("Parameter url name is : " + urlName);
	}
	
	@Test(dataProvider="getData")
	public void MobileLoginCarLoan(String username, String pwd)
	{
		System.out.println("Inside MobileLoginCarLoan day3");
		System.out.println("Username is : "+username);
		System.out.println("Password is : "+pwd);
	}
	
	@BeforeClass
	public void beforeclassofday3()
	{
		System.out.println("Before class[beforeclass] of day3");
	}
	
	@Test(enabled=true)
	public void LoginAPICarLoan()
	{
		System.out.println("Inside LoginAPICarLoan day3");
	}
	
	@BeforeMethod
	public void Beformethodday3()
	{
		System.out.println("Before method[beforemethod] of day3");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object [][]data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpwd";
		
		data[1][0] = "secondusername";
		data[1][1] = "secondpwd";
		
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpwd";
		
		return data;
	}
}
