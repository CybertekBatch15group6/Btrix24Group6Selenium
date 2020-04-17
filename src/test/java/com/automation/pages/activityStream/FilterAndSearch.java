package com.automation.pages.activityStream;

import com.automation.pages.AbstractPageBase;
import com.automation.pages.LoginPage;
import com.automation.tests.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class FilterAndSearch extends AbstractPageBase {


    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    private WebElement filterAndSearch;

    @FindBy (xpath = "//div[@class='main-ui-filter-sidebar-item']")
    private WebElement allElments;

    //div[@class='main-ui-filter-sidebar-item']


    public void clicktheFilterAndSearch(){
    BrowserUtils.waitForPageToLoad(5);
        wait.until(ExpectedConditions.elementToBeClickable(filterAndSearch)).click();
//        WebElement filter = Driver.getDriver().findElement(By.xpath("//input[@id='LIVEFEED_search']"));
//        filter.click();
//        filterAndSearch.findElement(By.xpath("//input[@id='LIVEFEED_search']")).click();

    }
    //span[@class='menu-item-link-text'][contains(text(),'Activity Stream')]
////span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']
    public void verifySearchInput(){

        List<WebElement> workflow = Driver.getDriver().findElements(By.xpath("//div[@class='main-ui-filter-sidebar-item']"));

        for (WebElement eachelment: workflow){
            BrowserUtils.wait(10);
            System.out.println(eachelment.getText());
            Assert.assertTrue(eachelment.isDisplayed());
        }







    }

}
