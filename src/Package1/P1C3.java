package Package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class P1C3 {

	public static void main(String[] args) throws IOException {
		
		// ======== TAKING PARTIAL SCREENSHOTS ========
		
		System.setProperty("webdriver.chrome.driver", "/home/shraddha/Desktop/Setups/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		String baseUrl = "https://www.rahulshettyacademy.com/angularpractice/";
		driver.get(baseUrl);
		
		// -----------------------------------------------------------------------------------------
		
		WebElement jumbotron = driver.findElement(By.cssSelector(".container .jumbotron"));
		
		File srcFile = jumbotron.getScreenshotAs(OutputType.FILE);
		String root = System.getProperty("user.dir");
		File destFile = new File(root+"/screenshot.png");
		FileUtils.copyFile(srcFile, destFile);
		
		driver.quit();
		
	}

}
