package Selenium_Topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_WebTable {
	
	WebDriver driver;
	@Test
	public void webTable() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/table");
		method1("Yashwanth");
		method2("Ice cream");
		
		
	}
	
		public void method1( String name) {
		
			WebElement mailId = driver.findElement(By.xpath("//td[text()='"+name+"']/following-sibling::td[2]"));
			
			WebElement attendance = driver.findElement(By.xpath("//td[text()='"+name+"']/following-sibling::td[3]//input"));
			
			
			
			String text = mailId.getText();
			System.out.println("given name --> "+name +"  mail id --> "+text);
			attendance.click();
			System.out.println("Attendance captured");
			
			
		}
		
		public void method2(String name) {
			WebElement food = driver.findElement(By.xpath("//td[text()='"+name+"']/following-sibling::td[5]"));
			String text2 = food.getText();
			System.out.println("Cholesterol -->"+text2);

		}
		
		
		
		
	}


