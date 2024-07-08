package buttoncodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElement(By.xpath("//a[text()='Work-Space']")).click();
		driver.navigate().to("https://letcode.in/buttons");
		Rectangle v =driver.findElement(By.id("property")).getRect();
	System.out.println("height of the button:" +v.getHeight());
	System.out.println("width of the button:" +v.getWidth());
	v.getX();
	v.getY();
	String c = driver.findElement(By.id("color")).getCssValue("background-color");
	System.out.println(c);
	}

}
