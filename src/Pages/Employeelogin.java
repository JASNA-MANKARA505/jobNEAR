package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Employeelogin {

	WebDriver driver;
	By login=By.xpath("/html/body/div[1]/header/div/div/ul/li[2]/a");
	By user=By.id("username");
	By passwd=By.id("password");
	By submit=By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/form[1]/button");
	By logout=By.xpath("/html/body/div/header/div/div/ul/li[2]/a");
	By forgot=By.xpath("//*[@id=\"show\"]/p/a");
	By reset=By.name("reset-email");
	By repasswd=By.xpath("//*[@id=\"hide\"]/button");
	 public  Employeelogin(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void login(String username,String password)
	 {
		 driver.findElement(login).click();
		 driver.findElement(user).sendKeys(username);
		 driver.findElement(passwd).sendKeys(password);
		 driver.findElement(submit).click();
	 }
	 public void logout() {
		 driver.findElement(logout).click();
	 }
	public void forgot()
	{
		driver.findElement(forgot).click();
		driver.findElement(reset).sendKeys("jasnaishaque@gmail.com");
		driver.findElement(repasswd).click();
	}

}
