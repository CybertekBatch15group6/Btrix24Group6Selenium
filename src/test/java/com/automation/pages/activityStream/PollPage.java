package com.automation.pages.activityStream;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PollPage extends AbstractPageBase {

    @FindBy(xpath = "//span[@title='Upload files' and @id='bx-b-uploadfile-blogPostForm']")
    private WebElement uploadFileButton;

    @FindBy(xpath = "(//td[@onmouseover])[1]")
    private WebElement uploadFileBox;

    public void uploadFile(String filePath){

        BrowserUtils.waitForPageToLoad(20);

        wait.until(ExpectedConditions.visibilityOf(uploadFileButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(uploadFileBox)).sendKeys(filePath);
    }

}
