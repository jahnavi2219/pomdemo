package demowebshoptest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import demoofpom.LoginPagePOM;

public class Verifylogin {
	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPagePOM login=new LoginPagePOM(driver);
		login.clicklogin1();
		login.enteremail("rekhab1@gmail.com");
		login.enterpassword("rekhab");
		login.clicklogin();
		
		
	}

	
}
