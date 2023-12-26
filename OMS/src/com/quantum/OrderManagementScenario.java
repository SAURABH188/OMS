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

public class OrderManagementScenario {
	public class LogIn {
		 WebDriver driver = null;
		@BeforeSuite
		 @Test (priority= 1)
		  //TEST CASE NO 1
		  		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  			  driver=new ChromeDriver(); 
		  			  driver.get("https://oms-admin.netlify.app/");
		  			Thread.sleep(3000);
		  			  driver.manage().window().maximize();
		  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
		  }
		@AfterSuite
		public void teardown() {
			  driver.close();
		}
		@Test (priority= 2)
		  //TEST CASE NO 136
		public void Placeorder() throws InterruptedException {
			
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
			WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div[3]/div/div[1]/div/img"));
			product.click();
			Thread.sleep(3000);
			WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[2]/button"));
			addtocart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement selectaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div/div/input"));
			selectaddress.click();
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button"));
			nextbtn.click();
			Thread.sleep(10000);
			WebElement placeorder=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div/div[2]/button"));
			placeorder.click();
			
			
			
			Thread.sleep(3000);
		}
		@Test (priority= 3)
		  //TEST CASE NO 137 ( Not Included )
		  public void OrderConfirmation() throws InterruptedException  {
			
			  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

		        // Enter incorrect credentials
			  email.sendKeys("admin@gmail.com");
			  password.sendKeys("password");

		        // Click on the login button
			  SignIn.click();
			  Thread.sleep(3000);
			  //Open Order page
			  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
			  orderBtn.click();
			  Thread.sleep(3000);
			  
			  WebElement vieworder= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[8]/button[1]"));
			  vieworder.click();
			  
			  Thread.sleep(3000);

			  WebElement option= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select"));
			  option.click();
			  Thread.sleep(3000);
			  WebElement paidoption= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select/option[3]"));
			  paidoption.click();
			  Thread.sleep(3000);
			  WebElement updateBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[2]/button"));
			  updateBtn.click();
			  
	}
		@Test (priority= 4)
		  //TEST CASE NO 139
		public void OrderDetail() throws InterruptedException {
			
			WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			
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
		  //TEST CASE NO 140
		  public void OrderDeliver() throws InterruptedException  {
			
			  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

		        // Enter incorrect credentials
			  email.sendKeys("admin@gmail.com");
			  password.sendKeys("password");

		        // Click on the login button
			  SignIn.click();
			  Thread.sleep(3000);
			  //Open Order page
			  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
			  orderBtn.click();
			  Thread.sleep(3000);
			  
			  WebElement vieworder= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[8]/button[1]"));
			  vieworder.click();
			  
			  Thread.sleep(3000);

			  WebElement option= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select"));
			  option.click();
			  Thread.sleep(3000);
			  WebElement paidoption= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select/option[3]"));
			  paidoption.click();
			  Thread.sleep(3000);
			  WebElement updateBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[2]/button"));
			  updateBtn.click();
			  
	}
		@Test (priority= 6)
		  //TEST CASE NO 142
		  public void OrderPaid() throws InterruptedException  {
			
			  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

		        // Enter incorrect credentials
			  email.sendKeys("admin@gmail.com");
			  password.sendKeys("password");

		        // Click on the login button
			  SignIn.click();
			  Thread.sleep(3000);
			  //Open Order page
			  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
			  orderBtn.click();
			  Thread.sleep(3000);
			  
			  WebElement vieworder= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[8]/button[1]"));
			  vieworder.click();
			  
			  Thread.sleep(3000);

			  WebElement option= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select"));
			  option.click();
			  Thread.sleep(3000);
			  WebElement paidoption= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[1]/div/select/option[3]"));
			  paidoption.click();
			  Thread.sleep(3000);
			  WebElement updateBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/div[2]/button"));
			  updateBtn.click();
			  
	}
		@Test (priority= 7)
		  //TEST CASE NO 144
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
	    	WebElement deliver=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/p"));
	    	deliver.isDisplayed();
	    	Thread.sleep(3000);
		}
		@Test (priority= 8)
		  //TEST CASE NO 146
		public void MultipleOrderStatus() throws InterruptedException {
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
	    	WebElement deliver=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/p"));
	    	deliver.isDisplayed();
	    	WebElement inprogress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/p"));
	    	inprogress.isDisplayed();
	    	Thread.sleep(3000);
		}
		@Test (priority= 9)
		  //TEST CASE NO 147
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
		@Test (priority= 10)
		  //TEST CASE NO 149
		public void NoStatusUpdate() throws InterruptedException {
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


	    	WebElement inprogress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/p"));
	    	inprogress.isDisplayed();
	    	Thread.sleep(3000);
		}
		@Test (priority= 11)
		  //TEST CASE NO 155 ( Not Included )
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
		}   
	}

