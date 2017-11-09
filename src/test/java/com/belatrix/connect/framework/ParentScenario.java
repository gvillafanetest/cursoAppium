package com.belatrix.connect.framework;

import com.belatrix.connect.page.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class ParentScenario {
    private AppiumDriver driver;
    protected static LoginPage loginPage;
    protected static NewsPage newsPage;
    protected static Menu menu;
    protected static MainProfilePage mainProfilePage;
    protected static EditProfilePage editProfilePage;
    protected static ContactProfilePage contactProfilePage;
    protected static EventsPage event;
    protected static ContactsPage contactsPage;
    protected static KudosPage kudosPage;
    protected static SideBarNavigation sideBarNavigation;
    protected static AlertMessageTwoOptions alertMessageTwoOptions;
    protected static ConfirmationMessage confirmationMessage;

    public void startAndroid(){
        String url = "http://localhost:4723/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();

	    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"192.168.70.101:5555");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
        cap.setCapability(MobileCapabilityType.APP, "E:\\curso-appium\\apk\\BxConnect_2.0.5.1.apk");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.belatrixsf.connect");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.belatrixsf.connect.ui.SplashActivity");

        try{
            driver = new AndroidDriver<MobileElement>(new URL(url),cap);
        }catch (Exception e){
            System.out.println("Excepcion al momneto de generar el Driver " + e);
        }

        loginPage = new LoginPage(driver);
        newsPage = new NewsPage(driver);
        mainProfilePage = new MainProfilePage(driver);
        menu = new Menu(driver);
        editProfilePage = new EditProfilePage(driver);
        contactProfilePage = new ContactProfilePage(driver);
        contactsPage = new ContactsPage(driver);
        event = new EventsPage(driver);
        kudosPage = new KudosPage(driver);
        sideBarNavigation = new SideBarNavigation(driver);
        alertMessageTwoOptions = new AlertMessageTwoOptions(driver);
        confirmationMessage = new ConfirmationMessage(driver);
    }

    protected void closeDriver() {
        driver.quit();
    }

}
