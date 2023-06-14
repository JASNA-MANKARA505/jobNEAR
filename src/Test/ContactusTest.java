package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Contactus;


public class ContactusTest {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.jobsnear.in");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception 
	{
	Contactus cs=new Contactus(driver);
	cs.contact();
	cs.submit("jasna", "jasnaishaque@gmail.com", "9048591673", "I wants to highlight my resume");
		
	
}
}
