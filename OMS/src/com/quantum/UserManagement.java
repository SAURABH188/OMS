package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UserManagement {
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
	 //Test Case 117
	  public void EnableUser() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"custom-switch\"]")));
		  element.click();
		  
		 
		Thread.sleep(3000);

	}
	@Test (priority= 3)
	 //Test Case 118
	  public void EditUserFirstName() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  WebElement firstname= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[1]/div/input"));
		  firstname.clear();
		  firstname.sendKeys("FirstNameUpdated");
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);

	}
	@Test (priority= 4)
	 //Test Case 118
	  public void EditUserLastName() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  WebElement lastname= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[2]/div/input"));
		  lastname.clear();
		  lastname.sendKeys("LastNameUpdated");
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);
	}
	@Test (priority= 5)
	 //Test Case 118
	  public void EditUserEmail() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  WebElement emaill= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[3]/div/input"));
		  emaill.clear();
		  emaill.sendKeys("Manufacturee123@gmail.com");
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);
	}
	@Test (priority= 6)
	 //Test Case 118
	  public void EditUserMobile() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  WebElement mobile= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[4]/div/input"));
		  mobile.clear();
		  mobile.sendKeys("7769889999");
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);
	}
	@Test (priority= 7)
	 //Test Case 118
	  public void EditDistributorEmail() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  WebElement distributorEmail= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[5]/div/input"));
		  distributorEmail.clear();
		  distributorEmail.sendKeys("Disemail123@gmail.com");
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);
	}
	@Test (priority= 8)
	 //Test Case 118
	  public void EditDistributorName() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  WebElement distributorName= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[6]/div/input"));
		  distributorName.clear();
		  distributorName.sendKeys("DisNamee");
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);
	}
	@Test (priority= 9)
	 //Test Case 118
	  public void EditDistributorMobile() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);
	}
	@Test (priority= 10)
	 //Test Case 118
	  public void EditUserAdminRole() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		 
		  
		  WebElement role= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[8]/div/select"));
		  role.click();
		  Thread.sleep(3000);
		  WebElement adminrole= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[8]/div/select/option[3]"));
		  adminrole.click();
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  Thread.sleep(3000);
	}
	@Test (priority= 11)
	 //Test Case 121
	  public void DisableUser() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  //Edit User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[2]/td[7]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"custom-switch\"]")));
		  element.click();
		  
		 
		Thread.sleep(3000);

	}
	@Test (priority= 12)
	 //Test Case 125
	  public void ManufactureLogin() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);


	}
	@Test (priority= 13)
	 //Test Case 126
	  public void ManufactureLoginwithInvalidDetails() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter incorrect credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("passwordd");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);


	}
	@Test (priority= 14)
	 //Test Case 127

	  public void AddUser() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Order page
		  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
		  UserBtn.click();
		  Thread.sleep(3000);
		  
		  WebElement AdduserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
		  AdduserBtn.click();
		  
		  //Enter the details
		  WebElement firstname= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
		  WebElement Lastname= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
		  WebElement emailfield= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[3]/div/input"));
		  WebElement Mobile= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[5]/div/input"));
          WebElement passwordfield= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[4]/div/input"));
		  WebElement DisEmail= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[6]/div/input"));
		  WebElement DisName= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[7]/div/input"));
		  WebElement DisPhone= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[8]/div/input"));

		  firstname.sendKeys("FirstName");
		  Lastname.sendKeys("LastName");
		  emailfield.sendKeys("Manufacture123@gmail.com");
		  Mobile.sendKeys("7769880181");
		  passwordfield.sendKeys("Saurabh@7");
		  DisEmail.sendKeys("DisEmail123@gmail.com");
		  DisName.sendKeys("DisName");
		  DisPhone.sendKeys("7769889017");
		  Thread.sleep(3000);
		 
		  WebElement submitBTn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
		  submitBTn.click();
		  
	
		Thread.sleep(3000);


	}
	@Test (priority= 15)
	  //TEST CASE NO 128
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
	  @Test (priority= 16)
	  //TEST CASE NO 133 
	  public void SuccessfulLogoutt()  {
	
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[7]/a/p")).click();
	  }
		@Test (priority= 17)
		  //TEST CASE NO 134 
	 
		  public void UserReactivation() throws InterruptedException  {
			
			  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

		        // Enter correct credentials
			  email.sendKeys("admin@gmail.com");
			  password.sendKeys("password");

		        // Click on the login button
			  SignIn.click();
			  Thread.sleep(3000);
			  //Open Order page
			  WebElement UserBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[4]/a/p"));
			  UserBtn.click();
			  Thread.sleep(3000);
			  
			  WebDriverWait wait = new WebDriverWait(driver, 10);
			  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"custom-switch\"]")));
			  element.click();
			  
			 
			Thread.sleep(3000);

		}
}
}
