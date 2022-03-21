package Automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Automation//Webdrivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		//get url which we want to check
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		
		conn.connect();
		int respcode=conn.getResponseCode();
		System.out.println(respcode);
		
	}

}
