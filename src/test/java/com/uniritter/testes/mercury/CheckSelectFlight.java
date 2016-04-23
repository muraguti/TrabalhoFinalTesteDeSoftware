package com.uniritter.testes.mercury;

import org.junit.*;

public class CheckSelectFlight extends TestBase {

	@Test
	public void testCheckSelectFlight() throws Exception {
		HomePage homePage = new HomePage(getDriver());
		SignOnPage signOnPage = homePage.signOn();
		UserHomePage userHomePage = signOnPage.signOnUser("laisa", "senha");
		SelectAFlightPage selectAFlightPage = userHomePage.findAFlight("April","April","10","20", "Frankfurt");
		BookAFlightPage bookAFlightPage = selectAFlightPage.selectAFlight();
		validateText("Unified Airlines 633", bookAFlightPage.getSelectedDepartureFlight().getText());
		validateText("Blue Skies Airlines 361", bookAFlightPage.getSelectedReturnFlight().getText());
		validateText("271", bookAFlightPage.getPriceDepartureFlight().getText());
		validateText("303", bookAFlightPage.getPriceReturnFlight().getText());
		validateText("1", bookAFlightPage.getPassengers().getText());
		validateText("$47", bookAFlightPage.getTaxes().getText());
		validateText("$621", bookAFlightPage.getTotalPrice().getText());
		validateText("4/10/2016", bookAFlightPage.getDepartureDate().getText());
		validateText("4/20/2016", bookAFlightPage.getReturnDate().getText());
	}
}
