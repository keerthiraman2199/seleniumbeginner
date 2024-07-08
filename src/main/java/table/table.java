package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement  table = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']"));
		table.findElement(By.tagName("td"));
		System.out.println(table.getText());
	    
	    
	    
	    
		driver.quit(); 
	}

}
