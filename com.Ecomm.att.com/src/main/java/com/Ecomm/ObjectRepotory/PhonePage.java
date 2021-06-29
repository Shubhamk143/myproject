package com.Ecomm.ObjectRepotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonePage {
	WebDriver driver;
	public PhonePage(WebDriver driver) {
		 this.driver = driver;
		  PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath = "//button[text()='Compare devices']")
	  private WebElement compareTab;
	 
	 @FindBy(xpath = "//div[text()='iPhone 12 Pro Max']")
	  private WebElement iphonetab;
	 @FindBy(xpath = "//div[text()='Galaxy S21 5G']")
	  private WebElement galaxyatab;
	 @FindBy(xpath = "//div[text()='Galaxy A12']")
	  private WebElement galaxyA21tab;
	 @FindBy(xpath = "//div[text()='Galaxy Note20 Ultra 5G']")
	  private WebElement galaxyNotetab;
	 
	 @FindBy(xpath = "//button[@class='btn-primary btn-arrow mar-t-xs false _2RU8l btn-primary']")
	  private WebElement NextcompareTab;
	 
	public WebElement getNextcompareTab() {
		return NextcompareTab;
	}

	public WebElement getIphonetab() {
		return iphonetab;
	}

	public WebElement getGalaxyatab() {
		return galaxyatab;
	}

	public WebElement getGalaxyA21tab() {
		return galaxyA21tab;
	}

	public WebElement getGalaxyNotetab() {
		return galaxyNotetab;
	}

	public WebElement getCompareTab() {
		return compareTab;
	}
	
	 public void clickonphone1() {
		 iphonetab.click();
	 }
	 public void clickonphone2() {
		 galaxyatab.click();
	 }
	 public void clickonphone3() {
		 galaxyA21tab.click();
	 }
	 public void clickonphone4() {
		 galaxyNotetab.click();
	 }
	 public void clickcompare() {
		 compareTab.click();
	 }
	 public void clicknextcompare() {
		 NextcompareTab.click();
	  
}
