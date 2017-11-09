package com.belatrix.connect.page;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ConfirmationMessage extends ParentPage {
    public ConfirmationMessage(AppiumDriver driver) {
        super(driver);
    }

    By CONTEINER_MESSAGE = By.
            id("android:id/contentPanel");
    By MESSAGE = By.
            id("android:id/message");
    By BTN_GOT_IT = By.
            id("android:id/button1");

    /**
     * This a method is for wait load the confirmation message
     **/
    public void waitForConfirmationMessage()
    {
        handlingWaitToElement(CONTEINER_MESSAGE);
        handlingWaitToElement(MESSAGE);
    }

    public String getConfirmationMessage()
    {
        return getElementValue(MESSAGE);
    }

    /**
     * This a method is for do click in Yes option
     **/
    public void clickOnGotIt()
    {
        click(BTN_GOT_IT);
    }
}
