package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Jobseekerlogin;


public class HomePageTest {

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
	HomePage h=new HomePage(driver);
	h.validation();
	h.link();
	h.screenshort();
	h.jobsearch();
	h.response();
}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}

