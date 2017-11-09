package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

import static java.awt.SystemColor.menu;

public class MenuSteps extends ParentScenario {
    @When("^I click in Events tab$")
    public void iClickInEventsButton() throws Throwable {
        menu.clickEventsTab();
    }
}
