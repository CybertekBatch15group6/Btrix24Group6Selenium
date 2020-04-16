package com.automation.tests.Btrix24.sprint1;

import com.automation.pages.LoginPage;
import com.automation.pages.activityStream.FilterAndSearch;
import com.automation.tests.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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

}
