package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);
    protected Actions actions = new Actions(driver);

    @FindBy(css = "#user-name")
    protected WebElement currentUser;

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }


    public String getCurrentUserName(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }

    public void navigateTo(String moduleName) {

        String moduleXpath = "//span[text()='"+moduleName+"']";


        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));

        Actions actions = new Actions(driver);

        BrowserUtils.wait(4);

        actions.click(moduleElement).perform();

        //increase this wait rime if still failing
        BrowserUtils.wait(4);
    }

    //create one for MORE feature

    public void navigateToMoveFeature(String moreFeature) {

        String moreXpath = "(//span[text()='More'])[1]";

        String moreFeatureXpath = "//span[@class='menu-popup-item-text' and text()='" + moreFeature + "']";

        WebElement more = driver.findElement(By.xpath(moreXpath));

        WebElement feature = driver.findElement(By.xpath(moreFeatureXpath));

        Actions actions = new Actions(driver);

        BrowserUtils.wait(4);

        actions.click(wait.until(ExpectedConditions.visibilityOf(more))).click(wait.until(ExpectedConditions.visibilityOf(feature))).build().perform();

        BrowserUtils.wait(4);
    }

        /**
         * This method will navigate to user specified tab in ActivityStream module
         * @param tabName user will enter tab name. Case Sensitive!!
         */
        public void activityNavigation(String tabName){
            BrowserUtils.waitForPageToLoad(10);
            String path="//span[text()='" + tabName + "']";
            WebElement tab = driver.findElement(By.xpath(path));
            wait.until(ExpectedConditions.visibilityOf(tab));
            tab.click();
        }
}