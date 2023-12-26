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
	public void AccountPageOpen() throws InterruptedException {
		
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
		
	}
	@Test (priority= 3)
	  //TEST CASE NO 3
	public void AccountDetailsEdit() throws InterruptedException {
		
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
	
		WebElement firstName=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		WebElement lastName=driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		WebElement mobileNub=driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		WebElement updatebtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[2]/form/div[3]/button"));
		
		firstName.clear();
		lastName.clear();
		mobileNub.clear();
		Thread.sleep(3000);
		
		firstName.sendKeys("Saurabhhh");
		lastName.sendKeys("Kumbharr");
		mobileNub.sendKeys("7769889011");
		updatebtn.click();
	
		Thread.sleep(3000);
	
	
	}
	@Test (priority= 4)
	  //TEST CASE NO 4
	public void PasswordDetailsEdit() throws InterruptedException {
		
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
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement ConfirmpassField=driver.findElement(By.xpath("//*[@id=\"confirm-password\"]"));
		WebElement submitpassword=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/button"));
		
		password.sendKeys("Saurabh@7");
		ConfirmpassField.sendKeys("Saurabh@7");
		submitpassword.click();
	
		Thread.sleep(3000);
	}
	@Test (priority= 5)
	  //TEST CASE NO 5
	public void VerifyAccountInformation() throws InterruptedException {
		
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
	}
	@Test (priority= 6)
	  //TEST CASE NO 6
	public void InvalidAccountDetailsEdit() throws InterruptedException {
		
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
	
		WebElement firstName=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		WebElement lastName=driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		WebElement mobileNub=driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		WebElement updatebtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[2]/div[2]/form/div[3]/button"));
		
		firstName.clear();
		lastName.clear();
		mobileNub.clear();
		Thread.sleep(3000);
		
		firstName.sendKeys("Saurabhhh");
		lastName.sendKeys("Kumbharr");
		mobileNub.sendKeys("776988901163732389283");
		updatebtn.click();
	
		Thread.sleep(3000);
	}
	@Test (priority= 7)
	  //TEST CASE NO 7
	public void AccountPersistance() throws InterruptedException {
		
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
	// Account Page Open
		WebElement Logout=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[3]/div"));
		Logout.click();
	//Logout completed
		
        WebElement loginBtnn= driver.findElement(By.cssSelector(" .checkout-link"));
		
		loginBtnn.click();
		Thread.sleep(3000);
		
		WebElement emaildFieldd=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement passwordFieldd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement submitBtnn=driver.findElement(By.xpath("//button[@type='submit']"));
		
		emaildFieldd.sendKeys("saurabh187.quantumitinnovation@gmail.com");
		passwordFieldd.sendKeys("Saurabh@7");
		submitBtnn.click();
		
		Thread.sleep(3000);
		WebElement accountIconn=driver.findElement(By.xpath("//a[@href='/home/my-account']"));
		accountIconn.click();
		
		Thread.sleep(3000);
	}	
	@Test (priority= 8)
	  //TEST CASE NO 8
	public void AddNewDeliveryAddress() throws InterruptedException {
		
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
    	
    	
	}
	@Test (priority= 9)
	  //TEST CASE NO 9
	public void DeleteDeliveryAddress() throws InterruptedException {
		
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
  	
  	WebElement DltaddressBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/button[2]"));
  	DltaddressBtn.click();
  	WebElement DltBtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
	DltBtn.click();
	Thread.sleep(3000);
  }
	@Test (priority= 10)
	  //TEST CASE NO 10
	public void EditStreetAddress() throws InterruptedException {
		
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
  	//Address Page Open
  	
	WebElement editBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button[1]"));
  	editBtn.click();
  	
  	WebElement streetupt=driver.findElement(By.xpath("//*[@id=\"exampleForm.ControlInput1\"]"));
  	streetupt.clear();
  	streetupt.sendKeys("4234");
  	WebElement savebtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
  	savebtn.click();
  	Thread.sleep(3000);
  	
  	
	}
	@Test (priority= 11)
	  //TEST CASE NO 11
	public void EditCityAddress() throws InterruptedException {
		
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
	//Address Page Open
	
	WebElement editBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button[1]"));
	editBtn.click();
	
	WebElement cityfield=driver.findElement(By.name("town"));
	cityfield.clear();
	cityfield.sendKeys("Pune");
	WebElement savebtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
	savebtn.click();
	Thread.sleep(3000);
	}	
	@Test (priority= 12)
	  //TEST CASE NO 12
	public void EditProvinceAddress() throws InterruptedException {
		
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
	//Address Page Open
	
	WebElement editBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button[1]"));
	editBtn.click();
	
	WebElement provincefield=driver.findElement(By.name("province"));	
	provincefield.clear();
	provincefield.sendKeys("Katraj Pune ");
	WebElement savebtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
	savebtn.click();
	Thread.sleep(3000);
	}
	@Test (priority= 13)
	  //TEST CASE NO 13
	public void EditPostalcodeAddress() throws InterruptedException {
		
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
	//Address Page Open
	
	WebElement editBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button[1]"));
	editBtn.click();
	
	WebElement postalcodefield=driver.findElement(By.name("post_code"));
	postalcodefield.clear();
	postalcodefield.sendKeys("4160012 ");
	WebElement savebtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
	savebtn.click();
	Thread.sleep(3000);
	}
	@Test (priority= 14)
	  //TEST CASE NO 14
	public void SetDefaultAddress() throws InterruptedException {
		
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

//Scroll down by 500 pixels
js.executeScript("window.scrollBy(0,1000)");

	Thread.sleep(3000);
	
	WebElement addressBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div[2]/div[2]/div/div[2]/div/button"));
	addressBtn.click();
	
	Thread.sleep(3000);
	//Address Page Open
	
	WebElement editBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/button[1]"));
	editBtn.click();
	WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"formBasicCheckbox\"]"));
	
	checkbox.click();
	WebElement submitbtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
	submitbtn.click();
	Thread.sleep(3000);
	}
	@Test (priority= 15)
	  //TEST CASE NO 15
	public void LogoutFromAccountPage() throws InterruptedException {
		
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
		WebElement Logoutbtn=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[3]/div"));
		Logoutbtn.click();
	}
}