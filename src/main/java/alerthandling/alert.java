package alerthandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		Thread.sleep(1000);
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alret" +text);
		alert.accept();
		System.out.println("alert");
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert.getText();
		alert1.getText();
		System.out.println("output" +text1);
		driver.close();
		driver.quit();



	}

	}

