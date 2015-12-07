package com.turkeydave.seleniumtest;

import org.junit.Test;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.WebElement;

/**
 * Created by turkeydave on 12/5/2015.
 */
@Config(
        browser = Browser.CHROME,
        url     = "https://studio.zenplanner.com/zenplanner/studio/index.html#/login"
)
public class StudioLoginTest extends Locomotive {

    private Locomotive loginToDaveKRoot(){
        return validatePresent(StudioLogin.LOGIN_BTN)
                // enter text
                .setText(StudioLogin.USERNAME, "david@zenplanner.com")
                .setText(StudioLogin.PASSWORD, "Password@2")
                // press button
                .click(StudioLogin.LOGIN_BTN)
                // i have 2 profiles, pick root one
                .validatePresent(StudioLogin.ROOT_ACCOUNT_RADIO)
                .check(StudioLogin.ROOT_ACCOUNT_RADIO)
                // login (again)
                .click(StudioLogin.LOGIN_BTN)
                .validatePresent(StudioLogin.SRCH_SHOW_BUTTON);
    }

    @Test
    public void testCanLoginAsDaveKRoot() {
        Locomotive login = loginToDaveKRoot();
    }

    @Test
    public void testModernWorkoutTracking() {
        Locomotive login = loginToDaveKRoot();

        // go to root -> mountain warrior person page (was trying to search, and it worked, but clunky, can use code below to test search tho
        login.navigateTo(StudioLogin.MTN_W_URL)
             .validatePresent(StudioLogin.SRCH_SHOW_BUTTON)

             // go to iframe
             .switchToFrame(0)
             // click the login to this school
             .validatePresent(StudioLogin.MTN_W_LOGIN_AS)
             .click(StudioLogin.MTN_W_LOGIN_AS)
             // get out of iframe
             .switchToDefaultContent()
             .validatePresent(StudioLogin.WORKOUT_ICON)
             .click(StudioLogin.WORKOUT_ICON);
//
//                // open search
//                .validatePresent(StudioLogin.SRCH_SHOW_BUTTON)
//                .click(StudioLogin.SRCH_SHOW_BUTTON)
//                // enter text
//                .validatePresent(StudioLogin.SRCH_TEXT)
//                .setText(StudioLogin.SRCH_TEXT, "mountain warrior")
//                // click mountain warrior
//                .validatePresent(StudioLogin.MTN_W_HACK).click(StudioLogin.MTN_W_HACK);
//                //.navigateTo();

        //https://studio.zenplanner.com/zenplanner/studio/index.html#/main/iframe/zenplanner/studio/person/edit.cfm?PersonId=502BAC47-375B-4BEC-AB46-5E2518228526&tt=1449339581460
//*[@id="content"]/div[2]/div/div/div[1]/div[3]/input
//
//        WebElement w = waitForElement(StudioLogin.WORKOUT_ICON);
//        if(w != null){
//            w.click();
//        }
    }


}
