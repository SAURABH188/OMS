package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Order {
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
		  //TEST CASE NO 2
		public void OrderHistory() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	
	    	Thread.sleep(3000);
	    	  js.executeScript("window.scrollBy(0,1000)");
		}
		@Test (priority= 3)
		  //TEST CASE NO 3
		public void OrderStatus() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	
	    	Thread.sleep(3000);
	    	  js.executeScript("window.scrollBy(0,1000)");
		}
		@Test (priority= 4)
		  //TEST CASE NO 4
		public void PreviousOrder() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	
	    	Thread.sleep(3000);
	    	  js.executeScript("window.scrollBy(0,1000)");
		}
		@Test (priority= 5)
		  //TEST CASE NO 5 ( Not Included )
		public void SortOrder() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	Thread.sleep(3000);
	    	WebElement ClickFilter=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/select"));
	    	WebElement pending=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/select/option[2]"));
	    	
	    	ClickFilter.click();
	    	Thread.sleep(3000);
	    	pending.click();
	    	Thread.sleep(3000);
		}   
		@Test (priority= 6)
		  //TEST CASE NO 6 ( Not Included )
		public void OrderStatusChange() throws InterruptedException {
			driver.get("https://oms-admin.netlify.app/");
			
			WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
			WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
			WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
			
			emaildField.sendKeys("admin@gmail.com");
			passwordField.sendKeys("password");
			submitBtn.click();		
			
			WebElement order=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
			order.click();
			WebElement orderdetails=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
			orderdetails.click();
			WebElement statusbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select"));
			statusbtn.click();
			WebElement changestatus=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select/option[3]"));
			changestatus.click();
			WebElement updatebtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[2]/button"));
			updatebtn.click();
			
			
			
			  driver.get("https://oms-frontend.netlify.app/");
			  driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			loginBtn.click();
			Thread.sleep(3000);
			
			WebElement emaildFieldd=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement passwordFieldd=driver.findElement(By.xpath("//input[@name='password']"));
			WebElement submitBtnn=driver.findElement(By.xpath("//button[@type='submit']"));
			
			emaildFieldd.sendKeys("saurabh187.quantumitinnovation@gmail.com");
			passwordFieldd.sendKeys("Saurabh@7");
			submitBtnn.click();
			
			Thread.sleep(3000);
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	Thread.sleep(3000);
	    	WebElement paid=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/p"));
	    	paid.isDisplayed();
	    	Thread.sleep(3000);
		}
		@Test (priority= 7)
		  //TEST CASE NO 7 ( Not Included )
		public void OrderDeliver() throws InterruptedException {
			driver.get("https://oms-admin.netlify.app/");
			
			WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
			WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
			WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
			
			emaildField.sendKeys("admin@gmail.com");
			passwordField.sendKeys("password");
			submitBtn.click();		
			
			WebElement order=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
			order.click();
			WebElement orderdetails=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
			orderdetails.click();
			WebElement statusbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select"));
			statusbtn.click();
			WebElement changestatus=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select/option[4]"));
			changestatus.click();
			WebElement updatebtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[2]/button"));
			updatebtn.click();
			
			
			
			  driver.get("https://oms-frontend.netlify.app/");
			  driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			loginBtn.click();
			Thread.sleep(3000);
			
			WebElement emaildFieldd=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement passwordFieldd=driver.findElement(By.xpath("//input[@name='password']"));
			WebElement submitBtnn=driver.findElement(By.xpath("//button[@type='submit']"));
			
			emaildFieldd.sendKeys("saurabh187.quantumitinnovation@gmail.com");
			passwordFieldd.sendKeys("Saurabh@7");
			submitBtnn.click();
			
			Thread.sleep(3000);
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	Thread.sleep(3000);
	    	WebElement paid=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/p"));
	    	paid.isDisplayed();
	    	Thread.sleep(3000);
		}
		@Test (priority= 8)
		  //TEST CASE NO 8
		public void OrderDetail() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	
	    	Thread.sleep(3000);
	    	  js.executeScript("window.scrollBy(0,1000)");
		}
		@Test (priority= 9)
		  //TEST CASE NO 9 ( Not Included )
		public void VerifyPrice() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	
	    	Thread.sleep(3000);
	    	  js.executeScript("window.scrollBy(0,1000)");
		}
		@Test (priority= 10)
		  //TEST CASE NO 10
		public void VerifyAddress() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	
	    	Thread.sleep(3000);
	    	  js.executeScript("window.scrollBy(0,1000)");
		}
		@Test (priority= 11)
		  //TEST CASE NO 11 ( Not Included )
		public void TrackingStatus() throws InterruptedException {
			driver.get("https://oms-admin.netlify.app/");
			
			WebElement emaildField=driver.findElement(By.xpath("//*[@id=\"text\"]"));
			WebElement passwordField=driver.findElement(By.xpath("//*[@id=\"password\"]"));
			WebElement submitBtn=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
			
			emaildField.sendKeys("admin@gmail.com");
			passwordField.sendKeys("password");
			submitBtn.click();		
			
			WebElement order=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
			order.click();
			WebElement orderdetails=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
			orderdetails.click();
			WebElement statusbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select"));
			statusbtn.click();
			WebElement changestatus=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select/option[4]"));
			changestatus.click();
			WebElement updatebtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[2]/button"));
			updatebtn.click();
			
			
			
			  driver.get("https://oms-frontend.netlify.app/");
			  driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			loginBtn.click();
			Thread.sleep(3000);
			
			WebElement emaildFieldd=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement passwordFieldd=driver.findElement(By.xpath("//input[@name='password']"));
			WebElement submitBtnn=driver.findElement(By.xpath("//button[@type='submit']"));
			
			emaildFieldd.sendKeys("saurabh187.quantumitinnovation@gmail.com");
			passwordFieldd.sendKeys("Saurabh@18");
			submitBtnn.click();
			
			Thread.sleep(3000);
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	Thread.sleep(3000);
	    	WebElement paid=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/p"));
	    	paid.isDisplayed();
	    	Thread.sleep(3000);
		}
		@Test (priority= 2)
		  //TEST CASE NO 2
		public void VisibiltyOfOrderItems() throws InterruptedException {
			
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
			WebElement accountIcon=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
			accountIcon.click();
			
			Thread.sleep(3000);
			

			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	        
	    	Thread.sleep(3000);
	    	
	    	WebElement MyOrders=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div[2]/div[2]/div/button"));
	    	MyOrders.click();
	    	
	    	Thread.sleep(3000);
	    	  js.executeScript("window.scrollBy(0,1000)");
		}
}
