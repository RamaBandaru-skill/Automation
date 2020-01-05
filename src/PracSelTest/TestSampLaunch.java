package PracSelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestSampLaunch {

	public static void main(String[] args) {
		
		
		  //Launch facebook.com 
		 System.setProperty("webdriver.geckodriver.driver", "‪C:\\Users\\ramab\\Desktop\\WDlatest\\Jars\\geckodriver.exe"); 
		 WebDriver driver = new FirefoxDriver(); 
		 driver.get("http://facebook.com");
		 driver.close();
		  
		  
		  // Launch gmail in chrome 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramab\\Desktop\\WDlatest\\Jars\\chromedriver.exe");
		  WebDriver driver1 = new ChromeDriver(); driver1.get("http://gmail.com");
		  driver1.close();
		 
		
		//Launch rediff.com 
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ramab\\Desktop\\WDlatest\\Jars\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("http://rediff.com");	
		driver2.close();	
	}

}
