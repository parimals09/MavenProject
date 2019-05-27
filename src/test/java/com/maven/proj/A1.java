package com.maven.proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A1 
{
	
@Test
public void loginTest()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Browser_Drivers\\Latest\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//System.out.println("Hi");
	driver.get("https:\\www.facebook.com");
	driver.quit();
}
}