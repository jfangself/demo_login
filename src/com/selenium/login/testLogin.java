package com.selenium.login;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testLogin {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.get("http://www.baidu.com");
	  
	  WebElement loginbtn = driver.findElement(By.partialLinkText("登录"));
	  //WebElement loginbtn = driver.findElement(By.name("tj_login"));
	  System.out.println(loginbtn.getText());
	  loginbtn.click();
	  
	  WebElement uname = driver.findElement(By.id("TANGRAM__PSP_8__userName"));
	  uname.sendKeys("18668049021");
	  
	  WebElement pwd = driver.findElement(By.id("TANGRAM__PSP_8__password"));
	  pwd.sendKeys("325810");
	  
	  WebElement submit = driver.findElement(By.id("TANGRAM__PSP_8__submit"));
	  submit.click();
	  
	  String loginame=driver.findElement(By.id("s_username_top")).getText();
	  System.out.println(loginame);
	  
	  AssertJUnit.assertEquals("七七ranran", loginame);
	  
  }


  @BeforeTest
  public void beforeTest() {
	  
	   driver =new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
