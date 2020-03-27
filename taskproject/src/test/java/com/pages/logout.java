package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logout {
	WebDriver driver;
	By administration=By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a/img");
	By logout=By.xpath("/html/body/p/a");
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
//To click on administration
	public void administration() {
		driver.findElement(administration).click();
	}
//To click on logout button
	public void Logout() {
		driver.findElement(logout).click();
	}
}
