package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Employerregister;


public class EmployerregisterTest {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.jobsnear.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception 
	{
		Employerregister ers=new Employerregister(driver);
		ers.register01();
}
}
