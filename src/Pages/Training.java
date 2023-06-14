package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Training {
	By train=By.xpath("//*[@id=\"navbar\"]/ul/li[4]/ul/li[7]/a");
	By elearn=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[2]/a[1]");
	WebDriver driver; 
	public Training(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void jobtrain() throws Exception
	 {
		 WebElement sr=driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a"));
		 Actions act=new Actions(driver);
		 act.moveToElement(sr).perform();
		 driver.findElement(train).click();
		 Thread.sleep(500);
		 driver.findElement(elearn).click();
		 
	 }
}
