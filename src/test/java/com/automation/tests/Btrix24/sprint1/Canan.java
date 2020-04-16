package com.automation.tests.Btrix24.sprint1;

import com.automation.pages.LoginPage;
import com.automation.pages.activityStream.EventPage;
import com.automation.tests.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Canan extends AbstractTestBase {
    /*User Story #3
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
        eventPage.ActivityNavigation("Event");
        eventPage.addLinkToEvent("SIS","www.sislife.org");

        extentTest.pass("Attached Link to Event Successfully!");

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
