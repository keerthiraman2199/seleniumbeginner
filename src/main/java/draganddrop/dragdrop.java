package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/HTML/html5_draganddrop.asp");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		WebElement sourceone = driver.findElement(By.id("draggable2"));
		WebElement destone = driver.findElement(By.id("droppable"));
		Actions builder = new Actions (driver);
		builder.dragAndDrop(sourceone,destone).build().perform();
	}
}
