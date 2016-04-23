package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	private WebElement registerLink;
	private WebElement signOnLink;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public RegisterPage registerUser(){
		this.registerLink = this.driver.findElement(By.linkText("REGISTER"));
		this.registerLink.click();
		return new RegisterPage(this.driver);
	}
	
	public SignOnPage signOn(){
		this.signOnLink = this.driver.findElement(By.linkText("SIGN-ON"));
		this.signOnLink.click();
		return new SignOnPage(this.driver);
	}

}
