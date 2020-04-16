package com.automation.pages.activityStream;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EventPage extends AbstractPageBase {

    // Upload elements
    @FindBy (id = "bx-b-uploadfile-blogPostForm_calendar")
    protected WebElement UploadFilesBtn;

    //link
    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm_calendar']")
    private WebElement link;

    @FindBy(id = "linkoCalEditorcal_3Jcl-href")
    private WebElement linkURL;

    @FindBy(id = "linkoCalEditorcal_3Jcl-text")
    private WebElement linkText;

    @FindBy(id = "undefined")
    private WebElement saveLink;

    /**
     * Add link to Event
     * @param text accepts a text for the link
     * @param URL accepts a link
     */
    public void addLinkToEvent (String text, String URL){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(linkText)).sendKeys(text);
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(linkURL)).sendKeys(URL);
        BrowserUtils.wait(3);
        saveLink.click();
        BrowserUtils.wait(2);
    }


}
