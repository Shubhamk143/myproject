package com.Ecomm.ObjectRepotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Samsung {
	WebDriver driver;
	public void SamsungPage(WebDriver driver) {
		 this.driver = driver;
		  PageFactory.initElements(driver, this);
	 }
	@FindBy(id="Gold")
	private WebElement clickGold;

	@FindBy(id="sku1150096")
	private WebElement clickStorage;

	
	@FindBy(id="ct200004")
	private WebElement clickonDesc;
	
	 @FindBy(xpath = "//div[text()='128 GB']/ancestor::div[@class='jsx-3404677130 flex flex-column']//span[text()='1,099.99']")
	  private WebElement ExpphonePrice;
	 
	@FindBy(xpath = "//div[text()='Full retail price']/ancestor::div[@class='jsx-406247468 flex flex-column']//span[text()='1,099.99']")
	  private WebElement FullphonePrice;
	 
	 @FindBy(linkText = "Check availability at your favorite store")
	  private WebElement clickavaiblity;
	 
	 @FindBy(xpath = "//h3[text()='McCarthy Ranch Marketplace store']/ancestor::div[@class='_3xCzO']//button[text()='Pick this store']")
	  private WebElement clickPickStore;
	 
	 @FindBy(xpath = "//button[text()='Continue ($1,099.99)']")
	  private WebElement clickContinue;
	 
	 @FindBy(xpath = "//button[text()='Add a line to my account']")
	private WebElement clickAddtoMyAcc;
	 
	 public WebElement getClickGold() {
			return clickGold;
		}

		public WebElement getClickStorage() {
			return clickStorage;
		}

		public WebElement getClickonDesc() {
			return clickonDesc;
		}
	 
	 public WebElement getExpphonePrice() {
			return ExpphonePrice;
		}

		public WebElement getFullphonePrice() {
			return FullphonePrice;
		}

		public WebElement getClickavaiblity() {
			return clickavaiblity;
		}

		public WebElement getClickPickStore() {
			return clickPickStore;
		}

		public WebElement getClickContinue() {
			return clickContinue;
		}

		public WebElement getClickAddtoMyAcc() {
			return clickAddtoMyAcc;
		}
		
		public void clickonavaiblity() {
			clickavaiblity.click();
		}
		public void clickPickStore() {
			clickPickStore.click();
		}
		public void clickContinue() {
			 clickContinue.click();
		}
		public void clickAddtoMYcart() {
			clickAddtoMyAcc.click();
		}
		
		public void clickOncolour() {
			clickGold.click();
		}
		public void clickStorage() {
			clickStorage.click();
		}
		public void clickonDesc() {
			clickonDesc.click();
		}
	 
	 
}
