package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.Base;
import page.Pageclass;
import utility.Excelutility;


public class Testclass extends Base {
	@Test(priority=1)
	public void test() throws Exception
	{
		 Pageclass ph=new  Pageclass(driver);
		String xl1="C:\\Users\\admin\\Downloads\\Automation project.xlsx";
		String Sheet1="Sheet1";
		int RowCount=Excelutility.getRowCount(xl1,Sheet1);
		for(int i=1;i<=RowCount;i++)
		{
			String Email=Excelutility.getCellValue(xl1,Sheet1,i,0);
			String Password=Excelutility.getCellValue(xl1,Sheet1,i,1);
			ph.phptLoginIcon();
			ph.phptLogin();
			ph.phptemail(Email);
			ph.phptPassword(Password);
			ph.phptLoginClick();
			
			driver.navigate().refresh();
			
			Thread.sleep(3000);
		}
		
		
	}
@Test(priority=2)
public void test2() throws Exception
{	
	 Pageclass ph=new  Pageclass(driver);
	 ph.phptTitleVerify();
	 ph.phptTextVerify();
	 ph.phptScreenshot();
	 ph.phptLinkCount();
	 String actual=driver.getCurrentUrl();
	 String expected="https://www.phptravels.net/dashboard";
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("login valid");
		}
		else
		{
			System.out.println("login not valid");
		}
}
@Test(priority=3)
public void test3() throws Exception
{
	 Pageclass ph=new  Pageclass(driver);
	ph.phptTabsClick();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1500)");
	Thread.sleep(2000);
	ph.phptLanguageClick();
	ph.phptCountryClick();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	Thread.sleep(3000);
	ph.phptLogout();
}	
}
