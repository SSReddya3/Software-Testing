package seleniumwithjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A003_1_BrowserCommands2 {

	public static void main(String[] args) {



		//Browser open
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
		//Window Maximize
				driver.manage().window().maximize();
				
	//BrowserCommands	
		
		       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
            System.out.println( "Title of the Page :--"+ driver.getTitle());		
            System.out.println( "CurrentUrl of the Page :--"+ driver.getCurrentUrl());		
            System.out.println( "PageSource of the Page :--"+ driver.getPageSource());		
            
		
		
	//Close only single Window	
		
		driver.close();
		
	}

}
