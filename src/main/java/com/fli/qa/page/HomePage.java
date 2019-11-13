package com.fli.qa.page;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fli.qa.base.TestBase;

public class HomePage extends TestBase {
	// Page Factory
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	//@FindBy(xpath ="/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement searchbox;
	
		
	@FindBy(linkText="OnePlus 7T (Glacier Blue, 128 GB)")
	WebElement oneplus;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement addtocartbtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public CartPage Searchproduct (String Product) {
		wait.until(ExpectedConditions.elementToBeClickable(searchbox));
		searchbox.click();
		searchbox.sendKeys(Product);
		searchbox.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(oneplus));
		oneplus.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> windowid= driver.getWindowHandles();
		String homewindow = windowid.iterator().next();
		System.out.println("homewindow  title===>"+homewindow);
		windowid.remove(windowid.iterator().next());
		String addtocartwindow = windowid.iterator().next();
		System.out.println("addtocartwindow  title===>"+addtocartwindow);
		driver.switchTo().window(addtocartwindow);
		System.out.println("window  title===>"+driver.getTitle());
		wait.until(ExpectedConditions.elementToBeClickable(addtocartbtn));
		addtocartbtn.click();
		//addtocartbtn.sendKeys(Keys.ENTER);
		return new CartPage();
		
	}
	
	public void logout() {
		System.out.println("Logout need to be defined");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"))).build().perform();
	}

}
