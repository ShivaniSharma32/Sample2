package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetWindowHandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
	}

}
