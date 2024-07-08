package tralie;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class interviewqestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://in.pinterest.com/ideas/food-and-drink/918530398158/");
		//driver.findElement(By.xpath("//input[@name='searchBoxInput']")).sendKeys("architecture");
		//driver.close();
		driver.get("https://letcode.in/");
		driver.findElement(By.xpath("//a[@class='navbar-link']")).click();
		driver.findElement(By.xpath("//a[normalize_space(text(),' Selenium-Java ']")).click();
		
		Thread.sleep(1000);
	driver.close();
		driver.quit();
			}
}
