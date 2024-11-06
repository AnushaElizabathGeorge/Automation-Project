package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	public static WebDriver driver;
	@BeforeTest
	public void bftest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
	}
}
