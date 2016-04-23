package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	private WebDriver driver;
	private WebElement firstName;
	private WebElement lastName;
	private WebElement userName;
	private WebElement password;
	private WebElement confirmPassword;
	private WebElement registerButton;
	
	
	public RegisterPage(WebDriver driver){
		this.driver = driver;
	}
	
	private void mapElements(){
		this.firstName = driver.findElement(By.name("firstName"));
		this.lastName = driver.findElement(By.name("lastName"));
		this.userName = driver.findElement(By.id("email"));
		this.password = driver.findElement(By.name("password"));
		this.confirmPassword = driver.findElement(By.name("confirmPassword"));
		this.registerButton = driver.findElement(By.name("register"));		
	}
	
	public RegisterConfirmationPage registerUser(String firstName, String lastName, String email, String password, String confirmPassword){
	    mapElements();
		this.firstName.clear();
		this.firstName.sendKeys("Laisa");
		this.lastName.clear();
		this.lastName.sendKeys("Bezerra");
		this.userName.clear();
		this.userName.sendKeys("laisa");
		this.password.clear();
		this.password.sendKeys("senha");
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys("senha");
		this.registerButton.click();
	    
	    return new RegisterConfirmationPage(this.driver);
	}
}
