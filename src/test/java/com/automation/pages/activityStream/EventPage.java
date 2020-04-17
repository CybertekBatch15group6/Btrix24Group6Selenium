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

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    private WebElement uploadFiles;

    @FindBy(name = "bxu_files[]")
    private WebElement uploadfilesandimages;

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

    public void clickUploadFilesBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(UploadFilesBtn)).click();
    }

    public void uploadByPath() {
        String path="/Users/cananarikan/Desktop/Resume.png";

       /* if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            path = System.getProperty("user.dir")+"/filename";
        } else {
            path = System.getProperty("user.dir")+"\\filename";
        }*/

        BrowserUtils.wait(3);
        uploadfilesandimages.sendKeys(path);
        BrowserUtils.wait(3);
    }



}
