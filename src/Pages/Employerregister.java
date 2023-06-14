package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Employerregister {
	By login=By.xpath("/html/body/div[1]/header/div/div/ul/li[2]/a");
	By register=By.xpath(" //*[@id=\"content\"]/div/div/div/div[3]/form/button");
	By companyname=By.id("company");
	By mob=By.id("number1");
	By mail=By.id("email");
	By pass=By.id("txtNewPassword");
	By conpass=By.id("txtConfirmPassword");
	By submit=By.id("submit1");
	WebDriver driver;
	 public  Employerregister(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void register01()
	 {
		 driver.findElement(login).click();
		 driver.findElement(register).click();
		 driver.findElement(companyname).sendKeys("luminar");
		 driver.findElement(mob).sendKeys("9048591673");
		 driver.findElement(mail).sendKeys("jasnaishaque@gmail.com");
		 driver.findElement(pass).sendKeys("jasna1212@1212");
		 driver.findElement(conpass).sendKeys("jasna1212@1212");
		 driver.findElement(submit).click();
	 }
}
