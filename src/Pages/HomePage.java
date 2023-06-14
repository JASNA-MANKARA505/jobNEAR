package Pages;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class HomePage {
By logo=By.xpath("/html/body/div[1]/header/nav/div/div[1]/a");
WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
}

public void validation()
{
	boolean b=driver.findElement(logo).isDisplayed();
	System.out.println(b);
	String title=driver.getTitle();
	System.out.println("Web site title is"+title);
	String cnt=driver.getPageSource();
	if(cnt.equals("Work from Home"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
}
public void link()

{
List<WebElement> li=driver.findElements(By.tagName("a"));
System.out.println("count="+li.size());
for(WebElement s:li) {
	String link=s.getAttribute("href");
	String text=s.getText();
	System.out.println(link+"-----------"+text);
	
}
}
public void screenshort() throws Exception
{
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("D://jasna//home.png") );
}
public void jobsearch()
{
	driver.navigate().to("https://www.jobsnear.in/search-jobs");
	
}

public void response()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	for(WebElement s:li)
	{
		String link=s.getAttribute("href");
		verify(link);
	}
	}
public void verify(String link)
{
	try {
		URL ob=new URL(link);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid----"+link);
		}
		else if(con.getResponseCode()==404){
			System.out.println("broken----"+link);
		}
	}
catch(Exception e)
	{
	System.out.println(e.getMessage());
	}


}

	
}




