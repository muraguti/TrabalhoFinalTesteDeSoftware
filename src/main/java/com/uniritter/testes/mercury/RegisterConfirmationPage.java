package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterConfirmationPage {
	private WebDriver driver;
	private WebElement welcomeLabel;
	private WebElement noteLabel;

	public RegisterConfirmationPage(WebDriver driver) {
		this.driver = driver;
		this.welcomeLabel = this.driver.findElement(By.cssSelector("b"));
		this.noteLabel = this.driver.findElement(By.cssSelector("a > font > b"));
	}
	
	public WebElement getWelcomeLabel(){
		return this.welcomeLabel;
	}
	
	public WebElement getNoteLabel(){
		return this.noteLabel;
	}
}
