package com.Ecomm.ObjectRepotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {
	WebDriver driver;
	public ComparePage(WebDriver driver) {
		 this.driver = driver;
		  PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(id = "deviceLabel0")
	  private WebElement dimensionTab;
	 @FindBy(id = "deviceLabel1")
	  private WebElement displayTab;
	 @FindBy(id = "deviceLabel5")
	  private WebElement processorTab;

	 @FindBy(xpath = "//a[text()='Shop now']/ancestor::div[@class='slick-slide slick-active slick-current']//a[text()='Shop now']")
	  private WebElement shopNowtab;
	 
	public WebElement getDimensionTab() {
		return dimensionTab;
	}

	public WebElement getDisplayTab() {
		return displayTab;
	}

	public WebElement getProcessorTab() {
		return processorTab;
	}

	public WebElement getShopNowtab() {
		return shopNowtab;
	}
	public void getDisplay() {
		displayTab.click();
	}
	public void getDimension() {
		dimensionTab.click();
	}
	public void getProcessor() {
		processorTab.click();
	}
	public void clickShowtab() {
		shopNowtab.click();
	}
}
