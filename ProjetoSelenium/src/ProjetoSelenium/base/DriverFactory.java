package ProjetoSelenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver driver;	
	
	public static WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}
	
	private static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\745080\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php/");
		
	}
	
	public static void killDriver() {
		driver.quit();
		driver = null;
	}
}
