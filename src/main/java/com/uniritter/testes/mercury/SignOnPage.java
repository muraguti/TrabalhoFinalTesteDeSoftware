package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOnPage {
private WebDriver driver;
private WebElement userName;
private WebElement password;
private WebElement loginButton;
	
	public SignOnPage(WebDriver driver){
		this.driver = driver;
	}
	
	private void mapElements(){
	    this.userName = driver.findElement(By.name("userName"));
	    this.password = driver.findElement(By.name("password"));
	    this.loginButton = driver.findElement(By.name("login"));
	}
	
	public UserHomePage signOnUser(String userName, String password)
	{
		mapElements();
		this.userName.clear();
		this.userName.sendKeys(userName);
		this.password.clear();
		this.password.sendKeys(password);
		this.loginButton.click();
		return new UserHomePage(this.driver);
	}
	
}
