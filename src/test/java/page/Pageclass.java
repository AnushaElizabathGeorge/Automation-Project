package page;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Pageclass extends Base{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/a/strong")
	WebElement PHPTloginicon;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/ul/li[1]/a/small/strong")
	WebElement PHPTlogin;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement PHPTemail;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement PHPTpassword;
	@FindBy(xpath="//*[@id=\"submitBTN\"]/span")
	WebElement PHPTloginclick;


	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[3]/a")
	WebElement PHPTtoursclick;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[1]/a")
	WebElement PHPThotelsclick;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[2]/a")
	WebElement PHPTflightsclick;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[4]/a")
	WebElement PHPTcarsclick;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[5]/a")
	WebElement PHPTvisaclick;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[6]/a")
	WebElement PHPTblogsclick;

	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/strong")
	WebElement PHPTlanguageclick;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/strong")
	WebElement PHPTcountryclick;

	@FindBy(xpath="//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[4]/a")
	WebElement PHPTlogout;

	public Pageclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void phptLoginIcon()
	{
		PHPTloginicon.click();
	}
	public void phptLogin()
	{
		PHPTlogin.click();
	}
	public void phptemail(String Email)
	{
		PHPTemail.sendKeys(Email);
	}
	public void phptPassword(String Password)
	{
		PHPTpassword.sendKeys(Password);
	}
	public void phptLoginClick()
	{
		 PHPTloginclick.click();
	}
	public void phptTitleVerify()
	{
		String s=driver.getTitle();
		System.out.println("Title="+s);
		if(s.equalsIgnoreCase("PHPTravels"))
		{
			System.out.println("title crt");
		}
		else
		{
			System.out.println("title incrt");
		}
	}
	public void phptTextVerify()
	{
		String si=driver.getPageSource();
		if(si.contains("Hotels"))
		{
			System.out.println("text crt");
		}
		else
		{
			System.out.println("text incrt");
		}
	}
	public void phptScreenshot() throws Exception
	{
		File sr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sr, new File("D://PHPT.jpg"));
	}
	public void phptLinkCount()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("number of links="+li.size());
	}
	public void phptTabsClick()
	{
		PHPThotelsclick.click();
		PHPTtoursclick.click();
		PHPTflightsclick.click();
		PHPTcarsclick.click();
		PHPTvisaclick.click();
		PHPTblogsclick.click();
	}
	public void phptLanguageClick()
	{
		PHPTlanguageclick.click();
	}
	public void phptCountryClick()
	{
		PHPTcountryclick.click();
	}
	public void phptLogout()
	{
		PHPTlogout.click();
	}
}
