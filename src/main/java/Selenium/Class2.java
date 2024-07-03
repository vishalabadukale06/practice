package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("onwardCal")).click();
		
		Thread.sleep(5000);

		while (true) {

			WebElement mYear = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"));

			String myearStr = mYear.getText();

			if (myearStr.contains("Dec 2024")) {

				Thread.sleep(5000);

				WebElement date = driver.findElement(By.xpath("//span[text()='28']"));

				Thread.sleep(5000);

				date.click();

				break;
			} else {

				driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			}

		}

	}

}
