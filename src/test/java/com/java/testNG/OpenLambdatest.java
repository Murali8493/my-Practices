package com.java.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLambdatest {

	  WebDriver driver;
	    @BeforeTest
	    void setup() {
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("--no-sandbox"); //Bypass OS security model   
	    	options.addArguments("--start-maximized");
	    	options.addArguments("--disable-dev-shm-usage");
	   // 	options.addArguments("--headless");
	        WebDriverManager.chromedriver().setup();
	        
	        driver = new ChromeDriver(options);
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
