package seleniumwithjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A002BrowserOpenWithMavan {

	public static void main(String[] args) {

//Browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//Window Maximize	

		driver.manage().window().maximize();
		
		
		
		driver.close();
		
		
	}

}
