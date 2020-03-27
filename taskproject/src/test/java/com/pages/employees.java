package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class employees {
	WebDriver driver;
	By employees=By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[1]/td/a");
	By addnewemployee=By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[27]/td[1]/a");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
//To launch the browser
	public void abcd(String browser) {
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
		driver.get("http://examples.codecharge.com/TaskManager/Login.php?Logout=True");
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();
	}
//To click on employees
	public void Employees()
	{
		driver.findElement(employees).click();
	}
//To click on addnewemployee
	public void addnewemployee() 
	{
		driver.findElement(addnewemployee).click();
	}

}
