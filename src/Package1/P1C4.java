package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1C4 {

	public static void main(String[] args) {
		
		// ======== GETTING DIMENSIONS OF WEB ELEMENT ========
		
		System.setProperty("webdriver.chrome.driver", "/home/shraddha/Desktop/Setups/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		String baseUrl = "https://www.rahulshettyacademy.com/angularpractice/";
		driver.get(baseUrl);
		
		// -----------------------------------------------------------------------------------------
		
		WebElement jumbotron = driver.findElement(By.cssSelector(".container .jumbotron"));
		
		int height = jumbotron.getRect().getHeight();
		int width = jumbotron.getRect().getWidth();
		Dimension size = jumbotron.getSize();
		
		System.out.println(height);
		System.out.println(width);
		System.out.println(size);	

	}

}
