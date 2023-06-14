package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pages.Seekerregister;

public class SeekerregisterTest {
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
		Seekerregister rs=new Seekerregister(driver);
	rs.register("jasna", "9048591673", "jasnaishaque@gmail.com", "manjeri", "MSc", "Testing", "2", "4");
	rs.fileUpload("D:/jasna/resume/jasnaCV.pdf");
	
}
}
