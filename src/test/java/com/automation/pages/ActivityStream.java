package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActivityStream extends AbstractPageBase{
    protected WebDriver driver = Driver.getDriver();


    @FindBy(xpath ="//span[@id='bx-b-uploadfile-blogPostForm']")
    private WebElement uploadFilesBtn;

    @FindBy(name="bxu_files[]")
    private WebElement fileAndImageUploadBtn;

    @FindBy (id="blog-submit-button-save")
    private WebElement sendBtn;

    @FindBy (xpath = "(//*[text()='Select document from Bitrix24'])[1]")
    private WebElement bitrixSelectDocBtn;

    @FindBy (xpath = "(//div[@class='bx-file-dialog-tab-item'])[1]/*")
    private WebElement recentItemsBtn;

    @FindBy (xpath = "//div[@class='bx-file-dialog-content-wrap']//div//span//a")
    private WebElement firstFileFromRecentList;

    @FindBy (xpath = "(//div[@class='popup-window-buttons'])/*[1]")
    private WebElement selectDocButton;

    public void clickOnUploadFilesBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        String messageBtn = "//span[text()='Message']";
        WebElement tab = driver.findElement(By.xpath(messageBtn));
        wait.until(ExpectedConditions.visibilityOf(tab)).click();

        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.visibilityOf(uploadFilesBtn)).click();
        BrowserUtils.wait(5);

    }

    public void setFileAndImageUploadBtn(){
        String filePath = "/Users/mac/Desktop/Core Java Interview Questions.docx";
        BrowserUtils.wait(3);
        fileAndImageUploadBtn.sendKeys(filePath);
        BrowserUtils.wait(5);
        sendBtn.click();

    }

    public void setBitrixSelectDocBtn(){
        BrowserUtils.wait(3);
        bitrixSelectDocBtn.click();
        BrowserUtils.wait(3);
        recentItemsBtn.click();
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.visibilityOf(firstFileFromRecentList)).click();
        BrowserUtils.wait(5);
        selectDocButton.click();
        wait.until(ExpectedConditions.visibilityOf(sendBtn)).click();
    }

}













