package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookAFlightPage {
	private WebDriver driver;
	private WebElement selectedDepartureFlight;
	private WebElement selectedReturnFlight;
	private WebElement priceDepartureFlight;
	private WebElement priceReturnFlight;
	private WebElement passengers;
	private WebElement taxes;
	private WebElement totalPrice;
	private WebElement departureDate;
	private WebElement returnDate;
	private WebElement buyFlightButton;

	public BookAFlightPage(WebDriver driver) {
		this.driver = driver;
		this.mapElements();
	}
	
	public WebElement getSelectedDepartureFlight() {
		return selectedDepartureFlight;
	}

	public WebElement getSelectedReturnFlight() {
		return selectedReturnFlight;
	}

	public WebElement getPriceDepartureFlight() {
		return priceDepartureFlight;
	}

	public WebElement getPriceReturnFlight() {
		return priceReturnFlight;
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
	
	public WebElement getDepartureDate() {
		return departureDate;
	}
	
	public WebElement getReturnDate() {
		return returnDate;
	}
	
	public FlightConfirmationPage buyFlight(){
		this.buyFlightButton.click();
		return new FlightConfirmationPage(this.driver);
	}
	
	public void mapElements() {
		this.selectedDepartureFlight = driver.findElement(By.cssSelector("font > font > font > b"));
		this.selectedReturnFlight = driver.findElement(By.cssSelector("td.data_left > font > b"));
		this.priceDepartureFlight = driver.findElement(By.cssSelector("td.data_center > font"));
		this.priceReturnFlight = driver.findElement(By.xpath("//tr[6]/td[3]/font"));
		this.passengers = driver.findElement(By.xpath("//tr[7]/td[2]/font"));
		this.taxes = driver.findElement(By.xpath("//tr[8]/td[2]/font"));
		this.totalPrice = driver.findElement(By.xpath("//td[2]/font/b"));
		this.departureDate = driver.findElement(By.xpath("//td[2]/b/font"));
		this.returnDate = driver.findElement(By.cssSelector("td.data_center_mono > b > font"));
		this.buyFlightButton = driver.findElement(By.name("buyFlights"));
	}
}
