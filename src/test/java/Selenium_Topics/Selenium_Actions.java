package Selenium_Topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_Actions {

	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");

		Actions ac= new Actions(driver);

		WebElement element = driver.findElement(By.linkText("Women's Fashion"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Sarees']"));
		
		//  Actions perform using more than one method 
		ac.moveToElement(element).click(element2).build().perform();

		//  Actions perform using one method 
		ac.moveToElement(driver.findElement(By.linkText("Women's Fashion"))).perform();
		ac.click(driver.findElement(By.xpath("//span[text()='Sarees']"))).perform();

	}

	


}
