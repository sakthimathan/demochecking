package job;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Interview {
	
	
	@Test
	private void fromtest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://jobtest.geazy.com/multisteps.html");
		
		driver.findElement(By.name("firstname")).sendKeys("Siva");
		driver.findElement(By.name("lastname")).sendKeys("Shankar");
		driver.findElement(By.name("age")).sendKeys("45");
		driver.findElement(By.name("email")).sendKeys("Shankarsiva12@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("7638447156");
		driver.findElement(By.name("password")).sendKeys("siva2123");
		driver.findElement(By.name("repassword")).sendKeys("siva02123");
		WebElement gender = driver.findElement(By.name("Gender"));
		Select select= new Select(gender);
		select.selectByVisibleText("Female");
		driver.findElement(By.name("fathername")).sendKeys("Ashok");
		driver.findElement(By.name("mothername")).sendKeys("Anitha");
		driver.findElement(By.name("fage")).sendKeys("59");
		WebElement siblings = driver.findElement(By.name("sibling"));
		Select select1= new Select(siblings);
		select1.selectByVisibleText("4");
		driver.findElement(By.name("Child")).sendKeys("8");
		driver.findElement(By.name("spouse")).sendKeys("Nandhini");
		driver.findElement(By.name("spouseg")).sendKeys("female");
		driver.findElement(By.name("salary")).sendKeys("90000");
		driver.findElement(By.xpath("//input[@name='spouseword'][1]")).click();
		driver.findElement(By.xpath("//input[@name='house'][2]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
	}
	
	
	
	

}
