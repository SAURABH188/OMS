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

public class Shop {
	public class MyAccount {
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
		public void ProductPageOpen() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();
			
			Thread.sleep(3000);
			
		}
		@Test (priority= 3)
		  //TEST CASE NO 3
		public void ProductDetails() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[1]/div[1]/div/img"));
			product.click();
			Thread.sleep(3000);
	}
		@Test (priority= 4)
		  //TEST CASE NO 4
		public void GoToCart() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
	}
		@Test (priority= 5)
		  //TEST CASE NO 5
		public void OrderWithoutLogin() throws InterruptedException {
			
	driver.get("https://oms-frontend.netlify.app/");
	Thread.sleep(3000);
	WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
	productpage.click();

	Thread.sleep(3000);
	WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div/div[2]/div/div[1]/div/img"));
	product.click();
	Thread.sleep(3000);
	
	WebElement SignInbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[2]/button"));
	SignInbtn.click();
	Thread.sleep(3000);
	
		}
		@Test (priority= 6)
		  //TEST CASE NO 6
		public void AddToCart() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[1]/div[1]/div/img"));
			product.click();
			WebElement Volume=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[1]/select/option[2]"));
			Volume.click();
			Thread.sleep(3000);

			WebElement Add=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div[2]/button"));
			Add.click();
			Thread.sleep(3000);
			
			
	}
		@Test (priority= 7)
		  //TEST CASE NO 7
		public void AddMultipleToCart() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[1]/div[1]/div/img"));
			product.click();
			WebElement Volume=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[1]/select/option[2]"));
			Volume.click();
			Thread.sleep(3000);

			WebElement Add=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div[2]/button"));
			Add.click();
			Thread.sleep(3000);
			WebElement addtoocart=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[2]/button"));
			addtoocart.click();
			Thread.sleep(3000);
		}	
		@Test (priority= 8)
		  //TEST CASE NO 8
		public void EmptyCart() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();


			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement delete1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div/div[1]"));
			delete1.click();
			WebElement delete2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[3]/div/div[3]/div/div/div[1]"));
			delete2.click();
			Thread.sleep(3000);
		}
		@Test (priority= 9)
		  //TEST CASE NO 9
		public void CartSummary() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[1]/div[1]/div/img"));
			product.click();
			WebElement Volume=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[1]/select/option[2]"));
			Volume.click();
			Thread.sleep(3000);

			WebElement Add=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div[2]/button"));
			Add.click();
			Thread.sleep(3000);
			WebElement home=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/span[1]/span"));
			home.click();
			Thread.sleep(3000);
			
			WebElement producttpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			producttpage.click();
			Thread.sleep(3000);
			WebElement Cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			Cart.click();
			Thread.sleep(3000);
					Thread.sleep(3000);
		}	
		@Test (priority= 10)
		  //TEST CASE NO 10
		public void UpdateCart() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement updatecart=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div[2]"));
			updatecart.click();
			Thread.sleep(3000);
	}
		@Test (priority= 11)
		  //TEST CASE NO 11
		public void RemoveCart() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			
			WebElement delete2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div[1]"));
			delete2.click();
			Thread.sleep(3000);
		}
		@Test (priority= 12)
		  //TEST CASE NO 12
		public void VerifyCheckout() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
		}
		@Test (priority= 12)
		  //TEST CASE NO 12
		public void CancelCheckout() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			WebElement Home=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/span[1]/span"));
			Home.click();
			Thread.sleep(3000);
			
		}
		@Test (priority= 12)
		  //TEST CASE NO 12
		public void OrderSummary() throws InterruptedException {
			Thread.sleep(3000);
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\\\\\\\"root\\\\\\\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement selectaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div/input"));
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button"));

			selectaddress.click();
			nextbtn.click();
			Thread.sleep(3000);

		}
		@Test (priority= 13)
		  //TEST CASE NO 13
		public void OrderConfirm() throws InterruptedException {
			Thread.sleep(3000);
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
			cart.click();
			Thread.sleep(3000);
			WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id=\\\\\\\"root\\\\\\\"]/div[2]/div/div[2]/div/button"));
			checkoutBtn.click();
			Thread.sleep(3000);
			
			WebElement selectaddress=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div/div/div[1]/div/input"));
			WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/button"));

			selectaddress.click();
			nextbtn.click();
			Thread.sleep(3000);
			WebElement placeorder=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div/div[2]/button"));
			placeorder.click();
			
			
			
			Thread.sleep(3000);
		}
		@Test (priority= 14)
		  //TEST CASE NO 14
		public void OrderStatus() throws InterruptedException {
			Thread.sleep(3000);
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
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
		@Test (priority= 15)
		  //TEST CASE NO 15
		public void OrderHistory() throws InterruptedException {
			Thread.sleep(3000);
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
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
		@Test (priority= 16)
		  //TEST CASE NO 16 ( Not Included )
		public void VerifyPrice() throws InterruptedException {
			
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
		}
		@Test (priority= 17)
		  //TEST CASE NO 17
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
		@Test (priority= 18)
		  //TEST CASE NO 18
		public void ProductImage() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div/div/div[1]/div[1]/div/img"));
			product.click();
			Thread.sleep(3000);
	}
		@Test (priority= 19)
		  //TEST CASE NO 19
		public void ProductFilter() throws InterruptedException {
			
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
			WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
			productpage.click();

			Thread.sleep(3000);
			WebElement filter=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[1]/aside/ul/li[2]/span[1]"));
			filter.click();
			Thread.sleep(3000);
			
			
	}
}
}