package com.maven.proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A2 
{
	@Test
	public void getTitleTest()
	{
	System.setProperty("webdriver.gecko.driver", "E:\\Browser_Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
driver.get("https:\\www.google.com");
driver.quit();
		//System.out.println("Hello");
	}
}
