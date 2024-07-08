package waithandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class invisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(30));
		driver.get("https://letcode.in/signin");
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		WebElement tosat = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		wait.until(ExpectedConditions.visibilityOf(tosat));)
		System.out.println(tosat.getText());
	boolean until1 = wait.until(ExpectedConditions.invisibilityOf(tosat));
	System.out.println(until1);
	driver.findElement(By.linkText("Sign out")).click();
	driver.quit();
	
		
	}

}
