package activeelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activeelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement active = driver.switchTo().activeElement();
		active.sendKeys("email",Keys.TAB,"password",Keys.ENTER);
		driver.quit();

	}

}
