package Test;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Search;

public class SearchTest {
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
		Search s=new Search(driver);
	s.search("automation testing", "kochi");
	s.apply();
	s.fileUpload("D:/jasna/resume/jasnaCV.pdf");
}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}