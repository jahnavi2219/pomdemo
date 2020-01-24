package demowebshoptest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import demoofpom.RegistrationPOM;

public class Verifyregistration {
	@Test
	public void checkregistration(){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		RegistrationPOM register=new RegistrationPOM(driver);
		register.clickgender();
		register.enterfirstname("tunuguntla");
		register.enterlastname("jahnavi");
		register.enteremail("janu199819@gmail.com");
		register.enterpassword("123456789");
		register.enterconfirmpassword("123456789");
		register.clickregister();
		
	}
}
		
		
	
