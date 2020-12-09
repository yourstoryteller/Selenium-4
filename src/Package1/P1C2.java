package Package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1C2 {

	public static void main(String[] args) {

		// ======== INVOKING MULTIPLE WINDOWS / TABS ========
		
		System.setProperty("webdriver.chrome.driver", "/home/shraddha/Desktop/Setups/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		String baseUrl = "https://www.rahulshettyacademy.com/angularpractice/";
		driver.get(baseUrl);
		
		// -----------------------------------------------------------------------------------------
		
		// Open New Blank Tab
		driver.switchTo().newWindow(WindowType.TAB);
		// driver.switchTo().newWindow(WindowType.WINDOW); // Open New Blank Window
		
		// Get All Window Handles
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String parentTab = it.next();
		String childTab = it.next();
		
		// Switch To Child Tab / Window
		driver.switchTo().window(childTab);
		// driver.manage().window().maximize(); // Maximize Child Window
		driver.get("https://www.rahulshettyacademy.com/#/index");
		
		// Grab 1st Featured Course Name
		String courseName = driver.findElements(By.cssSelector("a[href*='core-java-for-automation-testers']")).get(1).getText();
		driver.close(); // Close Current Tab
		
		// Switch To Parent Tab / Window
		driver.switchTo().window(parentTab);
		WebElement nameField = driver.findElement(By.cssSelector("input[name='name']"));
		nameField.sendKeys(courseName);
		
		driver.quit();
		
	}

}
