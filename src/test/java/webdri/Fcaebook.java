package webdri;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fcaebook {
	public static void main(String[] args) throws IOException {
		
	WebDriver driver;
	
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("incognito");
	options.addArguments("start-maximized");
	driver =new ChromeDriver(options);
	
	
	driver.get("https://www.facebook.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	driver.findElement(By.id("email")).sendKeys("Aravi1990");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Amma123$");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(2));
	
	driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']")).click();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("/restAssure/src/aravi");
	FileUtils.copyFile(screenshotAs, dest);
	driver.findElement(By.xpath("(//div[@role='listitem'])[5]")).click();
	driver.quit();
	
		
		
		
		
		
		
	}

}
