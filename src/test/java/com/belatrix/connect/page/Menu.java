package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Menu extends ParentPage {

    public Menu (AppiumDriver driver){
        super(driver);
    }

    By BTN_SIDEBAR = By.
            xpath("//android.widget.ImageButton[@content-desc='Open']");

    By BTN_BACK = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");

    By TAB_CONTACTS = By.
            xpath("//android.widget.TextView[@text='Contacts']");
    By TAB_PROFILE = By.
            xpath("//android.widget.TextView[@text='Profile']");
    By TAB_EVENTS = By.xpath("//android.widget.TextView[@text='Events']");

    /**
     * This a method is for wait the sideBar Option
     **/
    public void openMenuSideBar()
    {
        handlingWaitToElement(BTN_SIDEBAR);
        click(BTN_SIDEBAR);
    }

    public void goBack(){
        click(BTN_BACK);
    }

    public void clickContactTab(){
        handlingWaitToElement(TAB_CONTACTS);
        click(TAB_CONTACTS);
    }

    public void clickProfileTab(){
        handlingWaitToElement(TAB_PROFILE);
        click(TAB_PROFILE);
    }

    public void clickEventsTab(){
        handlingWaitToElement(TAB_EVENTS);
        click(TAB_EVENTS);
    }

}