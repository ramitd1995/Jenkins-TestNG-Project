package com.javacodegeeks.testng.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	 static WebDriver driver;

	   @Test()
	   public void loginFareye() throws InterruptedException {
		   
		   for(int i=0;i<10;i++)
		   {
		   
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		driver = new ChromeDriver(ops);
		driver.get("https://qatest.fareye.co");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.name("username"));
		username.click();
		username.clear();
		username.sendKeys("smoke4_admin");

		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[2]/button"));
		nextButton.click();
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.clear();
		password.sendKeys("admin");

		WebElement signinButton = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[3]/button"));
		signinButton.click();

		Thread.sleep(10000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		   }
	 	 	 	  
	   }
	 
	  
	
	

}
