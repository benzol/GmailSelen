package gmailsend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Gmail {

	private static WebDriver driver = null;
	
	
public static void main (String[] args) throws InterruptedException {

	 driver = new FirefoxDriver();
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.get("http://www.gmail.com");
	 
//	 driver.findElement(By.id("//*[@id='gmail-sign-in']")).click();
	 
	 if (driver.findElement(By.id("PersistentCookie")).isSelected() )
	 {
	      driver.findElement(By.id("PersistentCookie")).click();
	 }
	 
	 driver.findElement(By.id("Email")).sendKeys("benzol013");
	 
	 driver.findElement(By.id("Passwd")).sendKeys("PASS");
	 
	 driver.findElement(By.id("signIn")).click();
	 
	 driver.findElement(By.id("gbqfq")).sendKeys(" automation.tc@gmail.com");
	 
	 driver.findElement(By.id("gbqfb")).click();
	 
	 Thread.sleep(3000);
	 
	 if (driver.findElement(By.xpath("//a[contains(@href, 'https://support.google.com/mail/answer/6593')]")).isDisplayed()) 
	 {
	 	driver.findElement(By.xpath("//div[contains(@class,'T-I J-J5-Ji T-I-KE L3')]")).click();
	 	driver.findElement(By.name("to")).sendKeys("automation.tc@gmail.com");
	 driver.findElement(By.name("subjectbox")).sendKeys("ololo");
	 driver.findElement(By.xpath("//div[contains(@class,'Am Al')]")).sendKeys("testmailtext");
	  driver.findElement(By.xpath("//div[contains(@class,'T-I J-J5-Ji aoO T-I-atl L3')]")).click();
	 }

	 else System.out.println("Messageisfound");
	 
	 
}
}
