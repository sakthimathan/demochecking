package Test_NG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFindElements {

	@SuppressWarnings("deprecation")
	@Test()
	public void findElements() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement w = driver.findElement(By.name("q"));
		w.sendKeys("cricket", Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		List<WebElement> cricket1 = driver
				.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));

		System.out.println("size" + cricket1.size());
		// driver.quit();
	}

	@Test(dependsOnMethods = "findElements")
	public static void letcode() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/edit");
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		WebElement lastElement = labels.get(labels.size() - 1);
		System.out.println(lastElement);
		System.out.println("Last element " + lastElement.getText());
		int size = labels.size();
		if (size == 6) {
			System.out.println("Test case passed");
		} else
			System.out.println("failed");
		for (WebElement label : labels) {
			String text = label.getText();
			System.out.println(text);
		}
		driver.quit();

	}

}