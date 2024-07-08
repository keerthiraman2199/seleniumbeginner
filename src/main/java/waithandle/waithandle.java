package waithandle;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waithandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.driver.chromedriver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.id("accept")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		driver.quit();

	}

}
