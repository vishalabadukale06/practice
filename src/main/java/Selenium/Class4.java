package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Class4 {
	
	WebDriver driver ;

	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test(priority=1)
	public void loginPage() {
		
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	}
	
	@Test(priority=2)
	
	public void homePageUrl() {
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
	}
	
	@Test(priority=3)
	public void validateHomePageTitle() {

		String title = driver.getTitle();
		
		System.out.println(title);
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
	
}