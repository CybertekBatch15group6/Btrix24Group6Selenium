package com.automation.tests.Btrix24.sprint1;
import com.automation.pages.ActivityStream;
import com.automation.pages.LoginPage;
import com.automation.tests.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;
public class Arafat extends AbstractTestBase {
    /*
    User Story:
        #1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.
    Acceptance Criteria:
        1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
        2. User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
        3. User should be able to attach link by clicking on the link icon.
        4. User should be able to insert videos by clicking on the video icon and entering the video URL.
        5. User should be able to create a quote by clicking on the Comma icon.
        6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
        7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
        8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
        9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
     */

    @Test(description="AC#1: User should be able to click on upload files icon to upload files and pictures from local disks")
    public void verifyUploadFunction(){
        extentTest = extentReports.createTest("Upload File/image from local disk to Message section");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHr();
        BrowserUtils.waitForPageToLoad(10);

        ActivityStream activityStream = new ActivityStream();
        activityStream.clickOnUploadFilesBtn();
        activityStream.setFileAndImageUploadBtn();
        extentTest.pass("Upload File/image from local disk to Message section test is passed Successfully!");
    }

    @Test(description = "AC#1: User should be able to click on upload files icon to to upload files and pictures from select documents from bixtrix24 ")
    public void verifyUploadFromBixtrix24(){
        extentTest = extentReports.createTest("Upload File from Recent items section of the select document from bixtrix24");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHr();
        BrowserUtils.waitForPageToLoad(10);
        ActivityStream activityStream = new ActivityStream();
        activityStream.clickOnUploadFilesBtn();

        activityStream.setBitrixSelectDocBtn();
        extentTest = extentReports.createTest("Upload File from Recent items section of the select document from bixtrix24 is passed Successfully!");

    }

// just comment
}

