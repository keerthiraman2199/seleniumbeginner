package Launchchrome;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("wedriver.chrome.driver","./Drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		

	}

}
