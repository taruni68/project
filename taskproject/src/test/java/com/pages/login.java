package com.pages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	WebDriver driver;
	By Administration= By.xpath("/html/body/table/tbody/tr[2]/td[3]/a/img");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
//To launch the website
	public void launch(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
						//To launch firefox Browser
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		// To maximize the window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	}
//To open the website
	public void open()
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
		driver.findElement(Administration).click();
	}
//To enter username and password
	public void Username_Password() throws InterruptedException, IOException
	{
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
	}
//To click on login button
	public void click()
	{
	driver.findElement(Login).click();
	}
}
