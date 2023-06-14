package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Jobseekerlogin {

	By login=By.xpath("/html/body/div/header/div/div/ul/li[1]/a");
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/form[1]/button");
By reset=By.xpath("//*[@id=\"hide\"]/button");
	WebDriver driver; 
	public Jobseekerlogin(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void seekerlogin(String name,String pass) throws Exception
	 {
		 String Parent=driver.getWindowHandle();
		 System.out.println("parent window is="+driver.getTitle());
			driver.findElement(login).click();
			Set<String> child=driver.getWindowHandles();
			for(String handle:child) {
				if(handle.equalsIgnoreCase(Parent))
				{
					driver.switchTo().window(handle);
					driver.findElement(username).sendKeys(name);
					driver.findElement(password).sendKeys(pass);
					driver.findElement(submit).click();
				}
	 }
				
				
	 }
}
		 
		
		 		
	 

