package seleniumwithjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A001BrowserOpenWithNormal {

	public static void main(String[] args) {

		

//Browser open
		
		System.setProperty("WebDriverManager", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//Window Maximize
		
		driver.manage().window().maximize();
		
		
		
		
		
		driver.close();
		
		
	}

}
