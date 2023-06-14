package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Contactus {
	
By highlight=By.xpath("//*[@id=\"navbar\"]/ul/li[4]/ul/li[5]/a");
By contact=By.xpath("//*[@id=\"content\"]/div/div[1]/section[2]/div/div[2]/center/h2/a");
By name=By.xpath("/html/body/div/div[1]/div/div[1]/form/div[1]/input");
By email=By.xpath("/html/body/div/div[1]/div/div[1]/form/div[2]/input");
By mobile=By.xpath("/html/body/div/div[1]/div/div[1]/form/div[3]/input");
By type=By.xpath("/html/body/div/div[1]/div/div[1]/form/div[4]/input[2]");
By message=By.xpath("/html/body/div/div[1]/div/div[1]/form/div[5]/textarea");
By submit=By.xpath("//*[@id=\"submit1\"]");
	WebDriver driver; 
	public Contactus(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void contact() throws Exception
	 {
		 WebElement sr=driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a"));
		 Actions act=new Actions(driver);
		 act.moveToElement(sr).perform();
		 driver.findElement(highlight).click();
		 Thread.sleep(500);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)","");
		 driver.findElement(contact).click();
		 
		  
	 }
	 public void submit(String nam,String mail,String mob,String msg)
	 {
		 driver.findElement(name).sendKeys(nam);
		 driver.findElement(email).sendKeys(mail);
		 driver.findElement(mobile).sendKeys(mob);
		 driver.findElement(type).click();
		 driver.findElement(message).sendKeys(msg);
	 driver.findElement(submit).click();
	 }
	 
}
