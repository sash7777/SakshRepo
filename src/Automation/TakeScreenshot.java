package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class TakeScreenshot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E://Automation//Webdrivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("www.google.com");
		
	    File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("C://Screenshot.png"));
		
		
	}

}
