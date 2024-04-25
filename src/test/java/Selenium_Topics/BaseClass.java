package Selenium_Topics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public  WebDriver driver;
	
	
	
	public void BrowserLanuch(String url) {
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	public void selectbyValue(WebElement element , String value) {
		Select s= new Select(element);
		s.selectByValue(value);

	}
	public void selectbyText(WebElement element ,String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	
	}
	public void selectbyIndex(WebElement element ,int num) {
		Select s= new Select(element);
		s.selectByIndex(num);
	}
	
	

}
