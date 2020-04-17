package com.automation.tests.Btrix24.sprint1;

import com.automation.pages.LoginPage;
import com.automation.pages.activityStream.FilterAndSearch;
import com.automation.tests.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import com.automation.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//alex
//        1. User should be able to search by clicking on default filters. (work, favorate, my activity, annoucements, and workflows)
//        2. User should be able to search by selecting Date, Type, Author, To and more default dropdowns.
//        3. User should be able to type-in keyword to search previous posts.
//        4. User should be able to use Save Filter functionality on search bar"


public class Alex extends AbstractTestBase {


    @Test
    public void searchAndFilters(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        BrowserUtils.waitForPageToLoad(3);

        FilterAndSearch filterAndSearch = new FilterAndSearch();
        filterAndSearch.clicktheFilterAndSearch();

        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(5);


        filterAndSearch.verifySearchInput();
//        List<WebElement> workflow = Driver.getDriver().findElements(By.xpath("//div[@class='main-ui-filter-sidebar-item']"));
//        //   List<String> list =Arrays.asList("WORK","FAVORITES","MY ACTIVITY","ANNOUNCEMENTS","WORKFLOWS");
//
//
////        for (WebElement eachelment: workflow){
////            BrowserUtils.wait(10);
////            System.out.println(eachelment.getText());
////            Assert.assertTrue(eachelment.isDisplayed());
////        }

    }

    @Test
    public void uploadfile(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        BrowserUtils.waitForPageToLoad(3);

        BrowserUtils.waitForPageToLoad(3);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        BrowserUtils.waitForPageToLoad(7);
        BrowserUtils.waitForPageToLoad(3);
        driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")).click();


        BrowserUtils.waitForPageToLoad(7);
        BrowserUtils.wait(7);
        //span[@class='menu-item-link-text'][contains(text(),'Activity Stream')]
////span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']
    }



    @Test
    public void interactWithEmployees(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        List<WebElement> names = driver.findElements(By.className("feed-post-user-name"));
       // for (WebElement eachelment: names){
            BrowserUtils.waitForPageToLoad(3);
            BrowserUtils.wait(4);
            names.get(2).click();
       WebElement contactInfo= driver.findElement(By.xpath("//td[contains(text(),'Contact information')]"));
        String expected = "Contact information";
        BrowserUtils.wait(6);
        Assert.assertEquals(contactInfo.getText(),expected);

    }


    @DataProvider
    public Object[][] credentials() {

        String path = "username.xlsx";
        String spreadSheet = "Sheet1";
        ExcelUtil excelUtil = new ExcelUtil(path,spreadSheet);
        return excelUtil.getDataArray();
    };

    @Test(dataProvider = "credentials")
    public void clickingOnName(String username, String password) {
        extentTest = extentReports.createTest("Click On Profile ");

//        String path = "username.xlsx";
//        String spreadSheet = "Sheet1";
//        ExcelUtil excelUtil = new ExcelUtil(path,spreadSheet);

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(10);
        loginPage.login(username, password);
      //  excelUtil.setCellData("PASSED","result",row++);

        List<WebElement> names = driver.findElements(By.className("feed-post-user-name"));
        names.get(0).click();
      WebElement actual  = driver.findElement(By.xpath("//td[contains(text(),'Contact information')]"));
        String expected = "Contact information";
        Assert.assertEquals(actual.getText(), expected);
        extentTest.pass("Successfully!");

    }

    @Test
    public void clickmessage(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();

        WebElement clickMessage =driver.findElement(By.xpath("//span[contains(text(),'Message')]"));
        BrowserUtils.waitForPageToLoad(5);
        clickMessage.click();
        BrowserUtils.wait(5);
        BrowserUtils.waitForPageToLoad(3);

 driver.findElement(By.xpath("//span[@id='bx-b-uploadfile-blogPostForm']")).click();

        BrowserUtils.waitForPageToLoad(3);
        BrowserUtils.wait(5);

        WebElement upload = driver.findElement(By.xpath("//div[@class='feed-add-post-form-wrap']//tr[1]//td[3]"));
        BrowserUtils.wait(3);
        upload.click();
        BrowserUtils.wait(3);
        BrowserUtils.waitForPageToLoad(5);

        WebElement verifyText = driver.findElement(By.xpath("//span[@class='popup-window-titlebar-text']"));
        BrowserUtils.wait(3);
        BrowserUtils.waitForPageToLoad(8);
        String  expactedText="Select one or more documents";
        Assert.assertEquals(verifyText.getText(),expactedText);
        ////span[@class='popup-window-titlebar-text']

    }

}
