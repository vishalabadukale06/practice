package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class5 {

	@Test(dataProvider = "facebook")
	public void loginFunctionality(String url, String username, String password) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys(password);

		driver.findElement(By.name("login")).click();
	}

	
	
	@DataProvider(name="facebook")
	public Object[][] getData() throws IOException {

		ExcelReader data = new ExcelReader("C:\\Users\\HP\\Desktop\\Facebook1.xlsx");

		return data.getAllSheetData(0);
	}
}
