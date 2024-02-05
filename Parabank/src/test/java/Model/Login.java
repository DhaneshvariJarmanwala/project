package Model;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
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
	public void clicklogin(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Thread.sleep(2000);
		
		System.out.println("Welcome....");
			
		}
	
	}		



