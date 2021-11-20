package sample.eazydiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class locationTest {
	@Test
	public void test3()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harish\\Desktop\\maven selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.eazydiner.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("srchbar")).click();
		driver.findElement(By.id("search_city")).click();
		driver.findElement(By.xpath("//a[@data-city='Bengaluru']")).click();
		driver.quit();


	}

}
