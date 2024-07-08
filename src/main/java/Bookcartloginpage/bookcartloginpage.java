package Bookcartloginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookcartloginpage {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://bookcart.azurewebsites.net/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='Search books or authors']")).sendKeys("harry potter and the goblet of fire");
	driver.findElement(By.xpath("//input[@role='combobox']")).click();
	driver.quit();	
	

	}
	
}
