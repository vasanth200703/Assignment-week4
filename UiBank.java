package week4.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/login");
		String title = driver.getTitle();
		if (title.contains("UiBank")) {
			System.out.println("Title is verified");

		} else {
			System.out.println("Title is not verified");

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vasanth200703@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vasanth2003");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vasanth");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("vas");
		driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Male");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Mr");
		driver.findElement(By.xpath("//select[@id='employmentStatus")).sendKeys("Unemployed");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("20/07/2002");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("2");
		driver.findElement(By.xpath("//input[//input[@id='username']")).sendKeys("vasanth");

	}

}
