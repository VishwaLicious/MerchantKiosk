package in.licious.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;



public abstract class  BaseClass  {
	
	
	public static WebDriver driver;

	 static {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Asmita\\My_Office_Work\\websiteautomation2\\BrowserDrivers\\chromedriver.exe");
		
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\Asmita\\My_Office_Work\\websiteautomation2\\chromedriver.exe");
		 
		 
		 driver=new ChromeDriver();
			
		 clear_cache(driver);
	}
	 
	 public BaseClass() {
		 
	 }
	 private static void clear_cache(WebDriver driver2) {
		// TODO Auto-generated method stub
		
	}
	public BaseClass(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
	/* public BaseClass(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
*/

	@BeforeMethod
	 
	 public void openApp() {
		 
		 driver.get("http://ort-merchantkiosk.licious.in");
		 clear_cache(driver);
	 }
	
}
