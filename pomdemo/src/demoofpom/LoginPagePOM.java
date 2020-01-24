package demoofpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	WebDriver driver;
	By email=By.id("Email");
	By password=By.id("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	By login1=By.xpath("//a[@class='ico-login']");
	 
	public LoginPagePOM(WebDriver driver){
		this.driver=driver;
	}
	
	public void enteremail(String EM){
		driver.findElement(email).sendKeys(EM);
	}
	
	public void enterpassword(String PWD){
		driver.findElement(password).sendKeys(PWD);
	}
	
	public void clicklogin(){
		driver.findElement(login).click();
	}
	public void clicklogin1(){
		driver.findElement(login1).click();
	}
	}


