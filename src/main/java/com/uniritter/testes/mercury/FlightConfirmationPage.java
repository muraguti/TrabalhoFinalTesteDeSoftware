package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightConfirmationPage {
	
	private WebDriver driver;
	private WebElement departureFlight;
	private WebElement returnFlight;
	private WebElement passengers;
	private WebElement taxes;
	private WebElement totalPrice;
	
	public FlightConfirmationPage(WebDriver driver)
	{
		this.driver = driver;
		mapElements();
	}
	
	public WebElement getDepartureFlight() {
		return departureFlight;
	}

	public WebElement getReturnFlight() {
		return returnFlight;
	}

	public WebElement getPassengers() {
		return passengers;
	}

	public WebElement getTaxes() {
		return taxes;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}
	
	public void mapElements(){
		this.departureFlight = driver.findElement(By.cssSelector("td.frame_header_info > font > b"));
		this.returnFlight = driver.findElement(By.xpath("//tr[5]/td/font/b"));
		this.passengers = driver.findElement(By.xpath("//tr[7]/td/font"));
		this.taxes = driver.findElement(By.cssSelector("font > font > font > b > font"));
		this.totalPrice = driver.findElement(By.cssSelector("font > b > font > font > b > font"));
	}

}
