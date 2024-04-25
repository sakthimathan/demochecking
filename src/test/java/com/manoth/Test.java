package com.manoth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.snapdeal.com/products/car-toys?sort=plrty");
		WebElement element = driver.findElement(By.xpath("//*[starts-with(text(),'Fast')]"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//span[text()='add to cart']"));
		element2.click();
		
		
		
	}

}
