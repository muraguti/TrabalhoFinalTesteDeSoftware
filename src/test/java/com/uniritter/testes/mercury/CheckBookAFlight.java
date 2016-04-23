package com.uniritter.testes.mercury;

import org.junit.*;

public class CheckBookAFlight extends TestBase {

	@Test
	public void testCheckBookAFlight() throws Exception {
		HomePage homePage = new HomePage(getDriver());
		SignOnPage signOnPage = homePage.signOn();
		UserHomePage userHomePage = signOnPage.signOnUser("laisa", "senha");
		SelectAFlightPage selectAFlightPage = userHomePage.findAFlight("April","April","10","20", "Frankfurt");
		BookAFlightPage bookAFlightPage = selectAFlightPage.selectAFlight();
		FlightConfirmationPage flightConfirmationPage = bookAFlightPage.buyFlight();
		validateText("Acapulco to Frankfurt", flightConfirmationPage.getDepartureFlight().getText());
		validateText("Frankfurt to Acapulco", flightConfirmationPage.getReturnFlight().getText());
		validateText("1 passenger", flightConfirmationPage.getPassengers().getText());
		validateText("$47 USD", flightConfirmationPage.getTaxes().getText());
		validateText("$621 USD", flightConfirmationPage.getTotalPrice().getText());
	}
}
