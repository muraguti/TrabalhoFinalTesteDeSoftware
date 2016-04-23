package com.uniritter.testes.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class SelectAFlightPage {
	private WebDriver driver;
	private WebElement departureFlight;
	private WebElement returnFlight;
	private WebElement fromDate;
	private WebElement toDate;
	private WebElement reserveFlightsButton;
	private WebElement selectedDepartureFlight;
	private WebElement selectedReturnFlight;
	
	public SelectAFlightPage(WebDriver driver) {
		this.driver = driver;
		mapElements();
	}

	public WebElement getDepartureFlight() {
		return this.departureFlight;
	}

	public WebElement getReturnFlight() {
		return this.returnFlight;
	}

	public WebElement getFromDate() {
		return this.fromDate;
	}

	public WebElement getToDate() {
		return this.toDate;
	}

	public BookAFlightPage selectAFlight() {
		this.selectedDepartureFlight.click();
		this.selectedReturnFlight.click();
		this.reserveFlightsButton.click();
		return new BookAFlightPage(this.driver);
	}

	private void mapElements() {
		this.departureFlight = driver.findElement(By.cssSelector("td.title > b > font"));
		this.returnFlight = driver.findElement(By.xpath("//table[2]/tbody/tr/td/table/tbody/tr[2]/td/b/font"));
		this.fromDate = driver.findElement(By.xpath("//td[2]/b/font"));
		this.toDate = driver.findElement(By.xpath("//table[2]/tbody/tr/td/table/tbody/tr[2]/td[2]/b/font"));
		this.selectedDepartureFlight = driver.findElement(By.xpath("(/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input)"));
	    this.selectedReturnFlight = driver.findElement(By.xpath("(/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input)"));
	    this.reserveFlightsButton =  driver.findElement(By.name("reserveFlights"));
	}
}

