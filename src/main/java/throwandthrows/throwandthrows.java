package throwandthrows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class throwandthrows {
public void code () throws InterruptedException {
	Thread.sleep(1000);
}
	public static void main(String[] args) throws InterruptedException {
		throwandthrows t = new throwandthrows();
		t.test();
		}
	public void test () {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("koushik350@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.err.println("Element not found");
		try {
		throw new RuntimeException();}
		catch(RuntimeException d) {
			System.err.println("runtime exception");
		}
		}
	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("PASS123$");
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		driver.quit();
	}

	}

