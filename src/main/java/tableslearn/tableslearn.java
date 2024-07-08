package tableslearn;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableslearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.cssSelector("#<id='shopping'>"));
		List <WebElement> headers =table.findElements(By.tagName("th"));
		for(WebElement header: headers) {
			String text = header.getText();
			System.out.println("text");
		}
		driver.quit();

	}

}
