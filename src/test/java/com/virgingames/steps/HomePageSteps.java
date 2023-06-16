package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }


    @And("^User accepts cookies$")
    public void userAcceptsCookies() throws InterruptedException {
        new HomePage().clickOnCookies();
    }

    @Then("^User verifies the Welcome text$")
    public void userVerifiesTheWelcomeText() {
        String expectedText = "Welcome to Virgin Games";
        String acutalText = new HomePage().getTextFromPage();
        Assert.assertEquals(expectedText,acutalText);
    }
}
