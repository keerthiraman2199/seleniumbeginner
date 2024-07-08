package windowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		//swtiching frames
		String windowHandle = driver.getWindowHandle();
		System.out.println("first window:" +windowHandle);
		driver.findElement(By.id("home")).click();
		String ele = driver.getTitle();
		System.out.println("parent window: " +ele);
		//collecting nother frames
		Set <String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List <String> list = new ArrayList <String>(windowHandles);
		driver.switchTo().window(list.get(1));
	String list1 = driver.getTitle();
		System.out.println("Childs window: " +list1);
		//closing the browser parent 
		driver.close();
		Thread.sleep(1000);
		
		driver.findElement(By.id("multi")).click();
		Set <String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
		List <String> list2 = new ArrayList <String>(windowHandles);
		driver.switchTo().window(list2.get(1));
	String list3 = driver.getTitle();
		System.out.println("Childs window: " +list3);
		
		
		driver.close();
		driver.quit();
	}

}
