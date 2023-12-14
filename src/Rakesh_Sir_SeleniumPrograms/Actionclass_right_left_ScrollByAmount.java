package Rakesh_Sir_SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass_right_left_ScrollByAmount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
			
			Thread.sleep(4000);
		
	   Actions act = new Actions(driver);
	   
	   act.scrollByAmount(100,300).build().perform();
	   Thread.sleep(4000);
	   act.scrollByAmount(-100, -300).build().perform();
			   	
	driver.close();
	}

}
