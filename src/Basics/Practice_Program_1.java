package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice_Program_1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launching browser
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		//driver.switchTo().activeElement();
		
		
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("[data-action-type=\"DISMISS\"]")).click();
		
		//OR
		
		driver.findElement(By.xpath("//div[@class='glow-toaster-footer']/span[1]/span")).click();
		
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement element = driver.findElement(By.xpath("//div[@class='a-carousel-row-inner']//span[text()='Electronics']"));
		 
		 
		  js.executeScript("arguments[0].scrollIntoView(true);",element);
		 
				
			
					Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='a-carousel-row-inner']//span[text()='Electronics']")).click();
		
		driver.findElement(By.xpath("//div[text()='Ring Battery Doorbell Plus with Ring Chime Pro']")).click();
		
		driver.findElement(By.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).click();
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		
		driver.findElement(By.xpath("//input[@value='Proceed to checkout']")).click();
	
		
		
			}

}
