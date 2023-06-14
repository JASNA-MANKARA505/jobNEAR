package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class Seekerregister {
	By login=By.xpath("/html/body/div/header/div/div/ul/li[1]/a");
	By name=By.xpath("//*[@id=\"name\"]");
	By email=By.id("email");
	By mob=By.id("number1");
	By female=By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/form/div/div[1]/div[2]/h4/input[2]");
	By year=By.name("experience");
	By month=By.name("experience1");
	By upload=By.xpath("//*[@id=\"postresume\"]/div/div[4]/div[3]/input");
	By submit=By.xpath("//*[@id=\"submit1\"]");
	By location=By.id("country");
	By quali=By.xpath("//*[@id=\"qualify\"]");
	By skill=By.xpath("//*[@id=\"skills\"]");
	By register=By.xpath("//*[@id=\"content\"]/div/div/div/div[3]/form/button");
	WebDriver driver;
	 public  Seekerregister(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void register(String nam,String mbno,String mail,String loc,String qual,String skil,String yr,String mth) {
	 driver.findElement(login).click();
	 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)","");
	 
 driver.findElement(register).click();
		 driver.findElement(name).sendKeys(nam);
		 driver.findElement(female).click();
		 driver.findElement(mob).sendKeys(mbno);
		 driver.findElement(email).sendKeys(mail);
		 driver.findElement(location).sendKeys(loc);
		 driver.findElement(quali).sendKeys(qual);
		 driver.findElement(skill).sendKeys(skil);
		 
		 driver.findElement(year).sendKeys(yr);
		 driver.findElement(month).sendKeys(mth);
		
		
		 
	 }
	public void fileUpload(String P) throws Exception
	 {
	
		driver.findElement(upload).sendKeys(P);
		Thread.sleep(500);
		driver.findElement(submit).click();
         
		
	 }
	 
}
