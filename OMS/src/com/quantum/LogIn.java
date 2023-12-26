package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LogIn {
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
	  public void SuccessfulWholesalerLogin() throws InterruptedException  {
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
	  }
	  @Test (priority= 3)
	  //TEST CASE NO 3
	  public void UnSuccessfulWholesalerLogin() throws InterruptedException  {
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
			passwordField.sendKeys("Saurabh@18");
			submitBtn.click();
			
			Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/form/button")).click();
}
	  @Test (priority= 4)
	  //TEST CASE NO 4
	  public void AcessWithoutLoginForWholesalerLogin() throws InterruptedException  {
		  WebElement loginBtn= driver.findElement(By.cssSelector(" .checkout-link"));
			Thread.sleep(3000);
			WebElement US= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input"));
			US.click();
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
			Submit.click();
			
			
			loginBtn.click();
			Thread.sleep(3000);
			
			
			WebElement submitBtn=driver.findElement(By.xpath("//button[@type='submit']"));
			
		
			submitBtn.click();
			
			Thread.sleep(3000);
	  }
	  @Test (priority= 5)
	  //TEST CASE NO 5 
	  public void SuccessfulLogoutForWholesalerLogin() throws InterruptedException  {
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
			
			WebElement Logout=driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div[2]/a[4]/div"));
			Logout.click();
			Thread.sleep(3000);

	  }
	  
		  @Test (priority= 6)
		  //TEST CASE NO 6
		  public void InactiveAccountLoginWholesalerLogin() throws InterruptedException  {
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
				passwordField.sendKeys("Saurabhs@7");
				submitBtn.click();
				
				Thread.sleep(3000);
		  }
	
		  }		  

			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
					  

