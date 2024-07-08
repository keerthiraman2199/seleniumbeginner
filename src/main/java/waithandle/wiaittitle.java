package waithandle;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wiaittitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
		ele1.click();
		Select  ele2 = new Select (ele1);
		ele2 .selectByVisibleText("Appliances");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(ele2);
		driver.quit();
		

	}

}
