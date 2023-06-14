package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchJob {
	By job=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a");
	By location=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a");
	By skill=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/ul/li[2]/a");
	By company=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/ul/li[3]/a");
	By category=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/ul/li[4]/a");
    By fresher=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/ul/li[5]/a");
     By parttime=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/ul/li[6]/a");
     By govjob=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/ul/li[7]/a");
     By walk=By.xpath("//*[@id=\"navbar\"]/ul/li[3]/ul/li[8]/a");
     WebDriver drive;
public SearchJob(WebDriver driver)
{
	this.drive=driver;
}
public void jobsearch()
{
	
}
}