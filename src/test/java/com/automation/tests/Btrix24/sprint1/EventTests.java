package com.automation.tests.Btrix24.sprint1;

import com.automation.pages.LoginPage;
import com.automation.pages.activityStream.EventPage;
import com.automation.tests.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EventTests extends AbstractTestBase {
    /*User Story #3 - Tester Canan
    As a user, I should be able to create
    events by clicking on Event tab under Activity Stream.*/

    // AC2: User should be able to attach link by clicking on the link icon.
    @Test (dataProvider = "credentials")
    public void attachLinkToEvent (String username, String password){
        extentTest = extentReports.createTest("Attach Link to Event");

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(10);
        loginPage.login(username,password);
        EventPage eventPage = new EventPage();
        eventPage.activityNavigation("Event");
        eventPage.addLinkToEvent("SIS","www.sislife.org");

        extentTest.pass("Attached Link to Event test passed Successfully!");
    }

    // AC1: 1. User should be able to click on upload files icon to upload files and pictures from local disks.
    @Test (dataProvider = "credentials")
    public void uploadFileToEvent (String username, String password){
        extentTest = extentReports.createTest("Upload File to Event");

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(10);
        loginPage.login(username,password);
        EventPage eventPage = new EventPage();
        eventPage.activityNavigation("Event");
        eventPage.clickUploadFilesIcon();
        eventPage.uploadByPath();

        extentTest.pass("Upload File to Event test passed Successfully!");
    }

    // AC1: 1. User should be able to click on upload files icon to upload files from Bitrix/Recent Items.
    @Test (dataProvider = "credentials")
    public void selectDocumentFromBitrixRecentItems (String username, String password){
        extentTest = extentReports.createTest("Select Document from Bitrix Recent Items");

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(10);
        loginPage.login(username,password);
        EventPage eventPage = new EventPage();
        eventPage.activityNavigation("Event");
        eventPage.clickUploadFilesIcon();
        eventPage.selectDocumentFromBitrixRecentItems();

        extentTest.pass("Select Document from Bitrix Recent Items test passed Successfully!");
    }

    // AC1: 1. User should be able to click on upload files icon to upload files from Bitrix/My Drive.
    @Test (dataProvider = "credentials")
    public void selectDocumentFromBitrixMyDrive (String username, String password){
        extentTest = extentReports.createTest("Select Document from Bitrix My Drive");

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(10);
        loginPage.login(username,password);
        EventPage eventPage = new EventPage();
        eventPage.activityNavigation("Event");
        eventPage.clickUploadFilesIcon();
        eventPage.selectDocumentFromBitrixMyDrive();

        extentTest.pass("Select Document from Bitrix My Drive test passed Successfully!");
    }

    // AC1: 1. User should be able to click on upload files icon to upload files from Bitrix/Sales and Marketing.
    @Test (dataProvider = "credentials")
    public void selectDocumentFromBitrixSalesAndMarketing (String username, String password){
        extentTest = extentReports.createTest("Select Document from Bitrix Sales and Marketing");

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(10);
        loginPage.login(username,password);
        EventPage eventPage = new EventPage();
        eventPage.activityNavigation("Event");
        eventPage.clickUploadFilesIcon();
        eventPage.selectDocumentFromBitrixSalesAndMarketing();

        extentTest.pass("Select Document from Bitrix Sales and Marketing test passed Successfully!");
    }

    @DataProvider
    public Object[][] credentials() {
        return new Object[][]{
                {"helpdesk12@cybertekschool.com", "UserUser"},
                {"marketing12@cybertekschool.com", "UserUser"},
                {"hr12@cybertekschool.com", "UserUser"}
        };
    }

}
