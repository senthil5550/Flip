package com.fli.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fli.qa.base.TestBase;

public class CartPage extends TestBase {
	
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@FindBy(linkText="Remove")
	WebElement removelink;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[2]/div[2]/div/div[1]/div/div[3]/div/form/button/span")
	WebElement placeordbtn;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public DeliveryAddress PlaceOrderButton() {
		wait.until(ExpectedConditions.elementToBeClickable(placeordbtn));
		placeordbtn.click();
		return new DeliveryAddress();
		
	}

}
