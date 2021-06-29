package com.Ecomm.geneealUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
	public PropertyFileUtility pLib;
	public WebDriverUTils wlib;
	 @BeforeClass
	 public void launchBrowser() throws Throwable {
	  String BROWSER = pLib.readDataFromPropertyFfile("browser");

	  if (BROWSER.equalsIgnoreCase("firefox")) {
	   driver = new FirefoxDriver();
	  } else if (BROWSER.equalsIgnoreCase("chrome")) {
	   driver = new ChromeDriver();
	  } else if (BROWSER.equalsIgnoreCase("ie")) {
	   driver = new InternetExplorerDriver();
	  }
	  driver.manage().window().maximize();
	   driver.get("www.att.com");
	  wlib.waitforPageToLoad(driver);
}
	 @AfterClass
	 public void closeBrowser() {
	  driver.close();
	 }
}
