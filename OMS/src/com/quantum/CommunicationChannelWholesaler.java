package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CommunicationChannelWholesaler {
	 WebDriver driver = null;
		@BeforeSuite
		 @Test (priority= 1)
		  //TEST CASE NO 1
		  		public void setUp() {
		  			  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  			  driver=new ChromeDriver(); 
		  			  driver.get("https://oms-frontend.netlify.app/");
		  			  driver.manage().window().maximize();
		  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
		  }
		@AfterSuite
		public void teardown() {
			  driver.close();
		}
		@Test (priority= 2)
		  //TEST CASE NO 105
		public void SendMessage() throws InterruptedException {
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			
			loginBtn.click();
			Thread.sleep(3000);
			WebElement emaildField=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
			WebElement submitBtn=driver.findElement(By.xpath("//button[@type='submit']"));
			
			emaildField.sendKeys("saurabh187.quantumitinnovation@gmail.com");
			passwordField.sendKeys("Saurabh@7");
			submitBtn.click();
			
			Thread.sleep(3000);
			
			WebElement ChatBtn= driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[3]"));
			ChatBtn.click();
			Thread.sleep(3000);
			
			WebElement ChatField= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/div/textarea"));
			ChatField.click();
			ChatField.sendKeys("Hey Admin");
			Thread.sleep(3000);

			
			WebElement Send= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/div/div/button"));
			Send.click();
			Thread.sleep(3000);

		}
		@Test (priority= 3)
		  //TEST CASE NO 106
		public void OldMessage() throws InterruptedException {
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			
			loginBtn.click();
			Thread.sleep(3000);
			WebElement emaildField=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
			WebElement submitBtn=driver.findElement(By.xpath("//button[@type='submit']"));
			
			emaildField.sendKeys("saurabh187.quantumitinnovation@gmail.com");
			passwordField.sendKeys("Saurabh@7");
			submitBtn.click();
			
			Thread.sleep(3000);
			
			WebElement ChatBtn= driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[3]"));
			ChatBtn.click();
			Thread.sleep(3000);
		

		}
		@Test (priority= 3)
		  //TEST CASE NO 107
		public void MessageFormat() throws InterruptedException {
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			
			loginBtn.click();
			Thread.sleep(3000);
			WebElement emaildField=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
			WebElement submitBtn=driver.findElement(By.xpath("//button[@type='submit']"));
			
			emaildField.sendKeys("saurabh187.quantumitinnovation@gmail.com");
			passwordField.sendKeys("Saurabh@7");
			submitBtn.click();
			
			Thread.sleep(3000);
			
			WebElement ChatBtn= driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[3]"));
			ChatBtn.click();
			Thread.sleep(3000);
			
			WebElement ChatField= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/div/textarea"));
			ChatField.click();
			ChatField.sendKeys("@@@");
			Thread.sleep(3000);

			
			WebElement Send= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/div/div/button"));
			Send.click();
			Thread.sleep(3000);

		}
		@Test (priority= 4)
		  //TEST CASE NO 108
		public void MessageTimestamp() throws InterruptedException {
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			
			loginBtn.click();
			Thread.sleep(3000);
			WebElement emaildField=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
			WebElement submitBtn=driver.findElement(By.xpath("//button[@type='submit']"));
			
			emaildField.sendKeys("saurabh187.quantumitinnovation@gmail.com");
			passwordField.sendKeys("Saurabh@7");
			submitBtn.click();
			
			Thread.sleep(3000);
			
			WebElement ChatBtn= driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[3]"));
			ChatBtn.click();
			Thread.sleep(3000);
			
			WebElement ChatField= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/div/textarea"));
			ChatField.click();
			ChatField.sendKeys("@@@");
			Thread.sleep(3000);

			
			WebElement Send= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/div/div/button"));
			Send.click();
			Thread.sleep(3000);

		}
			
}
