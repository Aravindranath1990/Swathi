package webdri;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			driver.findElement(By.xpath("//span[@role='button']")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		driver.findElement(By.xpath("//span[text()='Fashion']")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Fabrics')]")).click();
		WebDriverWait waitt = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//div[text()='749'][1]/parent::div[1]/parent::a/preceding-sibling::div[text()='GORASH CREATION'])[1]/following-sibling::a[contains(text(),'Shirt Fabric Printed')]")).click();
		
		
	}

}
