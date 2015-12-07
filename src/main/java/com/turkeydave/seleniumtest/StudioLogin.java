package com.turkeydave.seleniumtest;

import org.openqa.selenium.By;

/**
 * Created by turkeydave on 12/5/2015.
 */
public class StudioLogin {
    // the tabs
    //*[@id="loginform"]/div[3]
//    public static final String LOC_LNK_PROJECTSTAB = "li#menu_projects a[href$='projects/']";
//    public static final String LOC_LNK_DOWNLOADTAB = "li#menu_download a[href$='download/']";
    public static final By LOGIN_BTN = By.xpath("//*[@id=\"btnLogin\"]");
    public static final By USERNAME = By.xpath("//*[@id=\"loginform\"]/div[1]/div[1]/div[2]/input");
    public static final By PASSWORD = By.xpath("//*[@id=\"loginform\"]/div[1]/div[2]/div[2]/input");

    public static final By ROOT_ACCOUNT_RADIO = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]//input[@value='731B6A8D-E3D7-4DB2-87E8-E00998DCCB10']");

    // main page shit
    public static final By SRCH_ICON = By.id("js-search-tab");
    public static final By SRCH_SHOW_BUTTON = By.className("search-button");
    public static final By SRCH_TEXT = By.id("idMultiSearchInput");
    public static final By SRCH_BUTTON = By.className("input-search-button");

    public static final By MTN_W_HACK = By.xpath("/html/body/section/section[2]/div[2]/div[5]/a");
    public static final String MTN_W_URL = "https://studio.zenplanner.com/zenplanner/studio/index.html#/main/iframe/zenplanner/studio/person/edit.cfm?PersonId=502BAC47-375B-4BEC-AB46-5E2518228526&tt=1449339581460";
    // NOTE: this xpath is in the iframe, so include html/body ...
    public static final By MTN_W_LOGIN_AS = By.xpath("/html/body//*[@id=\"idMainInner\"]/div[3]/div[1]/a[2]");

    // new workout tracking link
    public static final By WORKOUT_ICON = By.xpath("/html/body/section/nav/ul/li[5]/a");


//    public static final String LOC_LNK_SUPPORTTAB = "li#menu_support a[href$='support/']";
//    public static final String LOC_LNK_ABOUTTAB = "li#menu_about a[href$='about/']";
//
//    // download link
//    public static final By LOC_LNK_DOWNLOADSELENIUM = By.linkText("Download Selenium");
}
