package in.licious.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import in.licious.pom.BaseClass;
import in.licious.pom.Login;


public class TestLogin extends BaseClass{
	
//	 public TestLogin(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}


	//	@DataProvider(name = "Authentication")
//	 
//	  public static Object[][] credentials() {
//	 
//	     
//	 
//	        return new Object[][] { { "8105325254", "Merchant@123" }};
//	 
//	  }
//	 
//	 @Test(dataProvider = "Authentication")
//	 
	  @Test 
	  public void testTestLogin() throws InterruptedException {
	 
	     
	 
		Login l= new Login(driver);
			
		l.getuntb1().sendKeys("8105325254");
		
		Thread.sleep(2000);
		
		System.out.println("Username entered successfully");
		System.out.println();
		
		l.getpwTB1().sendKeys("Merchant@123");	
		Thread.sleep(2000);
		
		System.out.println("Password entered successfully");
		System.out.println();
		
		l.getlogin().click();
		
		System.out.println("User logged in successfully");
		
		
		//String un ="8105325254" ;
		
//		//System.out.println(un);
//		String pwd="Merchant@123" ;
//		System.out.println(pwd);
		
	
		// l.setUsername(un);
		// l.setPassword(pwd);
		// l.clickLogin();
		
		
	}
	
	

}
