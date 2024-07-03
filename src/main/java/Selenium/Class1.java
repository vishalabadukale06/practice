package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		//driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
				
		WebElement dob = driver.findElement(By.id("day"));
		
		Select sel = new Select(dob);
		
		sel.selectByVisibleText("26");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select sel1  = new Select(month);
		
		sel1.selectByValue("6");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select sel2 = new Select(year);
		
		sel2.selectByIndex(1);
		
		WebElement wb = sel2.getFirstSelectedOption();
		
		System.out.println(wb.getText());
		
		List<WebElement> ls = sel2.getOptions();
		
		int c = ls.size();
		
		System.out.println(c);
		
		for(WebElement wb1 : ls) {
			
			String str = wb1.getText();
			
			System.out.println(str);
			
			if(str.equals("2016")) {
				
				System.out.println("Year is present in drop Down");
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
	