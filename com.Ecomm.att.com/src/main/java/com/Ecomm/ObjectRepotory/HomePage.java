package com.Ecomm.ObjectRepotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		 this.driver = driver;
		  PageFactory.initElements(driver, this);
	 }
	
	  @FindBy(linkText = "Phones & devices")
	  private WebElement phonetab;
	  
	public WebElement getPhonetab() {
		return phonetab;
	}
	
	public void phonetab() {
		phonetab.click();
	}
	  

}
