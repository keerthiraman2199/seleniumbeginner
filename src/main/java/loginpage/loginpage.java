package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginpage {
	
@Test
	public void page(){
		System.setProperty("wedriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//chromedriver constructor	
		 driver.get("https://letcode.in/"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.name("email")).sendKeys("learningid3005@gmail.com");//name locator
		 driver.findElement(By.name("password")).sendKeys("Janaganm");//name locator
		 driver.findElement(By.xpath("//a[@class='navbar-link' and text()='Courses']")).click();//xpath
		 System.out.println("Executed Sucessfully");
		 driver.findElement(By.partialLinkText("Selenium-Java")).click();
		 driver.findElement(By.xpath("//a[@class='navbar-link' and text()='Grooming']")).click();
		 driver.findElement(By.linkText("-Work-Space")).click();
		 //driver.findElement(By.xpath("//a[contains(@class,'navbar-item is-tab') and contains(text(),'Work-Space'")).click();
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.id("fullName")).sendKeys("Keerthi.M");//id
		 String e =driver.findElement(By.xpath("//label[contains(text(),'Enter your full Name')]")).getText(); 
		 System.out.println(e);
		 driver.findElement(By.linkText("Log in")).click();//linktext

		 driver.findElement(By.partialLinkText("Product")).click();
		 String d= driver.findElement(By.partialLinkText("Product")).getText();
		 System.out.println("Title of the page:" +d);

		 driver.navigate().to("https://letcode.in/test");
		 //String f=driver.findElement(By.className("title has-text-primary")).getText();
		 //System.out.println("Title of the page:" +f);
		 driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		 //getattributes methods
		 String a=driver.findElement(By.id("join")).getAttribute("placeholder");
		 System.out.println("placeholder value :" +a);
		 //tab method
		 driver.findElement(By.id("join")).sendKeys("person",Keys.TAB);
		 //sendkeys
		 driver.findElement(By.id("fullName")).sendKeys("keerthi.m");
		 //clear method
		 driver.findElement(By.id("getMe")).clear();
		 //attribute
		String d1 = driver.findElement(By.id("clearMe")).getAttribute("Koushik Chatterjee");
		System.out.println(d1);

boolean  c= driver.findElement(By.xpath("//input[@placeholder='Enter']")).isEnabled();
		System.out.println(c);

		 driver.quit();
		 
		 
		 //driver.findElement(By.className("icon has-text-primary")).click();
		 
			/*
			 * driver.get("https://www.amazon.com/");
			 * driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).
			 * sendKeys("mobiles"); driver.findElement(By.xpath("//input[@value='Go']"));
			 * driver.findElement(By.
			 * xpath("//span[@text()='HP 14\" Latest Stream Laptop Ultral Light for Students and Business, Intel Celeron Processor, 8GB RAM, 64GB eMMC, 1 Year Office 365, Fast Charge, HDMI, WiFi, USB-A&C, Win 11 GM Accessory'])"
			 * ))
			 */
		System.out.println("Executed Sucessfully");
				}

}
