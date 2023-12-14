package Rakesh_Sir_SeleniumPrograms;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Assignment_12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launching browser
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.selenium.dev/");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[@class='nav-item dropdown']")).click();
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[7]")).click();
		 
		 Thread.sleep(4000);
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//h2[text()='Bronze Level Sponsors']"));
		try
		{
			act.scrollToElement(element).build().perform();
		}
		catch(Exception e)
		{
		System.out.println("Scrolling performed");
		}
		
		 Thread.sleep(2000);
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File trg = new File("./Screenshots/selenium.png");
		 FileHandler.copy(src, trg);
		}

}

