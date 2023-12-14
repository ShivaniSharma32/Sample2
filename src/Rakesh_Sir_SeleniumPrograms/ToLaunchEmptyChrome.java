package Rakesh_Sir_SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchEmptyChrome {

	public static void main(String[] args)
	{
		
		//Configure the browser-(Establishing the connection b/w selenium folder to own browser server)
		
		//String Key = "webdriver.chrome.driver";
		//String Path = "./drivers/chromedriver.exe";
		//System.setProperty(key,path);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launching browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcdonalds.com/us/en-us.html");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	

	}

}
