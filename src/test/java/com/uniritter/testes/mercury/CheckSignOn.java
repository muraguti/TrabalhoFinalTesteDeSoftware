package com.uniritter.testes.mercury;

import org.junit.*;

public class CheckSignOn extends TestBase{

  @Test
  public void testCheckSignOn() throws Exception {
	HomePage homePage = new HomePage(getDriver());
	SignOnPage signOnPage = homePage.signOn();
	UserHomePage userHomePage = signOnPage.signOnUser("laisa","senha");
	
	validateText("SIGN-OFF", userHomePage.getSignOffLink().getText());
	validateText("ITINERARY", userHomePage.getItineraryLink().getText());
	validateText("PROFILE", userHomePage.getProfileLink().getText());
  }
}
