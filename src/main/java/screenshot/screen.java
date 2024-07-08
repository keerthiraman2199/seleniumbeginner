package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
	File firstscr = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File ("./snapshoot/image.png");
	FileHandler.copy(firstscr, dest);
	driver.findElement(By.xpath("//a[text()='Work-Space']")).click(); 
	File elem =driver.getScreenshotAs(OutputType.FILE); 
	File delem = new File("./snapshoot/image1.png"); FileHandler.copy(elem, delem);
	//to the particular webelemt screenshot
	driver.get("https://letcode.in/buttons");
	WebElement h= driver.findElement(By.id("property"));
	File elescr = h.getScreenshotAs(OutputType.FILE);
	File eledest = new File ("./snapshoot/image2.png");
	FileHandler.copy(elescr, eledest); 
	System.out.println("image screenshot");
	driver.quit();
}

}
