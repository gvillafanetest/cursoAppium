package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.testng.Assert;

public class EventsSteps extends ParentScenario{

    @And("^I click in More button on Other locations events$")
    public void iClickInMoreButtonOnOtherLocationsEvents() throws Throwable {
        event.clickOnMoreOtherLocationsEvents();
    }

    @And("^I click in \"([^\"]*)\"$")
    public void iClickIn(String title) throws Throwable {
        event.clickOnEvent(title);
    }

    @And("^I click in Register button$")
    public void iClickInRegisterButton() throws Throwable {
        event.registerIntoEvent();
    }

    @And("^I verify registration confirmed \"([^\"]*)\"$")
    public void iVerifyRegistrationConfirmed(String message) throws Throwable {
        confirmationMessage.waitForConfirmationMessage();
        Assert.assertEquals(confirmationMessage.getConfirmationMessage(), message);
    }

    @And("^I click on Registered button$")
    public void iClickOnRegisteredButton() throws Throwable {
        event.unregisterIntoEvent();
    }


    @And("^I verify unregistration confirmed \"([^\"]*)\"$")
    public void iVerifyUnregistrationConfirmed(String message) throws Throwable {
        confirmationMessage.waitForConfirmationMessage();
        Assert.assertEquals(confirmationMessage.getConfirmationMessage(), message);
    }
}
