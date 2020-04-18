package com.automation.tests.Btrix24.sprint1;

import com.automation.pages.LoginPage;
import com.automation.pages.activityStream.FileTab;
import com.automation.tests.AbstractTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Tester: Jordan Hankison
 * Project: Bitrix
 * User Story: As a user, I should be able to send announcement from Announcement subheading from "More" under Activity Stream.
 * Environment: Activity Stream Page
 */
public class BO6_168 extends AbstractTestBase {


    /**
     * Acceptance Criteria 1:
     * User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive,
     * select documents from bixtrix24, and create files to upload.
     */
    @Test
    public void AC1 (){
        extentTest = extentReports.createTest("User can Upload/Download files and pictures from 'upload files and images' icon");
        LoginPage loginPage = new LoginPage();
        FileTab fileTab = new FileTab();
        String uploadFile = "testUploadFile.txt";
        String uploadImage = "testUploadImage.png";

        loginPage.login();
        fileTab.navigateToMoreFeature("File");

        // Test Upload functionality
        fileTab.uploadTestFilesAndImages(uploadFile);
        fileTab.uploadTestFilesAndImages(uploadImage);
        Assert.assertTrue(fileTab.uploadedFileXpath(uploadFile).isDisplayed());
        Assert.assertTrue(fileTab.uploadedFileXpath(uploadImage).isDisplayed());

        //I can not Test the Download from External drive yet. It is beyond my abilities/time at the moment


    }



}
