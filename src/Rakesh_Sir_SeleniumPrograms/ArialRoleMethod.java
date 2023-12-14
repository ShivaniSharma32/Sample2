package Rakesh_Sir_SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArialRoleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().fullscreen();
        String Username = driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).getAriaRole();
         System.out.println(Username);
        
        String password = driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).getAriaRole();
        System.out.println(password);
        
        String checkbox = driver.findElement(By.cssSelector("[for=\"keepLoggedInCheckBox\"]")).getAriaRole();
        System.out.println(checkbox);
        String login = driver.findElement(By.xpath("//div[contains(text(),'Login')]")).getAriaRole();
        System.out.println(login);
	}
	

}