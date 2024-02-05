package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sidemenu {
public void Service(WebDriver driver) throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);
}
	public void Products(WebDriver driver) throws InterruptedException {	
	
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
	Thread.sleep(2000);
	
	}
	
	public void Location(WebDriver driver) throws InterruptedException {
		
	
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
	Thread.sleep(2000);
	}
	
	public void Adminpage(WebDriver driver) throws InterruptedException {
		
	
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
	Thread.sleep(2000);
	
	}
}
