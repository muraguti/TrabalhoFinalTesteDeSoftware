package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserHomePage {
	private WebDriver driver;
	private WebElement signOffLink;
	private WebElement itineraryLink;
	private WebElement profileLink;
	private WebElement fromDay;
	private WebElement toDay;
	private WebElement fromMonth;
	private WebElement toMonth;
	private WebElement destination;
	private WebElement findFlightsButton;

	public UserHomePage(WebDriver driver) {
		this.driver = driver;
		this.mapElements();
	}

	public WebElement getSignOffLink() {
		return this.signOffLink;
	}

	public WebElement getItineraryLink() {
		return this.itineraryLink;
	}

	public WebElement getProfileLink() {
		return this.profileLink;
	}

	public SelectAFlightPage findAFlight(String fromMonth, String toMonth, String fromDay, String toDay, String destination) {
		new Select(this.fromMonth).selectByVisibleText(fromMonth);
	    new Select(this.toMonth).selectByVisibleText(toMonth);
		new Select(this.fromDay).selectByVisibleText(fromDay);
		new Select(this.toDay).selectByVisibleText(toDay);
		new Select(this.destination).selectByVisibleText(destination);
		this.findFlightsButton.click();
		return new SelectAFlightPage(this.driver);
	}

	private void mapElements() {
		this.signOffLink = driver.findElement(By.linkText("SIGN-OFF"));
		this.itineraryLink = driver.findElement(By.linkText("ITINERARY"));
		this.profileLink = driver.findElement(By.linkText("PROFILE"));
	    this.fromMonth = driver.findElement(By.name("fromMonth"));
	    this.toMonth = driver.findElement(By.name("toMonth"));
		this.fromDay = driver.findElement(By.name("fromDay"));
		this.toDay = driver.findElement(By.name("toDay"));
		this.destination = driver.findElement(By.name("toPort"));
		this.findFlightsButton = driver.findElement(By.name("findFlights"));
	}
}
