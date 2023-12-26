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

public class InventoryManagement {
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
		  //TEST CASE NO 156
		  public void ReviewProductListing() throws InterruptedException  {
			
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
			  
           		  Thread.sleep(3000);

		  }
		  @Test (priority= 3)
		  //TEST CASE NO 158
		  public void DescriptionOfProduct() throws InterruptedException  {
			
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
			  
			  WebElement productDetails= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[1]"));
			  productDetails.click();
			  
           		  Thread.sleep(3000);

		  }
		  @Test (priority= 4)
		  //TEST CASE NO 158 ( Not Included )
		  public void VerifyProductPrice() throws InterruptedException  {
			
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
			  
			  WebElement price= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[1]"));
			  price.click();
			  Thread.sleep(3000);
			  WebElement priceofproduct= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]"));
			  priceofproduct.isDisplayed();
           		  Thread.sleep(3000);

		  }
		  @Test (priority= 5)
		  //TEST CASE NO 160
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
			  WebElement AddQuantity= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[3]/button"));
			  AddQuantity.click();
			
		    	// Create an instance of JavascriptExecutor
		        JavascriptExecutor jss = (JavascriptExecutor) driver;

		        // Scroll down by 500 pixels
		        jss.executeScript("window.scrollBy(0,9000)");
		  
		            // Locate the element you want to click
		            WebElement elementToClick = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
   
		                    // Attempt to click the element
		                    elementToClick.click();
		                    Thread.sleep(3000);
		        }
		  @Test (priority= 6)
		  //TEST CASE NO 161
		  public void ProductUpdate() throws InterruptedException  {
			
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
		  @Test (priority= 7)
		  //TEST CASE NO 162
		  public void AddNewCategory() throws InterruptedException  {
			
			  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

		        // Enter incorrect credentials
			  email.sendKeys("admin@gmail.com");
			  password.sendKeys("password");

		        // Click on the login button
			  SignIn.click();
			  
			  //Open Category page
			  WebElement categoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[1]/a/p"));
			  categoryBtn.click();
			  
			  //Add New Category
			  WebElement addcategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div[1]/button"));
			  addcategoryBtn.click();
			  
			  WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/input"));
			  WebElement description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[2]/div/input"));
			  WebElement uploadimage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[4]/input"));
			  
			  name.sendKeys("SAurabhKumbhar");
			  description.sendKeys("New Catergory is added for Testing Purpose0");
			  uploadimage.sendKeys("C:\\Users\\SAURABH\\Desktop\\Profilee.jpg");
			  Thread.sleep(3000);
			  
			  WebElement submitBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
			  submitBtn.click();
			  
		        // Verify that an category is added succesfully
		        WebElement added = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]")); 

		        if (added.isDisplayed()) {
		            System.out.println("Test Passed: category is added succesfully");
		        } else {
		            System.out.println("Test Failed: category is not added ");
		        }
       		  Thread.sleep(3000);
}	
		  @Test (priority= 8)
		  //TEST CASE NO 163
		  public void AddingProductInExisitingCategory() throws InterruptedException  {
			
			//*[@id="root"]/div/div[3]/div/div/div[1]/div[1]/button
		        }
		  @Test (priority= 9)
		  //TEST CASE NO 163
		  public void AddingProductWithNewCategory() throws InterruptedException  {
			
			  WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			  WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			  WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

		        // Enter incorrect credentials
			  email.sendKeys("admin@gmail.com");
			  password.sendKeys("password");

		        // Click on the login button
			  SignIn.click();
			  
			  //Open Product page
			  WebElement productBtn= driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/div[2]/nav/ul/li[2]/a/p"));
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
			  WebElement SelectCategoryBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[3]/div/select/option[2]"));
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
			  WebElement QuantityAsPerCanada= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[1]/div/input"));
			  QuantityAsPerCanada.click();
			  QuantityAsPerCanada.sendKeys("100");
			  WebElement QuantityAsPerUS= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[2]/div/input"));
			  QuantityAsPerUS.click();
			  QuantityAsPerUS.sendKeys("60");
			  WebElement Price= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[3]/div/input"));
			  Price.click();
			  Price.sendKeys("10000");
			  WebElement Stock= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[4]/div/input"));
			  Stock.click();
			  Stock.sendKeys("1000");
			  Thread.sleep(3000);
			  WebElement AddQuantityBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[3]/div[5]/button"));
			  AddQuantityBtn.click();
		    	Thread.sleep(3000);
		    	// Create an instance of JavascriptExecutor
		        JavascriptExecutor jss = (JavascriptExecutor) driver;

		        // Scroll down by 500 pixels
		        jss.executeScript("window.scrollBy(0,6000)");
		  
		            // Locate the element you want to click
		            WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/button"));
   
		                    // Attempt to click the element
		                    elementToClick.click();
		                    Thread.sleep(3000);
		        }
}
}