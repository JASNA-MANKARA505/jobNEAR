package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Employeelogin;


public class EmployeeloginTest {
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
		Employeelogin ln=new Employeelogin(driver);
		ln.login("jasnaishaque@gmail.com", "jasna1212@1212");
		ln.logout();
		ln.forgot();
}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
