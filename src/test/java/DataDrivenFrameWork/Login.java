package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login extends ReadExcelSheet_Prac {
	WebDriver driver;

	@Test(dataProvider = "login", dataProviderClass = DataDriver.class)

	public void loguser(String[] data) throws IOException {
		/*
		 * switch (browser) { case "chrome": driver = new ChromeDriver(); break; case
		 * "firefox": driver = new FirefoxDriver(); break; default:
		 * System.err.println("browser is not defined"); break; } driver = new
		 * ChromeDriver();
		 */
		driver = new FirefoxDriver();
		driver.get("https://letcode.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(data);

		driver.findElement(By.name("password")).sendKeys(data);

		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		driver.quit();
	}

}
