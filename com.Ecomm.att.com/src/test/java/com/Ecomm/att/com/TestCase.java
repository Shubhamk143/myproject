package com.Ecomm.att.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecomm.ObjectRepotory.ComparePage;
import com.Ecomm.ObjectRepotory.HomePage;
import com.Ecomm.ObjectRepotory.LoginPage;
import com.Ecomm.ObjectRepotory.PhonePage;
import com.Ecomm.ObjectRepotory.Samsung;
import com.Ecomm.geneealUtility.Baseclass;
import com.Ecomm.geneealUtility.ExcelUtility;
import com.Ecomm.geneealUtility.PropertyFileUtility;
import com.Ecomm.geneealUtility.WebDriverUTils;
import com.google.common.io.Files;

public class TestCase extends Baseclass {
	/**
	 * author shubham
	 * @throws Throwable 
	 */
	@Test
	public void testdata() throws Throwable {
		ExcelUtility elib=new ExcelUtility();
		PropertyFileUtility plib=new PropertyFileUtility();
		WebDriverUTils wlib=new WebDriverUTils();

		// step 1 : click on phone and devies tab
		HomePage hp= new HomePage(driver);
		hp.getPhonetab();
		//driver.findElement(By.linkText("Phones & devices")).click();
		
		
		// step 2 : click on compare Devies option
		 PhonePage pp=new PhonePage(driver);
		 pp.getCompareTab();
		//driver.findElement(By.xpath("//button[text()='Compare devices']")).click();
		
		// step 3: select 4 mobile
		 pp.getIphonetab();
		 pp.getGalaxyA21tab();
		 pp.getGalaxyatab();
		 pp.getGalaxyNotetab();
		/**driver.findElement(By.xpath("//div[text()='iPhone 12 Pro Max']")).click();
		driver.findElement(By.xpath("//div[text()='Galaxy S21 5G']")).click();
		driver.findElement(By.xpath("//div[text()='Galaxy A12']")).click();
		driver.findElement(By.xpath("//div[text()='Galaxy S21+ 5G']")).click();
		**/
		 
		 
		//step 4 : click on compare tab
		pp.getNextcompareTab();
		//driver.findElement(By.xpath("//button[@class='btn-primary btn-arrow mar-t-xs false _2RU8l btn-primary']")).click();
		
	     wlib.takeScreenshot(driver, "phonedesc.png");
		  
		//step 5 : set filter for comparison 
		ComparePage cp=new ComparePage(driver);
		cp.getDimension();
		cp.getProcessor();
		cp.getDisplay();
		/**
		driver.findElement(By.id("deviceLabel0")).click();
		driver.findElement(By.id("deviceLabel1")).click();
		driver.findElement(By.id("deviceLabel5")).click();
		**/
		
		//step 6 : click on shop now tab
		  cp.clickShowtab();
		//driver.findElement(By.xpath("//a[text()='Shop now']/ancestor::div[@class='slick-slide slick-active slick-current']//a[text()='Shop now']")).click();
		
		  
		//step 7 : click on colour ,capacity,pricing option 
		  Samsung s=new Samsung();
		  s.clickOncolour();
		  s.clickStorage();
		  s.clickonDesc();

		/**driver.findElement(By.id("Gold")).click();
		driver.findElement(By.id("sku1150096")).click();
		driver.findElement(By.id("ct200004")).click();
		**/
		  
		  wlib.takeScreenshot(driver, "phone.png");

		
		 //step 8 : validate the price 
	       WebElement t=s.getExpphonePrice();
	 //WebElement ele=driver.findElement(By.xpath("//div[text()='128 GB']/ancestor::div[@class='jsx-3404677130 flex flex-column']//span[text()='1,099.99']"));
         String exp=t.getText();
         WebElement a=s.getFullphonePrice();
         WebElement ele2=driver.findElement(By.xpath("//div[text()='Full retail price']/ancestor::div[@class='jsx-406247468 flex flex-column']//span[text()='1,099.99']"));
         String actual=a.getText();
         
         Assert.assertEquals(actual, exp);
         
         //step 9 :write price in the excel sheet
         
        elib.writeExcelData("sheet1",1,1,actual);
        
        //step 10:click on check avaibility and store for pickup
               s.clickonavaiblity();
         // driver.findElement(By.linkText("Check availability at your favorite store")).click();
               
               
          s.clickPickStore();
         // driver.findElement(By.xpath("//h3[text()='McCarthy Ranch Marketplace store']/ancestor::div[@class='_3xCzO']//button[text()='Pick this store']")).click();
          
          s.clickContinue();
          // step 11  :click on continue tab
         // driver.findElement(By.xpath("//button[text()='Continue ($1,099.99)']")).click();
           
          s.clickAddtoMYcart();
          // step 12 : select add to line to my account
           driver.findElement(By.xpath("//button[text()='Add a line to my account']"));
       
           
           //step 13: login into application
          
           String userId=plib.readDataFromPropertyFfile("userid");
           String pwd=plib.readDataFromPropertyFfile("pwd");
           
           LoginPage lp=new LoginPage(driver);
           lp.loginToApp(userId, pwd);
           
          /**  driver.findElement(By.id("userID")).sendKeys(userId);
           driver.findElement(By.id("password")).sendKeys(userId);
           driver.findElement(By.id("signin")).click();
           **/
          
           
}

	
}