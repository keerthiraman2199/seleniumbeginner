package labels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class label {

	public  void labels() {
		System.setProperty("webdriver.driver.chromedriver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		List<WebElement> inputs =  driver.findElements(By.tagName("input"));
		WebElement lastElement = inputs.get(inputs.size()-1);
		System.out.println(lastElement);
		System.out.println("Last element" +lastElement.getText());
		int size = inputs.size();
		if(size==6) {
			System.out.println("test cases passed");
		}
		else System.out.println("failed");
		for(WebElement input:inputs) {
			String text = input.getText();
			System.out.println(text);
		}
		driver.quit();
		
		}
		

	}

