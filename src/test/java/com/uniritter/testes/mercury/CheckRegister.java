package com.uniritter.testes.mercury;
import org.junit.*;

public class CheckRegister extends TestBase{

	@Test
  public void testCheckRegister() throws Exception {
    HomePage homePage = new HomePage(getDriver());
    RegisterPage registerPage = homePage.registerUser();
    RegisterConfirmationPage registerConfirmationPage = registerPage.registerUser("Laisa","Bezerra","laisa","senha", "senha");
    
    this.validateText("Dear Laisa Bezerra,", registerConfirmationPage.getWelcomeLabel().getText());
    this.validateText("Note: Your user name is laisa.", registerConfirmationPage.getNoteLabel().getText());
  }
}
