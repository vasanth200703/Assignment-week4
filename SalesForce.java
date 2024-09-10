package week4.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement leadButton = driver.findElement(By.xpath("//span[text()='Leads']"));
		driver.executeScript("arguments[0].click()", leadButton);
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vasanth");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();

	}

}
