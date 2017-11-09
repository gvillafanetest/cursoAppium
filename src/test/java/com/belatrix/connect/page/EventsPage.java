package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class EventsPage extends ParentPage {

    public EventsPage(AppiumDriver driver) {
        super(driver);
    }

    By BTN_MORE_OTHER_LOCATION_EVENTS = By.xpath("//android.widget.Button[@resource-id='com.belatrixsf.connect:id/event_more_button' and @instance='2']");
    By EVENT;

    By BTN_REGISTER = By.xpath("//android.widget.Button[@text='Register']");

    By BTN_REGISTERED = By.xpath("//android.widget.Button[@text='Registered']");


    public void clickOnMoreOtherLocationsEvents(){
        click(BTN_MORE_OTHER_LOCATION_EVENTS);
    }

    public void clickOnEvent(String title){
         EVENT = By.xpath("//android.widget.TextView[@resource-id='com.belatrixsf.connect:id/event_title' and contains(@text,'" + title + "')]");
         handlingWaitToElement(EVENT);
         click(EVENT);
    }

    public void registerIntoEvent(){
        handlingWaitToElement(BTN_REGISTER);
        click(BTN_REGISTER);
    }

    public void unregisterIntoEvent(){
        handlingWaitToElement(BTN_REGISTERED);
        click(BTN_REGISTERED);
    }

}
