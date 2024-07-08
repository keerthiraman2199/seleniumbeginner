package drivernavigate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivernavigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://letcode.in/playwright");
		String d= driver.getCurrentUrl();
		System.out.println("playwright page url " +d);
		driver.findElement(By.xpath("//a[text()='Grooming']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//a[@class='navbar-item' and text()=' Interview Q & A ']")).click();
		Thread.sleep(2000);
		String e = driver.getCurrentUrl();
		System.out.println(" grooming page url"  +e);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().to("https://letcode.in/signup");
		Navigation nav = driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
	    driver.quit();
		
		

	}

}
