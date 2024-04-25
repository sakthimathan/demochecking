package Selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium_Select extends BaseClass {



	

	

	@Test
	public void DropDown() {
		BrowserLanuch("https://letcode.in/dropdowns");
		//selectByvalue
		WebElement frutes = driver.findElement(By.id("fruits"));
		selectbyValue(frutes, "1");

		//selectByVisible text
		WebElement superhero = driver.findElement(By.id("superheros"));
		selectbyText(superhero,"Iron Man");
		//selectByIndex
		WebElement language = driver.findElement(By.id("lang"));
		selectbyIndex(language, 3);

	}

}
