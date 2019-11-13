package com.fli.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fli.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory
	
	@FindBy(linkText="Login & Signup")
	WebElement loginlink;
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement login;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")
	WebElement loginbtn;
	
	//Intialize page elements
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String ValidatePageTitle() {
		return driver.getTitle();
		
	}
	
	
	public HomePage login (String User,String Password) {
		//loginlink.click();
		driver.manage().window().maximize();
		login.click();
		login.sendKeys(User);
		password.sendKeys(Password);
		loginbtn.submit();
		
		return new HomePage();
	}
}
