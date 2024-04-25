package Selenium_Topics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Selenium_Casting {

	@Test
	public void Casting() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// pass values in the text box using Java Script
		WebElement txtEmail = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','azarara321@gmail.com')", txtEmail);
		// retrieve the user entered text in the webelement
		Object object = js.executeScript("return arguments[0].getAttribute('value')", txtEmail);
		String s1 = (String) object;
		System.out.println(s1);
		WebElement txtPass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','12345')", txtPass);
		// button click using Java Script
		WebElement btnLogin = driver.findElement(By.name("login"));
		// js.executeScript("arguments[0].click()", btnLogin);
		js.executeScript("arguments[0].click()", btnLogin);
		// js.executeScript("alert('Welcome to FaceBook--;;');");

		TakesScreenshot ts = (TakesScreenshot) driver;

		// Normal Method To take Screenshot

		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Codes\\ScreenShot\\facebook.png");
	
		FileUtils.copyFile(source, dest);

		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);

		// Generate file name based on current time
		String fileName = generateFileName();

		// Define the destination path to save the screenshot
		String destination = "./ScreenShot/" + fileName + ".png";

		try {

			// Method 2 using FilesUtils
			// Copy the screenshot to the destination path(FilesUtils)
			// FileUtils.copyFile(screenshotFile,new File(destination));

			// Method 2 using Files
			// Copy the screenshot to the destination path(Files)
			java.nio.file.Files.copy(screenshotFile.toPath(), new File(destination).toPath());

			System.out.println("Screenshot saved: " + destination);

		} catch (IOException e) {
			System.out.println("Failed to save screenshot: " + e.getMessage());
		}
	}

	public static String generateFileName() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
		return now.format(formatter);
	}

}
