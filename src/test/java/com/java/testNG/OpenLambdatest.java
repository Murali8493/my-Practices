package com.java.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLambdatest {

	  WebDriver driver;
	    @BeforeTest
	    void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	 
	    
	    @Test
	    void checkTheUrl() {
	        driver.get("https://ecommerce-playground.lambdatest.io/");
	        String url = driver.getCurrentUrl();
	        Assert.assertTrue(url.contains("lambdatest"));
	    }
	 
	    @AfterTest
	    void teardown() {
	        driver.quit();
	    }
}
