package com.automation.pages.activityStream;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EventPage extends AbstractPageBase {
    // Tester Canan

    // Upload elements
    @FindBy (id = "bx-b-uploadfile-blogPostForm_calendar")
    protected WebElement uploadFilesIcon;

    @FindBy (name = "bxu_files[]")
    protected WebElement uploadFilesAndImages;

    @FindBy (className = "wd-fa-add-file-light-title-text")
    protected WebElement downloadFromExternalDrive;

    @FindBy (xpath = "(//*[text()='Select document from Bitrix24'])[3]")
    protected WebElement selectDocumentFromBitrix;

    @FindBy (xpath = "//*[text()='Recent items']")
    protected WebElement recentItems;

    @FindBy (xpath = "//div[@class='bx-file-dialog-content-wrap']//div//span//a")
    protected WebElement firstItem;

    @FindBy (xpath = "//span[text()='My Drive']")
    protected WebElement myDrive;

    @FindBy (xpath = "//a[text()='Uploaded files']")
    protected WebElement uploadedFiles;

    @FindBy (xpath = "(//div[@class='bx-file-dialog-tab-group']//div)[4]")
    protected WebElement salesAndMarketing;


    @FindBy (xpath = "//a[text()='Marketing and advertising']")
    protected WebElement marketingAndAdvertising;

    @FindBy (xpath = "//a[text()='Quotes']")
    protected WebElement quotes;

    @FindBy (xpath = "//div[@class='popup-window-buttons']//span[1]")
    protected WebElement selectDocument;



    //link
    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm_calendar']")
    private WebElement link;

    @FindBy(id = "linkoCalEditorcal_3Jcl-href")
    private WebElement linkURL;

    @FindBy(id = "linkoCalEditorcal_3Jcl-text")
    private WebElement linkText;

    @FindBy(id = "undefined")
    private WebElement saveLink;

    public void selectDocumentFromBitrixRecentItems (){
        wait.until(ExpectedConditions.elementToBeClickable(selectDocumentFromBitrix)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(recentItems)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(firstItem)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(selectDocument)).click();
        BrowserUtils.wait(1);
    }

    public void selectDocumentFromBitrixMyDrive (){
        wait.until(ExpectedConditions.elementToBeClickable(selectDocumentFromBitrix)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(myDrive)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(uploadedFiles)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(firstItem)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(selectDocument)).click();
        BrowserUtils.wait(1);
    }

    public void selectDocumentFromBitrixSalesAndMarketing (){
        wait.until(ExpectedConditions.elementToBeClickable(selectDocumentFromBitrix)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(salesAndMarketing)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(marketingAndAdvertising)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(firstItem)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(selectDocument)).click();
        BrowserUtils.wait(1);
    }

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

    public void clickUploadFilesIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(uploadFilesIcon)).click();
    }

    public void uploadByPath() {
        String path="/Users/cananarikan/Desktop/Resume.png";
       /* if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            path = System.getProperty("user.dir")+"/filename";
        } else {
            path = System.getProperty("user.dir")+"\\filename";
        }*/
        BrowserUtils.wait(3);
        uploadFilesAndImages.sendKeys(path);
        BrowserUtils.wait(3);
    }



}