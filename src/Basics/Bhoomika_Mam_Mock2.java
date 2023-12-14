package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bhoomika_Mam_Mock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			//launching browser
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.vtiger.com/");
			
			driver.findElement(By.xpath(" //a[contains(text(),'Resources')]")).click();
			driver.findElement(By.xpath(" //a[contains(text(),'Contact Us')]")).click();
			String Number = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]")).getText();
			System.out.println(Number);
	}

}
