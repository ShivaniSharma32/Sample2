package Rakesh_Sir_SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_ScrollByAmountMethod {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launching browser
		WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
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
   
   act.scrollByAmount(0, 700).build().perform();
   Thread.sleep(2000);
  act.scrollByAmount(0, -500).build().perform();
   Thread.sleep(2000);
   //act.scrollByAmount(100,300).build().perform();
   //Thread.sleep(2000);
   //act.scrollByAmount(-100, -300).build().perform();
		   	
driver.close();
}
	}


