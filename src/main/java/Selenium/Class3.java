package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://prafpawar11.github.io/mainFrame.html");
		
//		driver.switchTo().frame(0);
//		
//        WebElement wb1 = driver.findElement(By.id("Selenium"));
//		
//		wb1.click();
//		
//		
//		WebElement wb = driver.findElement(By.id("name"));
//		
//		wb.sendKeys("Vishal");
//		
//		driver.switchTo().frame(1);
		

		//switch to checkbox child frame using index
		//driver.switchTo().frame(0);
		
		//switch to checkbox child frame using frame id
		driver.switchTo().frame("mainframe");
		
		//switch to checkbox child frame using frame WebElement
		WebElement abc = driver.findElement(By.xpath("//iframe[@id='mainframe']"));
		driver.switchTo().frame(abc);
		
		//find the click on selenium checkbox
		WebElement wb = driver.findElement(By.id("Selenium"));
		wb.click();
		
		Thread.sleep(5000);
		
		//switch to top frame or main window
		//driver.switchTo().defaultContent();
		
		//switch to immediate parent frame.
		driver.switchTo().parentFrame();
		
		
		//find name text box and enter value
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Anjali");
		
		
		
		

	
	
	
	}

}
