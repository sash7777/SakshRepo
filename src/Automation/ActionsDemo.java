package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Webdrivers\\chromedriver_win32\\chromedriver.exe/");
		
		//chromedriver.exe>>ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.amazon.com");
		
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		
		//move to searchbox
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("Walnut");
		
	}

}
