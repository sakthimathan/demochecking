package Selenium_Topics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Foreach {
	@Test
	public void Redbus() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement From = driver.findElement(By.id("src"));
		From.sendKeys("chennai");
		List<WebElement> city = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		List<WebElement> until = wait.until(ExpectedConditions.visibilityOfAllElements(city));
		for (WebElement webElement : until) {
			String text = webElement.getText();
			System.out.println(text);
			if (text.contains("Madhavaram")) {
				System.out.println("Inside if condition  "+text);
				webElement.click();

			}

		}



	}

}
