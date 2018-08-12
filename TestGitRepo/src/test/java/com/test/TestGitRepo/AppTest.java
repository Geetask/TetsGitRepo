package com.test.TestGitRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    {
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.gecko.driver", "F:\\software\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver","Downloads:\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().wait(60);
		  driver.get("http://www.facebook.com");
		  
	  }
}
