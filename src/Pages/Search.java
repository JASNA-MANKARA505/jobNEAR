package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Search {

		WebDriver driver;
		By keyword=By.id("jobtitles");
		By location=By.id("country");
		By search=By.xpath("/html/body/div[1]/section/div[2]/div/div/div/div/form/div[3]/input[1]");
		By detail=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[2]/ul/li[1]/div[1]/div/a");
		By apply=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[2]/div/div/center[1]/a[2]");
		By name=By.xpath("//*[@id=\"name\"]");
		By email=By.id("email");
		By mob=By.id("number1");
		By female=By.xpath("//*[@value=\"F\"]");
		By year=By.xpath("//*[@placeholder=\"Years\"]");
		By month=By.xpath("//*[@placeholder=\"Months\"]");
		By upload=By.id("resume");
		By submit=By.xpath("//*[@id=\"submit\"]");
		
		 public  Search(WebDriver driver)
		 {
			 this.driver=driver;
		 }
		 public void search(String key,String loc)
		 {
			 driver.findElement(keyword).sendKeys(key);
			 driver.findElement(location).sendKeys(loc);
			 driver.findElement(search).click();
		 }
		 public void apply() throws Exception
		 {
			 driver.findElement(detail).click();
			
			 
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,500)","");
			 
			 driver.findElement(apply).click();
			 
			 driver.findElement(name).sendKeys("jasna");
			 driver.findElement(email).sendKeys("jasnaishaque@gmail.com");
			 driver.findElement(mob).sendKeys("9946365364");
			 driver.findElement(female).click();
			 driver.findElement(year).sendKeys("2");
			 driver.findElement(month).sendKeys("3");
		
		 }
		public void fileUpload(String P) throws Exception
		 {
		
			driver.findElement(upload).sendKeys(P);
			Thread.sleep(500);
			driver.findElement(submit).click();
	         
			
		 }
		 
		


}
