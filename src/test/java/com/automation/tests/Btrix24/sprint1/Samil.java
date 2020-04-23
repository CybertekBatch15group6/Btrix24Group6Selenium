package com.automation.tests.Btrix24.sprint1;

import com.automation.pages.LoginPage;
import com.automation.pages.activityStream.PollPage;
import com.automation.tests.AbstractTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Samil extends AbstractTestBase {

    LoginPage loginPage = new LoginPage();
    PollPage pollPage = new PollPage();

    @Test
    public void verifyUserName(){

        extentTest = extentReports.createTest("Verify title");

        loginPage.login("helpdesk35@cybertekschool.com","UserUser");

        String expectedName = "helpdesk35@cybertekschool.com";

        String actualName = pollPage.getCurrentUserName();

        Assert.assertEquals(actualName,expectedName);

        extentTest.pass("Title verification successful");


    }

    @Test
    public void goToPoll(){

        loginPage.login("helpdesk35@cybertekschool.com","UserUser");

        pollPage.navigateTo("Event");


    }


    @Test
    public void uploadingFile(){

        loginPage.login("helpdesk35@cybertekschool.com","UserUser");

        pollPage.navigateTo("Poll");

        pollPage.uploadFile("/Users/kabardeyo/Documents/bbv.pages");

    }
}
