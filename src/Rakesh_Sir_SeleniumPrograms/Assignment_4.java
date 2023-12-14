package Rakesh_Sir_SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launching browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//Fetch 1st WebElement's Role, Location, Size and TagName.......... 
	
		WebElement SearchBox = driver.findElement(By.cssSelector("[placeholder='Search Amazon']"));
		String SearchBoxRole = SearchBox.getAriaRole();
		System.out.println(SearchBoxRole);
		
		String SearchTagName = SearchBox.getTagName();
	    System.out.println(SearchTagName);
	    
	    Dimension SearchBoxSize = SearchBox.getSize();
	    System.out.println(SearchBoxSize);
	    
	    Thread.sleep(2000);
	    Point SeachBoxLocation = SearchBox.getLocation();
	    System.out.println(SeachBoxLocation);     
	     
	    Thread.sleep(2000);
	    WebElement cart = driver.findElement(By.id("nav-packard-glow-loc-icon"));
	    String cartRole = cart.getAriaRole();
	    System.out.println(cartRole);
	    
	    Point cartLocation = cart.getLocation();
	    System.out.println(cartLocation);
	    
	    Dimension cartSize = cart.getSize();
	    System.out.println(cartSize);
	    
	    Thread.sleep(2000);
	    String cartTagname = cart.getTagName();
	    System.out.println(cartTagname);
	    
		
	}
}
