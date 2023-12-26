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

public class Checkout {
	
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
		public void Logout() throws InterruptedException {
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			Thread.sleep(3000);
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
	    	  
	    	  WebElement Logout=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[4]/div"));
	    	  Logout.click();
	    	  	Thread.sleep(3000);
	    		  
		}
		@Test (priority= 3)
		  //TEST CASE NO 3
		public void SelectAddress() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement selectaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div/div/input"));
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button"));

			selectaddress.click();
			nextbtn.click();
			Thread.sleep(3000);

		}
		@Test (priority= 4)
		  //TEST CASE NO 4
		public void NoAddress() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div/div/span"));

		}
		@Test (priority= 5)
		  //TEST CASE NO 5
		public void CancelAddress() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
		
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement home=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[1]"));
			
			home.click();
		
			Thread.sleep(3000);

		}
		@Test (priority= 6)
		  //TEST CASE NO 6
		public void DefaultAddress() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
		
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement defaultaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div/div/input"));
			defaultaddress.isSelected();
			Thread.sleep(3000);

		}
		@Test (priority= 7)
		  //TEST CASE NO 7
		public void SelectNewDeliveryAddress() throws InterruptedException {
			
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
	    	
	    	WebElement addressBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div[2]/div/div[2]/div/button"));
	    	addressBtn.click();
	    	
	    	Thread.sleep(3000);
	    	
	    	WebElement AddaddressBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/button"));
	    	AddaddressBtn.click();
	    	Thread.sleep(3000);
	    	
	    	WebElement streetfield=driver.findElement(By.xpath("//*[@id=\"exampleForm.ControlInput1\"]"));
	    	WebElement cityfield=driver.findElement(By.name("town"));
	    	WebElement provincefield=driver.findElement(By.name("province"));
	    	WebElement postalcodefield=driver.findElement(By.name("post_code"));
	    	WebElement addbtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));

	    	streetfield.sendKeys("4233");
	    	cityfield.sendKeys("Kolhapur");
	    	provincefield.sendKeys("Ayodhya Colony Phulewadi Ringroad Kolhapur");
	    	postalcodefield.sendKeys("416012");
	    	addbtn.click();
	    	
	    	Thread.sleep(3000);
	    	
	    	WebElement home=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/span[1]/span"));
	    	home.click();
	    	Thread.sleep(3000);
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
		
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement defaultaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div/input"));
			defaultaddress.isSelected();
			Thread.sleep(3000);
			
			WebElement newaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/input"));
			newaddress.click();
			newaddress.isSelected();
			Thread.sleep(3000);
		}
		@Test (priority= 8)
		  //TEST CASE NO 8
		public void OrderSummary() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement selectaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div/div/input"));
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button"));

			selectaddress.click();
			nextbtn.click();
			Thread.sleep(3000);

		}
		@Test (priority= 9)
		  //TEST CASE NO 9
		public void OrderConfirm() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();
			Thread.sleep(3000);
			WebElement volume=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/div[1]/select/option[2]"));
			volume.click();
		
			Thread.sleep(3000);
			WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/div[3]/button"));
			addtocart.click();
			Thread.sleep(3000);
			
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement selectaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div/input"));
			selectaddress.click();
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button"));
			nextbtn.click();
			Thread.sleep(10000);
			WebElement placeorder=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div/div[2]/button"));
			placeorder.click();
			
			
			
			Thread.sleep(3000);
		}
		@Test (priority= 10)
		  //TEST CASE NO 10
		public void CancelConfirm() throws InterruptedException {
			
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();
			Thread.sleep(3000);
			WebElement volume=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/div[1]/select/option[2]"));
			volume.click();
		
			Thread.sleep(3000);
			WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/div[3]/button"));
			addtocart.click();
			Thread.sleep(3000);
			
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement selectaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div/input"));
			selectaddress.click();
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button"));
			nextbtn.click();
			Thread.sleep(10000);
			WebElement home=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/span[1]/span"));
	    	home.click();
	    	Thread.sleep(3000);
		}
		
}
