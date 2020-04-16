package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPageBase {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);

    public AbstractPageBase(){
        PageFactory.initElements(driver,this);
    }

    /**
     * This method will navigate to user specified tab in ActivityStream module
     * @param tabName user will enter tab name. Case Sensitive!!
     */
    public void ActivityNavigation(String tabName){
        BrowserUtils.waitForPageToLoad(10);
        String path="//span[text()='" + tabName + "']";
        WebElement tab = driver.findElement(By.xpath(path));
        wait.until(ExpectedConditions.visibilityOf(tab));
        tab.click();
    }
}
