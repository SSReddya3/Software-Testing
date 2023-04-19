package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A003BrowserCommands {

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
	            //System.out.println( "PageSource of the Page :--"+ driver.getPageSource());		
	            
			     driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); 
			     
            System.out.println( "Title of the Page :--"+ driver.getTitle());		
            System.out.println( "CurrentUrl of the Page :--"+ driver.getCurrentUrl());		
            System.out.println( "PageSource of the Page :--"+ driver.getPageSource());		
            
		
		
	//Close only single Window	
		driver.close();
	//Close all  Windows		
		//driver.quit();
		
	}

}
