package Basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bhoomika_Mam_Mock1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			//launching browser
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("admin");
			driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("manager");
			driver.findElement(By.cssSelector("[id=\"keepLoggedInLabel\"]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Login')] ")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
			Thread.sleep(2000);
		 WebElement link_text = driver.findElement(By.linkText("Read Service Agreement"));
		 link_text.click();
		 
		 Thread.sleep(2000);
	     Set<String> AllIDs = driver.getWindowHandles();
	     for(String ID:AllIDs)
	     {
	    	 driver.switchTo().window(ID);
	    	 System.out.println(driver.getTitle());
	    	  if(driver.getTitle().equals("actiTIME Online Terms of Service"))
	    	  {
	    
	    		  List<WebElement> Headings = driver.findElements(By.xpath("//div[@class='entry-content']/h2"));
	    		  for(WebElement Text:Headings)
	    			{
	    				System.out.println(Text.getText());
	    			}
	    			driver.close();
	    	  }
	    	 
	     }
		
			
			
			}

}
