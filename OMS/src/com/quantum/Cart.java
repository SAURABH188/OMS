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

public class Cart {
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
			public void RemoveSinglePrduct() throws InterruptedException {
				
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
				WebElement delete1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div[1]"));
				delete1.click();
				
				Thread.sleep(3000);
			}
			@Test (priority= 3)
			  //TEST CASE NO 3
			public void RemoveMultiplePrduct() throws InterruptedException {
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
				WebElement delete1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div[1]"));
				delete1.click();
				
				Thread.sleep(3000);
				WebElement delete2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[3]/div/div[3]/div/div/div[1]"));
				delete2.click();
				Thread.sleep(3000);
			}
			@Test (priority= 4)
			  //TEST CASE NO 4
			public void AddMultipleToCart() throws InterruptedException {
				
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
				WebElement product=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[1]/div[1]/div/img"));
				product.click();
				Thread.sleep(3000);
				WebElement productVolume=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/div[1]/select/option[4]"));
				productVolume.click();
				
				WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div/div/div[2]/div/div[3]/button"));
				addtocart.click();
				Thread.sleep(3000);
				WebElement home=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/span[1]/span"));
				home.click();
				Thread.sleep(3000);
				
				WebElement producttpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
				producttpage.click();
				Thread.sleep(3000);
				WebElement productt=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div/div/div[3]/div/div[1]/div/img"));
				productt.click();
				Thread.sleep(3000);
				WebElement addtoocart=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[2]/button"));
				addtoocart.click();
				Thread.sleep(3000);
			}	
			@Test (priority= 5)
			  //TEST CASE NO 5
			public void EmptyCart() throws InterruptedException {
				
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
				WebElement delete1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div/div[1]"));
				delete1.click();
				WebElement delete2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[3]/div/div[3]/div/div/div[1]"));
				delete2.click();
				Thread.sleep(3000);
			}
			@Test (priority= 6)
			  //TEST CASE NO 6
			public void RemoveCart() throws InterruptedException {
				
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
				passwordField.sendKeys("Saurabh@18");
				submitBtn.click();
				
				Thread.sleep(3000);
				WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
				productpage.click();

				Thread.sleep(3000);
				WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
				cart.click();
				Thread.sleep(3000);
				
				WebElement delete2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[3]/div/div[3]/div/div/div[1]"));
				delete2.click();
				Thread.sleep(3000);
			}
			@Test (priority= 6)
			  //TEST CASE NO 6
			public void AdjusttoZero() throws InterruptedException {
				
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
				passwordField.sendKeys("Saurabh@18");
				submitBtn.click();
				
				Thread.sleep(3000);
				WebElement productpage=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[1]/a[2]"));
				productpage.click();

				Thread.sleep(3000);
				WebElement cart=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[1]"));
				cart.click();
				Thread.sleep(3000);
				
				WebElement delete2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[3]/div/div[3]/div/div/div[1]"));
				delete2.click();
				Thread.sleep(3000);
			}
			@Test (priority= 7)
			  //TEST CASE NO 7
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
			@Test (priority= 8)
			  //TEST CASE NO 8
			public void OrderHistory() throws InterruptedException {
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
			
}
