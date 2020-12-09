package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class P1C1 {

	public static void main(String[] args) {

		/*
		======== RELATIVE LOCATORS ========
		 
		. above()     : finds an element or elements located above a fixed element.
		. below()     : finds an element or elements located below a fixed element.
		. near()      : finds an element or elements located near a fixed element.
		. toLeftOf()  : finds an element or elements located to the left of a fixed element.
		. toRightOf() : finds an element or elements located to the right of a fixed element.
		
		. Basic Syntax :
		  driver.findElement(withTagName("TagName").above(Locator))	
		 */
		
		
		// =========================================================================================
		
		
		// Exercise
		
		
		System.setProperty("webdriver.chrome.driver", "/home/shraddha/Desktop/Setups/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		String baseUrl = "https://www.rahulshettyacademy.com/angularpractice/";
		driver.get(baseUrl);
		
		// -----------------------------------------------------------------------------------------
		
		// above Locator
		WebElement nameField = driver.findElement(By.cssSelector("input[name='name']"));
		String nameLabel = driver.findElement(withTagName("label").above(nameField)).getText();
		System.out.println(nameLabel);
		
		// below Locator
		WebElement dobLabel = driver.findElement(By.cssSelector("label[for$='dateofBirth']"));
		driver.findElement(withTagName("input").below(dobLabel)).sendKeys("01/10/1997");
		
		// toLeftOf Locator
		WebElement checkboxLabel = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		driver.findElement(withTagName("input").toLeftOf(checkboxLabel)).click();
		
		// toRightOf Locator
		WebElement studentRadio = driver.findElement(By.id("inlineRadio1"));
		String studentRadioLabel = driver.findElement(withTagName("label").toRightOf(studentRadio)).getText();
		System.out.println(studentRadioLabel);
		
		driver.quit();
		
	}

}
