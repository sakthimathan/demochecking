package Selenium_Topics;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Robot {

	@Test
	private void taks1() throws AWTException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		WebElement element1 = driver.findElement(By.xpath("//button[@name='login']"));

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		File image = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Codes\\ScreenShot\\screen.png");
		FileUtils.copyFile(screenshotAs, image);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','java')", element1);
		js.executeScript("arguments[0].click()", element1);

	}

	@Test
	void method() {
		String[] names = { "sathish", "vignesh", "balajii", "udhaya", "sathish", "udhaya","sathish" };
		Arrays.sort(names);
		String[] result = new String[names.length];
		int count = 0;
		for (int i = 0; i < names.length - 1; i++) {
			if (names[i] != names[i + 1]) {
				result[count] = names[i];
				count++;
			}
		}
		result[count] = names[names.length - 1];

		for (int i = 0; i <= count; i++) {
			System.out.println(result[i]);
		}

	}

	@Test
	void Method3() {
		String[] names = { "sathish", "sakthi", "sakthi", "udhaya", "balaji", "vicky", "udhaya" };
		Arrays.sort(names);
		int count = 0;
		String[] results = new String[names.length];
		for (int i = 0; i < names.length - 1; i++) {
			if (names[i] != names[i + 1]) {
				results[count] = names[i];
				count++;
			}
		}
		results[count] = names[names.length - 1];
		for (int i = 0; i <= count; i++) {
			System.out.println(results[i]);
		}

	}
	
	@Test
	void Method4(){
	      String given= "sakthibalan&mathansakthi";
	      Map<Character,Integer> map = new LinkedHashMap<>();
	      for (int i=0;i<given.length();i++ ){
	      char c=given.charAt(i);
	      if (map.containsKey(c)){
	        Integer inte = map.get(c);
	        map.put(c , inte +1);
	      } else{
	        map.put(c,1);
	      }
	      }
	      System.out.println(map);
	    }
	@Test
	private void reversethegivenString() {//1
		System.out.println("reversethegivenString");
		String s = "java"; // avaj
		String result = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
         result = result+c ;	
		}
		System.out.println(result);
		
		StringBuffer buffer = new StringBuffer(s);
		StringBuffer reverse = buffer.reverse();
		System.out.println("reverse  "+System.identityHashCode(reverse));
		System.out.println(reverse);
		StringBuffer append = reverse.append("java");
		System.out.println("append  " +System.identityHashCode(append));
		System.out.println(append.toString());
		System.out.println(reverse.toString());
		
		
	}
	
	@Test
	private void reversethegivenStringByeachWord() {//2
		System.out.println("reverse a given string " + "java programm");
		String s = "java programm"; //avaj mmargorp
		String result = " ";
		String[] split = s.split(" ");
		for (String split1 : split) {
			for (int i = split1.length() - 1; i >= 0; i--) {
				char c = split1.charAt(i);
				result = result + c;
				}
			
			result = result + " ";
			}
		System.out.println(result);}
	
	@Test
	private synchronized void swappingTheGivenString() { //2.1
		System.out.println("reverse a given string not words " + "java programm");
		String s = "Hello World";//World Hello 
		String result = " ";
		String[] split = s.split(" ");
			for (int i = split.length - 1; i >= 0; i--) {
				result = result + split[i]+ " ";}
		System.out.println(result);}
	
	@Test
	private void reverseEachWord() {//3
		String s="my name is ganesh Kumar";
		String s1 ="";
		String[] split = s.split(" ");
		for (String string : split) {
			for (int i = string.length()-1; i >=0 ; i--) {
				char charAt = string.charAt(i);
				s1=s1+charAt;	}
			s1=s1+" ";
			}
		System.out.println(s1);}

}
