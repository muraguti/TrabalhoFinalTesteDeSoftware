package com.uniritter.testes.mercury;

import org.junit.*;

public class CheckFlightFinder extends TestBase {
  
  @Test
  public void testCheckFlightFinder() throws Exception {
	  HomePage homePage = new HomePage(getDriver());
	  SignOnPage signOnPage = homePage.signOn();
	  UserHomePage userHomePage = signOnPage.signOnUser("laisa","senha");
	  SelectAFlightPage selectAFlightPage = userHomePage.findAFlight("April","April","10", "20", "Frankfurt");
	  
	  validateText("Acapulco to Frankfurt", selectAFlightPage.getDepartureFlight().getText());
	  validateText("Frankfurt to Acapulco", selectAFlightPage.getReturnFlight().getText());
	  validateText("4/10/2016", selectAFlightPage.getFromDate().getText());
	  validateText("4/20/2016", selectAFlightPage.getToDate().getText());
  }
}
