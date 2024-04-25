package Selenium_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Css extends BaseClass {
	@Test
	public void CssMethod() {
		
		BrowserLanuch("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
		
		//getAttribut - cann't get value attribute separately 
		System.out.println(" CSS --> = "+element.getAttribute("name"));
		
		
		//getCssValue -- using this we got that values separately 
		System.out.println("THE COLOUR OF BTN"+element.getCssValue("background-color"));
		System.out.println("THE font-size BTN"+element.getCssValue("font-size"));
		System.out.println("THE line-height BTN"+element.getCssValue("line-height"));
		System.out.println("THE width BTN"+element.getCssValue("width"));
		
		
		String cssValue = element.getCssValue("background-color");
	    String ColorCode = Color.fromString(cssValue).asHex();
	    System.out.println("THE Colour Code --> ="+ColorCode);
	    String colorCode = "#0866ff";
	    //assert checking
	    Assert.assertEquals(ColorCode, colorCode);
	    
	   
		
		
	}

}
