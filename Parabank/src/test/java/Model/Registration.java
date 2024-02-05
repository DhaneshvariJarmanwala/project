package Model;



import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	public void enterfirstname(WebDriver driver,String firstname) throws InterruptedException
	{
		driver.findElement(By.id("customer.firstName")).sendKeys(firstname);
		Thread.sleep(2000);
	}
	public void enterlastname(WebDriver driver,String lastName) throws InterruptedException
	{
		driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
		Thread.sleep(2000);
	}
	
	public void enterAddress(WebDriver driver,String Address) throws InterruptedException
	{
		driver.findElement(By.id("customer.address.street")).sendKeys(Address);
		Thread.sleep(2000);
	}
	public void entercity(WebDriver driver,String city) throws InterruptedException
	{
		driver.findElement(By.id("customer.address.city")).sendKeys(city);
		Thread.sleep(2000);
	}
	public void enterstate(WebDriver driver,String State) throws InterruptedException
	{
		driver.findElement(By.id("customer.address.state")).sendKeys(State);
		Thread.sleep(2000);
	}
	public void enterzipcode(WebDriver driver,String zipcode) throws InterruptedException
	{
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipcode);
		Thread.sleep(2000);
	}
	public void enterphonenumber(WebDriver driver,String phonenumber) throws InterruptedException
	{
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(phonenumber);
		Thread.sleep(2000);
	}
	public void enterssn(WebDriver driver,String ssn) throws InterruptedException
	{
		driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
		Thread.sleep(2000);
	}
	public void enterusername(WebDriver driver,String username) throws InterruptedException
	{
		driver.findElement(By.id("customer.username")).sendKeys(username);
		Thread.sleep(2000);
	}
	
	public void enterpassword(WebDriver driver,String password) throws InterruptedException
	{
		driver.findElement(By.id("customer.password")).sendKeys(password);
		Thread.sleep(2000);
	}
	public void enterrepeatedpassword(WebDriver driver,String repeatepassword) throws InterruptedException
	{
		driver.findElement(By.id("repeatedPassword")).sendKeys(repeatepassword);
		Thread.sleep(2000);
	}
	
	public void clickregister(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
			}
	public void eneterloginname(WebDriver driver,String eneterloginname) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(eneterloginname);
		Thread.sleep(2000);
	}
	public void eneterloginpassword(WebDriver driver,String eneterloginpassword) throws InterruptedException
	{
		driver.findElement(By.name("password")).sendKeys(eneterloginpassword);
		Thread.sleep(2000);
	}
	public void clickbutton(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		
		
}}
