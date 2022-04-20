package Selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Ended");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjunath.kallole\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//	WebDriverWait wait = 
				Actions action = new Actions(driver);
				
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
