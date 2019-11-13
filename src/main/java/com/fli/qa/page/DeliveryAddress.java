package com.fli.qa.page;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fli.qa.base.TestBase;

public class DeliveryAddress extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	//Page Factory
	
	public DeliveryAddress() {
		PageFactory.initElements(driver, this);
	}
	

}
