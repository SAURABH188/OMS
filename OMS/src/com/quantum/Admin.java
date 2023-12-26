package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Admin {
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
		  //TEST CASE NO 2 
		  public void SuccessfulLogin() throws InterruptedException  {
			
			  driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("admin@gmail.com");
			  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
			  driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
			  Thread.sleep(3000);
		  }
		  @Test (priority= 3)
		  //TEST CASE NO 3
		  public void UnSuccessfulLogin() throws InterruptedException  {
			
			  driver.findElement(By.xpath("//*[@id=\\\"text\\\"]t")).sendKeys("saurabh187.quantumitinnovation@gmail.com");
			  driver.findElement(By.xpath("//*[@id=\\\"password\\\"]")).sendKeys("Saurabhss@7");
			  driver.findElement(By.xpath("//*[@id=\\\"login_submit\\\"]")).click();
			  Thread.sleep(3000);
	}
		  @Test (priority= 4)
		  //TEST CASE NO 4
		  public void AcessWithoutLoginForLogin()  {
			
			  driver.findElement(By.xpath("//*[@id=\\\"login_submit\\\"]")).click();
		  }  
		  @Test (priority= 5)
		  //TEST CASE NO 5 
		  public void SuccessfulLogout()  {
		
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[7]/a/p")).click();
		  }
		  
			  @Test (priority= 6)
			  //TEST CASE NO 6
			  public void InactiveAccountLogin()  {
		
				  driver.findElement(By.xpath("//*[@id=\\\"text\\\"]t")).sendKeys("saurabh187.quantumitinnovation@gmail.com");
				  driver.findElement(By.xpath("//*[@id=\\\"password\\\"]")).sendKeys("Saurabhss@7");
				  driver.findElement(By.xpath("//*[@id=\\\"login_submit\\\"]")).click();
			  }
		  
			  @Test (priority= 8)
			  //TEST CASE NO 26
			  public void ViewCategoryPage() throws InterruptedException  {
				  driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("admin@gmail.com");
				  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
				  driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a")).click();
			  }	  
			  @Test (priority= 9)
			  //TEST CASE NO 9
			  public void SearchCategoryPage() throws InterruptedException  {
				  driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("admin@gmail.com");
				  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
				  driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a")).click();
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/input")).sendKeys("demo");
				  Thread.sleep(3000);
			  }	  
			  @Test (priority= 10)
			  //TEST CASE NO 10
			  public void VerifyLoginFields() throws InterruptedException  {
				
				  driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("admin@gmail.com");
				  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
				 
				  Thread.sleep(3000);
			  }
			  @Test (priority= 11)
			  //TEST CASE NO 11
			  public void VerifyPasswordFields() throws InterruptedException  {
				
				  
				 WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
				 password.sendKeys("password");
				 password.isDisplayed();
				  Thread.sleep(3000);
			 }	
			  @Test (priority= 12)
			  //TEST CASE NO 12
			  public void VerifyLoginBtn() throws InterruptedException  {
				
				 WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");
				  SignIn.isEnabled();
				  Thread.sleep(3000);
	}	  
			  @Test (priority= 13)
			  //TEST CASE NO 13
			  public void VerifyInvalidCredentails() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("incorrectUsername");
				  password.sendKeys("incorrectPassword");

			        // Click on the login button
				  SignIn.click();

			        // Verify that an error message is displayed
			        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div")); 

			        if (errorMessage.isDisplayed()) {
			            System.out.println("Test Passed: Error message is displayed for incorrect credentials.");
			        } else {
			            System.out.println("Test Failed: Error message is not displayed for incorrect credentials.");
			        }

				  Thread.sleep(3000);
					
			  }
			  @Test (priority= 14)
			  //TEST CASE NO 14
			  public void VerifyvalidCredentails() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter correct credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();

			        // Verify that an error message is not displayed
			        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div")); 

			        if (errorMessage.isDisplayed()) {
			            System.out.println("Test Passed: Error message is displayed for incorrect credentials.");
			        } else {
			            System.out.println("Test Failed: Error message is not displayed for incorrect credentials.");
			        }

				  Thread.sleep(3000);
					
			  }
			  @Test (priority= 15)
			  //TEST CASE NO 15
			  public void HomepageaftersuccessfulLogin() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter correct credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();

			        // Verify that an homepage is  displayed
			        WebElement homepage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[1]/a/p")); 

			        if (homepage.isDisplayed()) {
			            System.out.println("Test Passed: Homepage is displayed after successful login");
			        } else {
			            System.out.println("Test Failed: Homepage is not displayed after valid credentails entered");
			        }

				  Thread.sleep(3000);
	}		 
			  @Test (priority= 15)
			  //TEST CASE NO 15
			  public void VerifyAccessHomepageWithoutLogin() throws InterruptedException  {
				
	
			        // Verify that an homepage is  displayed
			        WebElement homepage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[1]/a/p")); 

			        if (homepage.isDisplayed()) {
			            System.out.println("Test Passed: Homepage is accessible without Login  ");
			        } else {
			            System.out.println("Test Failed: Homepage is not accessible without Login");
			        }
				  Thread.sleep(3000);
	}		 
			  @Test (priority= 16)
			  //TEST CASE NO 11 
			  public void SuccessfulLoginn() throws InterruptedException  {
				
				  driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("admin@gmail.com");
				  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
				  driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
				  Thread.sleep(3000);
			  }
			  @Test (priority= 17)
			  //TEST CASE NO 12 
			  public void SuccessfulLogoutt()  {
			
				  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[7]/a/p")).click();
			  }
			  @Test (priority= 18)
			  //TEST CASE NO 27
			  public void AddNewCategory() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter correct credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  
				  //Add New Category
				  WebElement addcategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
				  addcategoryBtn.click();
				  
				  WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
				  WebElement description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
				  WebElement uploadimage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
				  Thread.sleep(7000);
				  name.sendKeys("SAurabhKumbhar");
				  description.sendKeys("New Catergory is added for Testing Purpose0");
				  Thread.sleep(7000);
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(30000);
				  WebElement submitBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
				  submitBtn.click();
				  Thread.sleep(7000);
			        // Verify that an category is added succesfully
			        WebElement added = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Passed: category is added succesfully");
			        } else {
			            System.out.println("Test Failed: category is not added ");
			        }
           		  Thread.sleep(3000);
	}	
			  @Test (priority= 19)
			  //TEST CASE NO 28
			  public void EditCategory() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  
				  //Edit Category
				  WebElement viewDetailsBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[5]/button[1]"));
				  viewDetailsBtn.click();
				  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
				  EditBtn.click();
				  Thread.sleep(3000);
				  WebElement name= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div[1]/div/input"));
				  WebElement description= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div[2]/div/input"));
				  WebElement uploadimage= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[2]/input"));
				  
				  name.sendKeys("SAurabhKumbharr");
				  description.sendKeys("Category is been edited for QA Testing");
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(3000);
				  WebElement submitBtn= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
				  submitBtn.click();
			        // Verify that an category is edited succesfully
			        WebElement added = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Passed: category is edited succesfully");
			        } else {
			            System.out.println("Test Failed: category edited is not successful ");
			        }
           		  Thread.sleep(3000);
	}		
			  @Test (priority= 20)
			  //TEST CASE NO 29
			  public void DeleteCategory() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  Thread.sleep(3000);
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  Thread.sleep(3000);
			// Delete the Category
				  WebElement deleteBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[5]/button[2]"));
				  deleteBtn.click();
				  Thread.sleep(3000);
				
				  Alert alert = driver.switchTo().alert();
				  
				  System.out.println("OK" + alert.getText());
				  alert.accept();
			        // Verify that an category is deleted succesfully
			        WebElement delete = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]")); 

			        if (delete.isDisplayed()) {
			            System.out.println("Test Passed: category is deleted succesfully");
			        } else {
			            System.out.println("Test Failed: category is not deleted ");
			        }
           		  Thread.sleep(3000);
	}		 
			  @Test (priority= 21)
			  //TEST CASE NO 33
			  public void AddCategoryWithDuplicateName() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  
				  //Add New Category
				  WebElement addcategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
				  addcategoryBtn.click();
				  
				  WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
				  WebElement description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
				  WebElement uploadimage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
				  
				  name.sendKeys("TERRA+ LOGO");
				  description.sendKeys("---");
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(3000);
				  WebElement submitBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
				  submitBtn.click();
				  Thread.sleep(3000);
			        // Verify that an category is not added with duplicate name
			        WebElement added = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Passed: category is not added");
			        } else {
			            System.out.println("Test Failed: category is added ");
			        }
           		  Thread.sleep(3000);
	}	
			  @Test (priority= 22)
			  //TEST CASE NO 39
			  public void AddCategoryWithEmptyName() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter correct credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  
				  //Add New Category
				  WebElement addcategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
				  addcategoryBtn.click();
				  
				  WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
				  WebElement description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
				  WebElement uploadimage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
				  
				  name.sendKeys("");
				  description.sendKeys("---");
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(3000);
				  WebElement submitBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
				  submitBtn.click();
				  Thread.sleep(3000);
			        // Verify that an category is not added with empty name
			        WebElement added = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Failed: category is added ");
			        } else {
			            System.out.println("Test Passed: category is not added ");
			        }
           		  Thread.sleep(3000);
	}	
			  @Test (priority= 23)
			  //TEST CASE NO 40
			  public void EditCategorywithEmptyName() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter correct credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  
				  //Edit Category
				  WebElement viewDetailsBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[5]/button[1]"));
				  viewDetailsBtn.click();
				  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
				  EditBtn.click();
				  Thread.sleep(3000);
				  WebElement name= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div[1]/div/input"));
				  WebElement description= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div[2]/div/input"));
				  WebElement uploadimage= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[2]/input"));
				  
				  name.sendKeys("");
				  description.sendKeys("Category is been edited for QA Testing");
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(3000);
				  WebElement submitBtn= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
				  submitBtn.click();
			        // Verify that an category is edited succesfully
			        WebElement added = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Passed: category is edited succesfully");
			        } else {
			            System.out.println("Test Failed: category edited is not successful ");
			        }
           		  Thread.sleep(3000);
	}		
			  @Test (priority= 24)
			  //TEST CASE NO 41
			  public void AddMultipleCategory() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  
				  //Add New Category
				  WebElement addcategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
				  addcategoryBtn.click();
				  
				  WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
				  WebElement description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
				  WebElement uploadimage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
				  
				  name.sendKeys("SAurabhKumbhar");
				  description.sendKeys("New Catergory is added for Testing Purpose0");
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(3000);
				  WebElement submitBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
				  submitBtn.click();
				  
				  WebElement addcategoryBtnn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
				  addcategoryBtnn.click();
				  
				  WebElement namee= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
				  WebElement descriptionn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
				  WebElement uploadimagee= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
				  Thread.sleep(3000);
				  namee.sendKeys("SAurabhKumbharr");
				  descriptionn.sendKeys("New Catergory is added for Testing Purposer0");
				  uploadimagee.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  
				  WebElement submitBtnn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
				  submitBtnn.click();
			        // Verify that an multiple category is added succesfully
			        WebElement added = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Passed: Multiple category is added succesfully");
			        } else {
			            System.out.println("Test Failed: Multiple category is not added ");
			        }
           		  Thread.sleep(3000);
	}	
			  @Test (priority= 25)
			  //TEST CASE NO 42
			  public void EditCategorywithSpecailCharacters() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  
				  //Edit Category
				  WebElement viewDetailsBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[5]/button[1]"));
				  viewDetailsBtn.click();
				  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
				  EditBtn.click();
				  Thread.sleep(3000);
				  WebElement name= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div[1]/div/input"));
				  WebElement description= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div[2]/div/input"));
				  WebElement uploadimage= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[2]/input"));
				  
				  name.sendKeys("@#^@&@");
				  description.sendKeys("Category is been edited for QA Testing");
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(3000);
				  WebElement submitBtn= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
				  submitBtn.click();
		
			        // Verify that an category is edited succesfully
			        WebElement added = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Failed: category edited is not successful ");
			        } else {
			            System.out.println("Test Passed: category is edited succesfully");
			        }
           		  Thread.sleep(3000);
	}	
			  @Test (priority= 26)
			  //TEST CASE NO 44
			  public void RefreshCategoryPage() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Category page
				  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  categoryBtn.click();
				  Thread.sleep(3000);
				  
				  //Refresh Category Page
				  driver.navigate().refresh();
				 
           		  Thread.sleep(3000);
	}		
			  @Test (priority= 27)
			  //TEST CASE NO 46
			  public void AddingProduct() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Product page
				  WebElement productBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
				  productBtn.click();
				  Thread.sleep(3000);
				  
				  //Add Product 
				  WebElement producttBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
				  producttBtn.click();
				  Thread.sleep(3000);
				  WebElement Namefield= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
				  Namefield.sendKeys("Product0");
				  WebElement Description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
				  Description.sendKeys("Description Of Product");
				  Thread.sleep(3000);
				  WebElement SelectCategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[3]/div/select"));
				  SelectCategoryBtn.click();
				  WebElement SelectOption= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[3]/div/select/option[4]"));
				  SelectOption.click();
				  Thread.sleep(3000);
				
				  
				  WebElement uploadimage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
				  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
				  Thread.sleep(3000);
				  
				  
				// Create an instance of JavascriptExecutor
			        JavascriptExecutor js = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        js.executeScript("window.scrollBy(0,9000)");
				  WebElement Quantity= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[1]/div/input"));
				  Quantity.click();
				  Quantity.sendKeys("100");
			
				
				  WebElement Stock= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[2]/div[1]/div/input"));
				  Stock.click();
				 
				  Thread.sleep(3000);
				  WebElement AddQuantityBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[3]/button"));
				  AddQuantityBtn.click();
			    	Thread.sleep(3000);
			    	// Create an instance of JavascriptExecutor
			        JavascriptExecutor jss = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jss.executeScript("window.scrollBy(0,9000)");
			  
			            // Locate the element you want to click
			            WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
       
			                    // Attempt to click the element
			                    elementToClick.click();
			                    Thread.sleep(3000);
			        }
			  @Test (priority= 28)
			  //TEST CASE NO 47
			  public void EditProduct() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Product page
				  WebElement productBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
				  productBtn.click();
				  Thread.sleep(3000);
				  
				  WebElement ViewBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[1]"));
				  ViewBtn.click();
				  Thread.sleep(3000);
				  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
				  EditBtn.click();
				  Thread.sleep(3000);
				  
				  WebElement Editname= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div[1]/div[1]/div/input"));
				  Editname.clear();
				  Editname.sendKeys("Product 1");
				  Thread.sleep(3000);
				  
				// Create an instance of JavascriptExecutor
			        JavascriptExecutor jss = (JavascriptExecutor) driver;

			        // Scroll down by 500 pixels
			        jss.executeScript("window.scrollBy(0,6000)");
			        
					  WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
					  Submit.click();
					  
					  // Verify that an category is edited succesfully
				        WebElement added = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]")); 

				        if (added.isDisplayed()) {
				            System.out.println("Test Failed: category edited is not successful ");
				        } else {
				            System.out.println("Test Passed: category is edited succesfully");
				        }
	           		  Thread.sleep(3000);

			  }
			  @Test (priority= 29)
			  //TEST CASE NO 48
			  public void DeleteProduct() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Product page
				  WebElement productBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
				  productBtn.click();
				  Thread.sleep(3000);
				  
				  WebElement deleteBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[2]"));
				  deleteBtn.click();
				  Thread.sleep(3000);
                   Alert alert = driver.switchTo().alert();
				  
				  System.out.println("OK" + alert.getText());
				  alert.accept();
				// Verify that an category is deleted succesfully
			        WebElement added = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Failed: category deleted is not successful ");
			        } else {
			            System.out.println("Test Passed: category is deleted succesfully");
			        }
         		  Thread.sleep(3000);
	}
			  @Test (priority= 30)
			  //TEST CASE NO 54
			  public void DeleteCancelPrompt() throws InterruptedException  {
				
				  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
				  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
				  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

			        // Enter incorrect credentials
				  email.sendKeys("admin@gmail.com");
				  password.sendKeys("password");

			        // Click on the login button
				  SignIn.click();
				  
				  //Open Product page
				  WebElement productBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
				  productBtn.click();
				  Thread.sleep(3000);
				  
				  WebElement deleteBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[2]"));
				  deleteBtn.click();
				  Thread.sleep(3000);
                   Alert alert = driver.switchTo().alert();
				  
				  System.out.println("OK" + alert.getText());
				  alert.dismiss();
				// Verify that an alert message is cancel succesfully
			        WebElement added = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]")); 

			        if (added.isDisplayed()) {
			            System.out.println("Test Failed: category is deleted succesfully\"");
			        } else {
			            System.out.println("Test Passed: category deleted is not successful ");
			        }
         		  Thread.sleep(3000);
	}@Test (priority= 31)
	  //TEST CASE NO 64
	  public void AddingProductwithHighImage() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter incorrect credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  
		  //Open Product page
		  WebElement productBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
		  productBtn.click();
		  Thread.sleep(3000);
		  
		  //Add Product 
		  WebElement producttBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
		  producttBtn.click();
		  Thread.sleep(3000);
		  WebElement Namefield= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
		  Namefield.sendKeys("Product0");
		  WebElement Description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
		  Description.sendKeys("Description Of Product");
		  Thread.sleep(3000);
		  WebElement SelectCategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[3]/div/select"));
		  SelectCategoryBtn.click();
		  WebElement SelectOption= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[3]/div/select/option[4]"));
		  SelectOption.click();
		  Thread.sleep(3000);
		
		  
		  WebElement uploadimage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[2]/input"));
		  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
		  Thread.sleep(3000);
		  
		  
		// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,9000)");
		  WebElement Quantity= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[1]/div/input"));
		  Quantity.click();
		  Quantity.sendKeys("100");
	
		
		  WebElement Stock= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[2]/div[1]/div/input"));
		  Stock.click();
		 
		  Thread.sleep(3000);
		  WebElement AddQuantityBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[3]/button"));
		  AddQuantityBtn.click();
	    	Thread.sleep(3000);
	    	// Create an instance of JavascriptExecutor
	        JavascriptExecutor jss = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        jss.executeScript("window.scrollBy(0,9000)");
	  
	            // Locate the element you want to click
	            WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));

	                    // Attempt to click the element
	                    elementToClick.click();
	                    Thread.sleep(3000);
	        }
	@Test (priority= 32)
	  //TEST CASE NO 66
	  public void OrderList() throws InterruptedException  {
		
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
		  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
		  orderBtn.click();
		  Thread.sleep(3000);
		
                  Thread.sleep(3000);
}
	@Test (priority= 33)
	  //TEST CASE NO 67 ( Not Included )
	  public void FilterPendingOrder() throws InterruptedException  {
		
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
		  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
		  orderBtn.click();
		  Thread.sleep(3000);
		  
		  WebElement filterBtn= driver.findElement(By.xpath("//*[@id=\"status\"]"));
		  filterBtn.click();
		  
		  Thread.sleep(3000);

		  WebElement Pendingoption= driver.findElement(By.xpath("//*[@id=\"status\"]/option[2]"));
		  Pendingoption.click();
		  
                Thread.sleep(3000);
}
	@Test (priority= 34)
	  //TEST CASE NO 67 ( Not Included )
	  public void FilterPaidOrder() throws InterruptedException  {
		
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
		  
		  WebElement filterBtn= driver.findElement(By.xpath("//*[@id=\"status\"]"));
		  filterBtn.click();
		  
		  Thread.sleep(3000);

		  WebElement Paidoption= driver.findElement(By.xpath("//*[@id=\"status\"]/option[3]"));
		  Paidoption.click();
		  
              Thread.sleep(3000);
}
	@Test (priority= 35)
	  //TEST CASE NO 67 ( Not Included )
	  public void FilterDeliverOrder() throws InterruptedException  {
		
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
		  
		  WebElement filterBtn= driver.findElement(By.xpath("//*[@id=\"status\"]"));
		  filterBtn.click();
		  
		  Thread.sleep(3000);

		  WebElement Deliveroption= driver.findElement(By.xpath("//*[@id=\"status\"]/option[4]"));
		  Deliveroption.click();
		  
            Thread.sleep(3000);
}
	@Test (priority= 36)
	  //TEST CASE NO 68
	  public void SearchOrder() throws InterruptedException  {
		
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
		  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
		  orderBtn.click();
		  Thread.sleep(3000);
		  
		  WebElement searchBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/input"));
		  searchBtn.sendKeys("#55a7e6");
		  
		  Thread.sleep(3000);

		  WebElement Search= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/span"));
		  Search.click();
		  
          Thread.sleep(3000);
}
	@Test (priority= 37)
	  //TEST CASE NO 69
	  public void PaginationPageOrder() throws InterruptedException  {
		
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
		  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
		  orderBtn.click();
		  Thread.sleep(3000);
		  
		driver.navigate().back();
	
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);

	}

	@Test (priority= 38)
	  //TEST CASE NO 70
	  public void OrderDetail() throws InterruptedException  {
		
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
		  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
		  orderBtn.click();
		  Thread.sleep(3000);
		  
		  WebElement orderdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[6]/button[1]"));
		  orderdetails.click();
		Thread.sleep(3000);

	}
	@Test (priority= 39)
	  //TEST CASE NO 72
	  public void LogoutfromOrderPage() throws InterruptedException  {
		
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
		  WebElement orderBtn= driver.findElement(By.xpath("//*[@id=\\\\\\\"root\\\\\\\"]/div/div[2]/div/div[2]/nav/ul/li[3]/a/p"));
		  orderBtn.click();
		  Thread.sleep(3000);
		  
		  WebElement logout= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[8]/a/p"));
		  logout.click();
		Thread.sleep(3000);

	}
	
	@Test (priority= 40)
	 //Test Case No 113
	  public void UserPage() throws InterruptedException  {
		
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
		  
	
		Thread.sleep(3000);

	}
	@Test (priority= 41)
	 
	  public void AddUser() throws InterruptedException  {
		//Test Case No 114
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
	@Test (priority= 42)
	 
	  public void SearchUser() throws InterruptedException  {
		//Test Case No 119
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
		  
		  WebElement Enterdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/input"));
		  Enterdetails.sendKeys("FirstName");
		  
		  WebElement SearchBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/div/div/span"));
		  SearchBtn.click();
		  Thread.sleep(3000);
	
		  WebElement result= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]"));
		  result.isDisplayed();
		  
		Thread.sleep(3000);

	}
	@Test (priority= 43)
	 
	  public void DisableUser() throws InterruptedException  {
		//Test Case No 116
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
	@Test (priority= 44)
	 
	  public void EnableUser() throws InterruptedException  {
		//Test Case No 117
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
	@Test (priority= 45)
	//Test Case No 118
	  public void VerifyUserDetailPage() throws InterruptedException  {
		//Test Case No 113
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
		  
		  //Open User Detials

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
		  Userdetails.click();
		  
		Thread.sleep(3000);

	}
	@Test (priority= 46)
	 
	  public void EditUserFirstName() throws InterruptedException  {
		//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
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
	@Test (priority= 47)
	 
	  public void EditUserLastName() throws InterruptedException  {
		//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
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
	@Test (priority= 48)
	//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
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
	@Test (priority= 49)
	//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
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
	@Test (priority= 50)
	//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
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
	@Test (priority= 51)
	//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
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
	@Test (priority= 52)
	//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
		  Thread.sleep(3000);
		  
		  WebElement mobileNo= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[7]/div/input"));
		  mobileNo.sendKeys("123728828");
		  
		  WebElement submitupdate= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  submitupdate.click();
		  
		  Thread.sleep(3000);
	}
	@Test (priority= 53)
	//Test Case No 115
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

		  WebElement Userdetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[8]/button[1]"));
		  Userdetails.click();
		  Thread.sleep(7000);
		  WebElement EditBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[1]/div[2]"));
		  EditBtn.click();
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
	@Test (priority= 54)
	//Test Case No 115
	  public void DeleteUser() throws InterruptedException  {
		
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
		  
		  //Delete User 

		
		  WebElement DeleteBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[4]/td[8]/button[2]"));
		  DeleteBtn.click();
		  Thread.sleep(3000);
		  Alert alert = driver.switchTo().alert();
		  
		  System.out.println("OK" + alert.getText());
		  alert.accept();
		  Thread.sleep(3000);
		  
	
	}
	@Test (priority= 55)
	 //Test Case No 76
	  public void SendMessage() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Chat Page
		  WebElement Chats= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
		  Chats.click();
		  Thread.sleep(3000);
		  
		  //Send Message

		
		  WebElement SelectUser= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]"));
		  SelectUser.click();
		  Thread.sleep(3000);
		  WebElement SelectField= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[3]/div[2]/div/textarea"));
		  SelectField.click();
		  SelectField.sendKeys("Hello");
		  
		  WebElement Send= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[3]/div[2]/div/div/button"));
		  Send.click();
		  
		  Thread.sleep(3000);
		  
	
	}
	@Test (priority= 56)
	 //Test Case No 77
	  public void RecieveMessage() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Chat Page
		  WebElement Chats= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
		  Chats.click();
		  Thread.sleep(3000);
	
	}
	@Test (priority= 57)
	 //Test Case No 78
	  public void OrderEnquiry() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Chat Page
		  WebElement Chats= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
		  Chats.click();
		  Thread.sleep(3000);
		  
		  //Send Message

		
		  WebElement SelectUser= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]"));
		  SelectUser.click();
		  Thread.sleep(3000);
		  WebElement SelectField= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[3]/div[2]/div/textarea"));
		  SelectField.click();
		  SelectField.sendKeys("Hello");
		  
		  WebElement Send= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[3]/div[2]/div/div/button"));
		  Send.click();
		  
		  Thread.sleep(3000);
		  
	
	}
	@Test (priority= 58)
	 //Test Case No 79
	  public void GeneralEnquiry() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open Chat Page
		  WebElement Chats= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
		  Chats.click();
		  Thread.sleep(3000);
		  
		  //Send Message

		
		  WebElement SelectUser= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]"));
		  SelectUser.click();
		  Thread.sleep(3000);
		  WebElement SelectField= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[3]/div[2]/div/textarea"));
		  SelectField.click();
		  SelectField.sendKeys("Hello");
		  
		  WebElement Send= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[3]/div[2]/div/div/button"));
		  Send.click();
		  
		  Thread.sleep(3000);
		  
	
	}
	@Test (priority= 59)
	 //Test Case No 96
	  public void AddFAQ() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open FAQ Page
		  WebElement FAQ= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[6]/a/p"));
		  FAQ.click();
		  Thread.sleep(3000);
		  
		  WebElement Add= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
		  Add.click();
		  Thread.sleep(3000);
		  
		  WebElement Question= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
		  Question.click();
		  Question.sendKeys("This Is my Question");
		  Thread.sleep(3000);
		  
		  WebElement Answer= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
		  Answer.click();
		  Answer.sendKeys("This Is my Answer");
		  Thread.sleep(3000);
		  
		  WebElement Submit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
		  Submit.click();
		  Thread.sleep(3000);

		  
	} 
	@Test (priority= 60)
	 //Test Case No 97
	  public void EditFAQ() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open FAQ Page
		  WebElement FAQ= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[6]/a/p"));
		  FAQ.click();
		  Thread.sleep(3000);
		  
		  WebElement Edit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/svg[1]/path"));
		  Edit.click();
	
		  Thread.sleep(3000);
		  
		  
		  WebElement EditAns= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div/div/div[2]/div/input"));
		  EditAns.click();
		  EditAns.sendKeys("Ans");
		  Thread.sleep(3000);
		  
		  WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
		  Submit.click();
		  Thread.sleep(3000);
	}
	@Test (priority= 61)
	 //Test Case No 98
	  public void DeleteFAQ() throws InterruptedException  {
		
		  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
		  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

	        // Enter correct credentials
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("password");

	        // Click on the login button
		  SignIn.click();
		  Thread.sleep(3000);
		  //Open FAQ Page
		  WebElement FAQ= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[6]/a/p"));
		  FAQ.click();
		  Thread.sleep(3000);
		  
		  WebElement Edit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/svg[2]/path"));
		  Edit.click();
	
		  Thread.sleep(3000);

	}
	
	}
}
			

			        
			  
	

           		  
           		  
		
	
