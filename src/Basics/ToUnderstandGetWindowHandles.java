package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetWindowHandles {

	public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://nxtgenaiacademy.com/multiplewindows/");
			driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();
			Set<String> allWindowID= driver.getWindowHandles();
			System.out.println(allWindowID.size());
			for(String windowID: allWindowID)
			{
				System.out.println(windowID);
			}
			
		}
}


	

