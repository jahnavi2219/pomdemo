package demowebshoptest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demoofpom.LoginPagePOM;
import demoofpom.RegistrationPOM;


public class Verifyloginandregistration{
	WebDriver driver;
	@BeforeMethod
	public void startapp(){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			
	}
	
	@Test
	public void checkregister(){
		RegistrationPOM register=new RegistrationPOM(driver);
		register.clickregister1();
		register.clickgender();
		register.enterfirstname("tunuguntla");
		register.enterlastname("jahnavi");
		register.enteremail("januuu1919@gmail.com");
		register.enterpassword("123456789");
		register.enterconfirmpassword("123456789");
		register.clickregister();
	
		String regmessage=driver.findElement(By.xpath("//*[contains(text(),'Your registration completed')]")).getText();
		String expectedmessage="Your registration completed";
		System.out.println("regmessage");
		Assert.assertEquals(expectedmessage,regmessage);
		
		String logmessage=driver.findElement(By.xpath("//a[contains(text(),'janu9819@gmail.com')]")).getText();
				String expectedmessage1="jan1919@gmail.com";
				System.out.println("logmessage");
				Assert.assertEquals(expectedmessage1,logmessage);
	}
	
	@Test(priority=1)
	public void checklogin(){
		LoginPagePOM login=new LoginPagePOM(driver);
		login.clicklogin1();
		login.enteremail("rekhab1@gmail.com");
		login.enterpassword("rekhab");
		login.clicklogin();
		
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}
}
	

