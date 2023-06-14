package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Careertip {
	WebDriver driver; 
	By tip=By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[7]/a");
	By eep=By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/ul/li[1]/a");
	By tipemp=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[2]/a[1]");
	By intrtip=By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/ul/li[1]/a");
	By tipseeker=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[2]/a[1]");
	
	public Careertip(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void tip() throws Exception
	 {
		 driver.findElement(tip).click();
		 driver.findElement(eep).click();
		 driver.findElement(tipemp).click();
		 driver.navigate().back();
		 driver.navigate().back();
		 driver.findElement(intrtip).click();
		 driver.findElement(tipseeker).click();
		 
		 driver.navigate().refresh();
	 }
	
}
