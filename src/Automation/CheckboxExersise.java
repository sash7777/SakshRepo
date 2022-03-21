package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe>>chromedrier browser
				System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Webdrivers\\chromedriver_win32\\chromedriver.exe/");
				
				//chromedriver.exe>>ChromeDriver
				WebDriver driver=new ChromeDriver();
				
				//Navigate to url
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				//Check the first checkbox
				
				driver.findElement(By.id("checkBoxOption1")).click();
				//verify
				System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
				
				System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
				
			
				

	}

}
