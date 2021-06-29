package com.Ecomm.ObjectRepotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		 this.driver = driver;
		  PageFactory.initElements(driver, this);
	 }
	
	@FindBy(id="userID")
	private WebElement UserNameEdt;

	@FindBy(id="password")
	private WebElement passwordEdt;

	@FindBy(id="signin")
	private WebElement loginButton;


	public WebElement getUserNameEdt()
	{
	return UserNameEdt;
	}
	 
	public WebElement getPasswordEdt()
	{
		return passwordEdt;
	}

	public WebElement getLoginButton()
	{
		return loginButton;
		}


	public void loginToApp(String Userid, String Pwd)
	{
		UserNameEdt.sendKeys(Userid);
		passwordEdt.sendKeys(Pwd);
		loginButton.click();
	}

}
