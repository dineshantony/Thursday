package javaClassPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitializeWebDriver {
	
	WebDriver driver;
	
	public WebDriver Initialize() {
		
				//CHROME
				System.setProperty("webdriver.chrome.driver","C:\\Users\\devuser\\Eclipse-WorkSpace-Java\\chromedriver_win32 (2)\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        return driver;
		        
		        //FIREFOX       
		        /*System.setProperty("webdriver.gecko.driver","C:\\Users\\devuser\\Eclipse-WorkSpace-Java\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        driver.manage().window().maximize();
		        return driver;*/
		        
		        //INTERNET EXPLORER
		        /*System.setProperty("webdriver.ie.driver","C:\\Users\\devuser\\Eclipse-WorkSpace-Java\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		        driver = new InternetExplorerDriver();
		        driver.manage().window().maximize();
		        return driver;*/
		        
				//EDGE
		        /*System.setProperty("webdriver.edge.driver","C:\\Users\\devuser\\Eclipse-WorkSpace-Java\\EdgeDriver\\MicrosoftWebDriver (6).exe");
		        WebDriver driver=new EdgeDriver();
		        driver.manage().window().maximize();
		        return driver;*/
	}

}
