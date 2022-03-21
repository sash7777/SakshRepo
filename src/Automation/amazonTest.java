package Automation;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class amazonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe>>chromedrier browser
				System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Webdrivers\\chromedriver_win32\\chromedriver.exe/");
				
				//chromedriver.exe>>ChromeDriver
				WebDriver driver=new ChromeDriver();
				
				//Navigate to url
				driver.get("https://www.amazon.in/");
				
				WebDriverWait wait = new WebDriverWait(driver, 30);
				WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys("Walnut");
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-submit-button"))).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("brandsRefinements")));
				WebElement Brandsection=driver.findElement(By.id("brandsRefinements"));
				System.out.println("The number of brands are"+Brandsection.findElements(By.className("a-spacing-micro")).size());	
				
			WebElement Brand=	driver.findElement(By.xpath("//li[@id='p_89/Ancy']//i[@class='a-icon a-icon-checkbox']"));
			System.out.println(Brand.getText());
				Brand.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")));
			String result=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();
            System.out.println(result);	
	}
	
	
				
				
				
				
				
				
	}
	

