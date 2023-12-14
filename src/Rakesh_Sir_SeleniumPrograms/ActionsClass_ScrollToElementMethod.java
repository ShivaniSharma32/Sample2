package Rakesh_Sir_SeleniumPrograms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ActionsClass_ScrollToElementMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launching browser
		WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]")).click();
		Thread.sleep(2000);
		List<WebElement> listofitem = driver.findElements(By.xpath("//div[@class='sub-category-grid']//h2"));
		for(WebElement item:listofitem)
		{
			if (item.getText().equals("Notebooks"))
			{
			item.click();
			break;
			}
		}
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2023 Tricentis Demo Web Shop. All rights reserved.')]"));
		act.scrollToElement(element).build().perform();
		
		 TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshots/notepad.png");
		FileHandler.copy(src, trg);
		
		driver.close();
	}
	

	}


