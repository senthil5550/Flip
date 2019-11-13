package com.fli.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fli.qa.base.TestBase;
import com.fli.qa.page.CartPage;
import com.fli.qa.page.DeliveryAddress;
import com.fli.qa.page.HomePage;
import com.fli.qa.page.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	DeliveryAddress deliveryaddress;
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		cartpage = new CartPage();
		deliveryaddress = new DeliveryAddress();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Success of login into website--->");
		cartpage =homepage.Searchproduct(prop.getProperty("productname"));
		deliveryaddress = cartpage.PlaceOrderButton();
	}
	
	/*@Test
	public void LoginPageTitleTest(){
		String Title = loginpage.ValidatePageTitle();
		//System.out.println("title of website--->"+Title);
		Assert.assertEquals(Title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}*/
	
	@Test
	public void CheckOut(){
	System.out.println("Successfully reached to Delivery address page--->");
	
	}
	
	
	
	@AfterMethod
	public void CloseBrowser() {
	//driver.close();
	}
	
	

}
