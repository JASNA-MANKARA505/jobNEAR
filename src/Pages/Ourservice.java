package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Ourservice {
	
	By recruitment=By.xpath("//*[@id=\"navbar\"]/ul/li[4]/ul/li[1]/a");
	By buy=By.xpath("//*[@id=\"content\"]/div/div[1]/div/section[2]/div[4]/div/ul/li[6]/a");
	WebDriver driver; 
	public Ourservice(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void service() throws Exception
	 {
		 WebElement sr=driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a"));
		 Actions act=new Actions(driver);
		 act.moveToElement(sr).perform();
		 driver.findElement(recruitment).click();
		 Thread.sleep(500);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)","");
		  
		 
		  Thread.sleep(500);
		 driver.navigate().back();
		
	 }

}
